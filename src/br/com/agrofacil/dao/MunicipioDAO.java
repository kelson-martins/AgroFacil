package br.com.agrofacil.dao;

import br.com.agrofacil.entity.Municipio;
import br.com.agrofacil.entity.UnidadeFederativa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class MunicipioDAO extends GenericDAO{

    public MunicipioDAO() {
    }
    
    public int addMinicipio(Municipio municipio) throws SQLException {
        municipio.setId(getNextId("MUNICIPIO"));
        String sql = "INSERT INTO MUNICIPIO(ID,NOME,UF) VALUES(?,?,?)";
        executeCommand(sql, municipio.getId(), municipio.getNome(), municipio.getUf().toString());
        return municipio.getId();
    }
    
    public Municipio getMunicipio(int idMunicipio) throws SQLException {
        String sql = "SELECT * FROM MUNICIPIO WHERE ID = ?";
        ResultSet rs = executeQuery(sql, idMunicipio);
        Municipio municipio = null;
        if(rs.next()) {
            municipio = populateMunicipioInfo(rs);
        }
        rs.close();
        
        return municipio;
    }
    
    public void updateMunicipio(Municipio municipio) throws SQLException {
        String sql = "UPDATE MUNICIPIO SET NOME = ?, UF = ? WHERE ID = ?";
        executeCommand(sql, municipio.getNome(), municipio.getUf().toString(), municipio.getId());
    }

    public Municipio populateMunicipioInfo(ResultSet rs) throws SQLException {
        Municipio toReturn = new Municipio();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setNome(rs.getString("NOME"));
        toReturn.setUf(UnidadeFederativa.valueOf(rs.getString("UF")));
        return toReturn;
    }
    
    public void deleteMunicipio(int idMunicipio) throws SQLException {
        executeCommand("DELETE FROM MUNICIPIO WHERE ID = ?", idMunicipio);
    }
    
    public List<Municipio> getAllMunicipio() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM MUNICIPIO ");
        List<Municipio> toReturn = new LinkedList<Municipio>();
        while(rs.next()) {
            toReturn.add(populateMunicipioInfo(rs));
        }
        rs.close();
        return toReturn;
    }
    
     public List<Municipio> getMunicipioByName(String text) throws SQLException {
        String sql = "SELECT * FROM MUNICIPIO WHERE NOME LIKE '%"+text+"%'";
        ResultSet rs = executeQuery(sql);
        List<Municipio> toReturn = new LinkedList<Municipio>();
        while(rs.next()) {
            toReturn.add(populateMunicipioInfo(rs));
        }
        rs.close();
        return toReturn;
    }
        
}
