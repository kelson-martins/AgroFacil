package br.com.agrofacil.dao;

import br.com.agrofacil.entity.Insumo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class InsumoDAO extends GenericDAO{

    public InsumoDAO() {
    }
    
    public int addInsumo(Insumo insumo) throws SQLException {
        String sql = "INSERT INTO INSUMO(ID, IDUNIDADEMEDIDA, DESCRICAO, INTERVALOSEGURANCA, OBSINTEGRACAO, ESTOCAVEL) VALUES(?,?,?,?,?,?)";
        insumo.setId(getNextId("INSUMO"));
        executeCommand(sql, insumo.getId(), insumo.getUnidadeMedida().getId(), insumo.getDescricao(), insumo.getIntervaloSeguranca(), insumo.getObsIntegracao(), insumo.isEstocavel());
        
        return insumo.getId();
    }
    
    public Insumo getInsumo(int id) throws SQLException {
        String sql = "SELECT * FROM INSUMO WHERE ID = ?";
        ResultSet rs = executeQuery(sql, id);
        Insumo insumo = new Insumo();
        if (rs.next()) {
            insumo = populateInsumoInfo(rs);
        }
        
        return insumo;
    }
    
    public void updateInsumo(Insumo insumo) throws SQLException {
        String sql = "UPDATE INSUMO SET IDUNIDADEMEDIDA = ?, DESCRICAO = ?, INTERVALOSEGURANCA = ?, OBSINTEGRACAO = ?, ESTOCAVEL = ? WHERE ID = ?";
        executeCommand(sql, insumo.getUnidadeMedida().getId(), insumo.getDescricao(), insumo.getIntervaloSeguranca(), insumo.getObsIntegracao(), insumo.isEstocavel(), insumo.getId());
    }
    
    public void deleteInsumo(int id) throws SQLException {
        executeCommand("DELETE FROM INSUMO WHERE ID = ?", id);
    }

    public Insumo populateInsumoInfo(ResultSet rs) throws SQLException {
        Insumo toReturn = new Insumo();
        UnidadeMedidaDAO unidadeMedida = new UnidadeMedidaDAO();
        
        toReturn.setId(rs.getInt("ID"));
        toReturn.setUnidadeMedida(unidadeMedida.getUnidadeMedida(rs.getInt("IDUNIDADEMEDIDA")));
        toReturn.setDescricao(rs.getString("DESCRICAO"));
        toReturn.setIntervaloSeguranca(rs.getInt("INTERVALOSEGURANCA"));
        toReturn.setObsIntegracao(rs.getString("OBSINTEGRACAO"));
        toReturn.setEstocavel(rs.getBoolean("ESTOCAVEL"));
        
        return toReturn;
    }
    
   public List<Insumo> getAllInsumo() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM INSUMO ");
        List<Insumo> toReturn = new LinkedList<Insumo>();
        while(rs.next()) {
            toReturn.add(populateInsumoInfo(rs));
        }
        rs.close();
        return toReturn;
    }
   
     public List<Insumo> getInsumoByName(String text) throws SQLException {
        String sql = "SELECT * FROM INSUMO WHERE DESCRICAO LIKE '%"+text+"%'";
        ResultSet rs = executeQuery(sql);
        List<Insumo> toReturn = new LinkedList<Insumo>();
        while(rs.next()) {
            toReturn.add(populateInsumoInfo(rs));
        }
        rs.close();
        return toReturn;
    }   
}
