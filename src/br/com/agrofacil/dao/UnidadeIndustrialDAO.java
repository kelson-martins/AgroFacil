package br.com.agrofacil.dao;

import br.com.agrofacil.entity.UnidadeIndustrial;
import br.com.agrofacil.entity.Variedade;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class UnidadeIndustrialDAO extends GenericDAO{

    public UnidadeIndustrialDAO() {
    }
    
    public int addUnidadeIndustrial(UnidadeIndustrial unidadeIndustrial) throws SQLException {
        unidadeIndustrial.setId(getNextId("UNIDADEINDUSTRIAL"));
        String sql = "INSERT INTO UNIDADEINDUSTRIAL(ID,DESCRICAO,IDMUNICIPIO) VALUES(?,?,?)";
        executeCommand(sql, unidadeIndustrial.getId(), unidadeIndustrial.getDescricao(), unidadeIndustrial.getMunicipio().getId());
        return unidadeIndustrial.getId();
    }
    
   public UnidadeIndustrial getUnidadeIndustrial(int id) throws SQLException {
       String sql = "SELECT * FROM UNIDADEINDUSTRIAL WHERE ID = ?";
       ResultSet rs = executeQuery(sql, id);
       UnidadeIndustrial unidadeIndustrial = new UnidadeIndustrial();
       if(rs.next()) {
           unidadeIndustrial = populateUnidadeIndustrialInfo(rs);
       }
       rs.close();
       
       return unidadeIndustrial;       
   }

   public void updateUnidadeIndustrial(UnidadeIndustrial unidadeIndustrial) throws SQLException {
       String sql = "UPDATE UNIDADEINDUSTRIAL SET DESCRICAO = ?, IDMUNICIPIO = ? WHERE ID = ?";
       executeCommand(sql, unidadeIndustrial.getDescricao(), unidadeIndustrial.getMunicipio().getId(), unidadeIndustrial.getId());       
   }
   
   
   public void removeUnidadeIndustrial(int id) throws SQLException {
       executeCommand("DELETE FROM UNIDADEINDUSTRIAL WHERE ID = ?", id);
   }
   
   public UnidadeIndustrial populateUnidadeIndustrialInfo(ResultSet rs) throws SQLException {
        UnidadeIndustrial toReturn = new UnidadeIndustrial();
        MunicipioDAO municipioDAO = new MunicipioDAO();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setDescricao(rs.getString("DESCRICAO"));
        toReturn.setMunicipio(municipioDAO.getMunicipio(rs.getInt("IDMUNICIPIO")));
        
        return toReturn;
    }
   
      public List<UnidadeIndustrial> getAllUnidadeIndustrial() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM UNIDADEINDUSTRIAL ");
        List<UnidadeIndustrial> toReturn = new LinkedList<>();
        while(rs.next()) {
            toReturn.add(populateUnidadeIndustrialInfo(rs));
        }
        rs.close();
        return toReturn;
    }
}
