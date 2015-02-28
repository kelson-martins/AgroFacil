package br.com.agrofacil.dao;

import br.com.agrofacil.entity.Composicao;
import br.com.agrofacil.entity.Safra;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class ComposicaoDAO extends GenericDAO{
    
    public ComposicaoDAO() {
        
    }
    
    public int addComposicao(Composicao composicao) throws SQLException {
        composicao.setId(getNextId("COMPOSICAO"));
        String sql = "INSERT INTO COMPOSICAO(ID, DESCRICAO, VOLUMESTOTAIS) VALUES(?, ?, ?)";
        executeCommand(sql, composicao.getId(), composicao.getDescricao(), composicao.getVolumesTotais());        
        return composicao.getId();
    }
    
    public Composicao getComposicao(int idComposicao) throws SQLException {
        String sql = "SELECT * FROM COMPOSICAO WHERE ID = ?";
        ResultSet rs = executeQuery(sql, idComposicao);
        Composicao composicao = null;
        if (rs.next()) {
            composicao = populateComposicaoInfo(rs);
        }
        rs.close();
        
        return composicao;
    }
    
    public void updateComposicao(Composicao composicao) throws SQLException {
        String sql = "UPDATE COMPOSICAO SET DESCRICAO = ?, VOLUMESTOTAIS = ? WHERE ID = ?";
        executeCommand(sql, composicao.getDescricao(), composicao.getVolumesTotais(), composicao.getId());
    }
    
    public void deleteComposicao(int idComposicao) throws SQLException {
        executeCommand("DELETE FROM COMPOSICAO WHERE ID = ?", idComposicao);
    }
    
    public Composicao populateComposicaoInfo(ResultSet rs) throws SQLException {
        Composicao toReturn = new Composicao();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setDescricao(rs.getString("DESCRICAO"));
        toReturn.setVolumesTotais(rs.getInt("VOLUMESTOTAIS"));
        
        return toReturn;
    }
    
    public List<Composicao> getAllUnidadeMedida() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM COMPOSICAO ");
        List<Composicao> toReturn = new LinkedList<Composicao>();
        while(rs.next()) {
            toReturn.add(populateComposicaoInfo(rs));
        }
        rs.close();
        return toReturn;
    }
}
