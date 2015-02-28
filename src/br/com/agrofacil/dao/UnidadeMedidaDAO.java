package br.com.agrofacil.dao;

import br.com.agrofacil.entity.Municipio;
import br.com.agrofacil.entity.UnidadeMedida;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class UnidadeMedidaDAO extends GenericDAO{

    public UnidadeMedidaDAO() {
    }
   
    public int addUnidadeMedida(UnidadeMedida unidadeMedida) throws SQLException{
        unidadeMedida.setId(getNextId("UNIDADEMEDIDA"));
        
        String query = "INSERT INTO UNIDADEMEDIDA(ID, DESCRICAO) values (?, ?)";
        executeCommand(query, unidadeMedida.getId(), unidadeMedida.getDescricao() );
        return unidadeMedida.getId();
    }
    
    
    public void removeUnidadeMedida(int idUnidadeMedida) throws SQLException {
        executeCommand("DELETE FROM UNIDADEMEDIDA WHERE ID = ?", idUnidadeMedida);
    }
    
    public void updateUnidadeMedida(UnidadeMedida um) throws SQLException {
        String sql = "UPDATE UNIDADEMEDIDA SET DESCRICAO = ? WHERE ID = ?";
        executeCommand(sql, um.getDescricao(), um.getId());
        
    }
       
    public UnidadeMedida getUnidadeMedida(int idUnidadeMedida) throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM UNIDADEMEDIDA WHERE ID = ?", idUnidadeMedida);
        UnidadeMedida um = null;
        if(rs.next()) {
            um = populateUnidadeMedidaInfo(rs);
        }
        
        rs.close();           
        
        return um;
    }
    
    public static UnidadeMedida populateUnidadeMedidaInfo(ResultSet rs) throws SQLException {
        UnidadeMedida toReturn = new UnidadeMedida();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setDescricaoUnidade(rs.getString("DESCRICAO"));
        return toReturn;
    }
    
   public List<UnidadeMedida> getAllUnidadeMedida() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM UNIDADEMEDIDA ");
        List<UnidadeMedida> toReturn = new LinkedList<UnidadeMedida>();
        while(rs.next()) {
            toReturn.add(populateUnidadeMedidaInfo(rs));
        }
        rs.close();
        return toReturn;
    }
   
    public List<UnidadeMedida> getUnidadeMedidaByName(String text) throws SQLException {
        String sql = "SELECT * FROM UNIDADEMEDIDA WHERE DESCRICAO LIKE '%"+text+"%'";
        ResultSet rs = executeQuery(sql);
        List<UnidadeMedida> toReturn = new LinkedList<UnidadeMedida>();
        while(rs.next()) {
            toReturn.add(populateUnidadeMedidaInfo(rs));
        }
        rs.close();
        return toReturn;
    }
}
