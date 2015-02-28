package br.com.agrofacil.dao;

import br.com.agrofacil.entity.Safra;
import br.com.agrofacil.entity.UnidadeMedida;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class SafraDAO extends GenericDAO{

    public SafraDAO() {
    }
    
    public int addSafra(Safra safra) throws SQLException {
        safra.setId(getNextId("SAFRA"));
        
        String query = "INSERT INTO SAFRA(ID,DATAINICIOSAFRA,DATAFIMSAFRA,DATAINICIOMOAGEM,DATAFIMMOAGEM) VALUES(?,?,?,?,?)";
        executeCommand(query, safra.getId(), safra.getDataInicioSafra(), safra.getDataFimSafra(), safra.getDataInicioMoagem(), safra.getDataFimMoagem());
        return safra.getId();
    }
    
        public Safra getSafra(int idSafra) throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM SAFRA WHERE ID = ?", idSafra);
        Safra safra = null;
        while(rs.next()) {
            safra = populateSafraInfo(rs);
        }
        
        rs.close();
        
        return safra;
    }
    
    public void updateSafra(Safra safra) throws SQLException {
        String sql = "UPDATE SAFRA SET DATAINICIOSAFRA = ?, DATAFIMSAFRA = ?, DATAINICIOMOAGEM = ?, DATAFIMMOAGEM = ? WHERE ID = ?";
        executeCommand(sql, safra.getDataInicioSafra(), safra.getDataFimSafra(), safra.getDataInicioMoagem(), safra.getDataFimMoagem(), safra.getId());
    }    
        
        
    public void removeSafra(int idSafra) throws SQLException {
        executeCommand("DELETE FROM SAFRA WHERE ID = ?", idSafra);
    }
    
        public static Safra populateSafraInfo(ResultSet rs) throws SQLException {
        Safra toReturn = new Safra();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setDataInicioSafra(rs.getDate("DATAINICIOSAFRA"));
        toReturn.setDataFimSafra(rs.getDate("DATAFIMSAFRA"));
        toReturn.setDataInicioMoagem(rs.getDate("DATAINICIOMOAGEM"));
        toReturn.setDataFimMoagem(rs.getDate("DATAFIMMOAGEM"));
        return toReturn;
    }
        
    public List<Safra> getAllSafra() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM SAFRA ");
        List<Safra> toReturn = new LinkedList<Safra>();
        while(rs.next()) {
            toReturn.add(populateSafraInfo(rs));
        }
        rs.close();
        return toReturn;
    }
}
