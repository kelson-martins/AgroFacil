package br.com.agrofacil.dao;

import static br.com.agrofacil.dao.SafraDAO.populateSafraInfo;
import br.com.agrofacil.entity.Safra;
import br.com.agrofacil.entity.Variedade;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class VariedadeDAO extends GenericDAO {
    
    public VariedadeDAO() {
        
    }
    
    public int addVariedade(Variedade variedade) throws SQLException {
        variedade.setId(getNextId("VARIEDADE"));
        String sql = "INSERT INTO VARIEDADE(ID, DESCRICAO, MATURADA, MESINICOLHEITA, MESFIMCOLHEITA) VALUES(?, ?, ?, ?, ?)";
        executeCommand(sql, variedade.getId(), variedade.getDescricao(), variedade.isMaturada(), variedade.getMesIniColheita(), variedade.getMesFimColheita());
        
        return variedade.getId();
    }
    
    public Variedade getVariedade(int idVariedade) throws SQLException {
        Variedade variedade = null;
        String sql = "SELECT * FROM VARIEDADE WHERE ID = ?";
        ResultSet rs = executeQuery(sql, idVariedade);
        if(rs.next()) {
            variedade = populateVariedadeInfo(rs);
        }
        rs.close();
        return variedade;
    }
     
    public void updateVariedade(Variedade variedade) throws SQLException {
        String sql = "UPDATE VARIEDADE SET DESCRICAO = ?, MATURADA = ?, MESINICOLHEITA = ?, MESFIMCOLHEITA = ? WHERE ID = ?";
        executeCommand(sql, variedade.getDescricao(), variedade.isMaturada(), variedade.getMesIniColheita(), variedade.getMesFimColheita(), variedade.getId());
    }
    
    public void deleteVariedade(int idVariedade) throws SQLException {
        executeCommand("DELETE FROM VARIEDADE WHERE ID = ?", idVariedade);
    }

    public Variedade populateVariedadeInfo(ResultSet rs) throws SQLException {
        Variedade toReturn = new Variedade();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setDescricao(rs.getString("DESCRICAO"));
        toReturn.setMaturada(rs.getBoolean("MATURADA"));
        toReturn.setMesIniColheita(rs.getInt("MESINICOLHEITA"));
        toReturn.setMesFinColheita(rs.getInt("MESFIMCOLHEITA"));
        
        return toReturn;
    }

   public List<Variedade> getAllVariedade() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM VARIEDADE ");
        List<Variedade> toReturn = new LinkedList<Variedade>();
        while(rs.next()) {
            toReturn.add(populateVariedadeInfo(rs));
        }
        rs.close();
        return toReturn;
    }
    
     public List<Variedade> getVariedadeByName(String text) throws SQLException {
        String sql = "SELECT * FROM VARIEDADE WHERE DESCRICAO LIKE '%"+text+"%'";
        ResultSet rs = executeQuery(sql);
        List<Variedade> toReturn = new LinkedList<Variedade>();
        while(rs.next()) {
            toReturn.add(populateVariedadeInfo(rs));
        }
        rs.close();
        return toReturn;
    }
}
