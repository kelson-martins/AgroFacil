package br.com.agrofacil.dao;

import br.com.agrofacil.entity.EnumAcao;
import br.com.agrofacil.entity.EnumNivel;
import br.com.agrofacil.entity.Perfil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class PerfilDAO extends GenericDAO {

    public PerfilDAO() {
    }
    
    public int addPerfil(Perfil perfil) throws SQLException {
        String sql = "INSERT INTO PERFIL VALUES (?,?,?,?,?,?)";
        perfil.setId(getNextId("PERFIL"));
        executeCommand(sql, 
                perfil.getId(),
                perfil.getDescricao(),
                perfil.getCodigoApp(),
                perfil.getCodigoMenu(),
                perfil.getNivel().toString(),
                perfil.getAcao().toString());
        
        return perfil.getId();
    }
    
    public void deletePerfil(int id) throws SQLException {
        executeCommand("DELETE FROM PERFIL WHERE ID = ?", id);
    }
    
    public Perfil getPerfil(int id) throws SQLException {
        Perfil perfil = new Perfil();
        String sql = "SELECT * FROM PERFIL WHERE ID = ?";
        ResultSet rs = executeQuery(sql, id);
        if (rs.next()) {
            perfil = populatePerfilInfo(rs);
        }
        
        return perfil;
    }

    public List<Perfil> getAllPerfil() throws SQLException {
        List<Perfil> perfis = new LinkedList<Perfil>();
        String sql = "SELECT * FROM PERFIL";
        ResultSet rs = executeQuery(sql);
        while(rs.next()) {
            perfis.add(populatePerfilInfo(rs));
        }
        
        return perfis;
    }
    public Perfil populatePerfilInfo(ResultSet rs) throws SQLException {
        Perfil toReturn = new Perfil();
        
        toReturn.setId(rs.getInt("ID"));
        toReturn.setDescricao(rs.getString("DESCRICAO"));
        toReturn.setCodigoApp(rs.getString("CODIGOAPP"));
        toReturn.setCodigoMenu(rs.getString("CODIGOMENU"));
        toReturn.setNivel(EnumNivel.valueOf(rs.getString("NIVEL")));
        toReturn.setAcao(EnumAcao.valueOf(rs.getString("ACAO")));
        
        return toReturn;
    }
}
