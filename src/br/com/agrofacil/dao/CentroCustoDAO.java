package br.com.agrofacil.dao;

import br.com.agrofacil.entity.CentroCusto;
import br.com.agrofacil.entity.Municipio;
import br.com.agrofacil.entity.TipoCusto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class CentroCustoDAO extends GenericDAO{

    public CentroCustoDAO() {
    }
    
    public int addCentroCusto(CentroCusto centroCusto) throws SQLException {
        centroCusto.setId(getNextId("CENTROCUSTO"));
        String sql = "INSERT INTO CENTROCUSTO(ID,DESCRICAO,TIPO,IDINTERFACEERP) VALUES(?,?,?,?)";
        executeCommand(sql, centroCusto.getId(), centroCusto.getDescricao(), centroCusto.getTipoCentroCusto().toString(), centroCusto.getIdInterfaceErp());
        
        return centroCusto.getId();
    }
    
    public CentroCusto getCentroCusto(int id) throws SQLException {
        CentroCusto centroCusto = null;
        String sql = "SELECT * FROM CENTROCUSTO WHERE ID = ?";
        ResultSet rs = executeQuery(sql, id);
        if(rs.next()) {
            centroCusto = populateCentroCustoInfo(rs);
        }
        rs.close();
        
        return centroCusto;
    }

    public void updateCentroCusto(CentroCusto centroCusto) throws SQLException {
        String sql = "UPDATE CENTROCUSTO SET DESCRICAO = ?, TIPO = ?, IDINTERFACEERP = ? WHERE ID = ?";
        executeCommand(sql, centroCusto.getDescricao(), centroCusto.getTipoCentroCusto().toString(), centroCusto.getIdInterfaceErp(), centroCusto.getId());        
    }
    
    public void deleteCentroCusto(int id) throws SQLException {
        executeCommand("DELETE FROM CENTROCUSTO WHERE ID = ?", id);
    }
    
    public CentroCusto populateCentroCustoInfo(ResultSet rs) throws SQLException {
        CentroCusto toReturn = new CentroCusto();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setDescricao(rs.getString("DESCRICAO"));
        toReturn.setTipoCentroCusto(TipoCusto.valueOf(rs.getString("TIPO")));
        toReturn.setIdInterfaceErp(rs.getString("IDINTERFACEERP"));
        
        return toReturn;
    }
    
    public List<CentroCusto> getAllCentroCusto() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM CENTROCUSTO ");
        List<CentroCusto> toReturn = new LinkedList<CentroCusto>();
        while(rs.next()) {
            toReturn.add(populateCentroCustoInfo(rs));
        }
        rs.close();
        return toReturn;
    }    
    
        public List<CentroCusto> getAllCentro() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM CENTROCUSTO ");
        List<CentroCusto> toReturn = new LinkedList<CentroCusto>();
        while(rs.next()) {
            toReturn.add(populateCentroCustoInfo(rs));
        }
        rs.close();
        return toReturn;
    }
        
   public List<CentroCusto> get10Centro() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM CENTROCUSTO LIMIT 10");
        List<CentroCusto> toReturn = new LinkedList<CentroCusto>();
        while(rs.next()) {
            toReturn.add(populateCentroCustoInfo(rs));
        }
        rs.close();
        return toReturn;
    }
    
     public List<CentroCusto> getCentroByName(String text) throws SQLException {
        String sql = "SELECT * FROM CENTROCUSTO WHERE DESCRICAO LIKE '%"+text+"%'";
        ResultSet rs = executeQuery(sql);
        List<CentroCusto> toReturn = new LinkedList<CentroCusto>();
        while(rs.next()) {
            toReturn.add(populateCentroCustoInfo(rs));
        }
        rs.close();
        return toReturn;
    }
}
