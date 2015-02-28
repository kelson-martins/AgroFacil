package br.com.agrofacil.dao;

import br.com.agrofacil.entity.Espacamento;
import br.com.agrofacil.entity.Safra;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class EspacamentoDAO extends GenericDAO {
    
    public EspacamentoDAO() {
        
    }
    
    public int addEspacamento(Espacamento espacamento) throws SQLException {
        espacamento.setId(getNextId("ESPACAMENTO"));
        String sql = "INSERT INTO ESPACAMENTO(ID, DESCRICAO, METROS, QNTRUASCANA) VALUES (?, ?, ?, ?)";
        executeCommand(sql, espacamento.getId(), espacamento.getDescricao(), espacamento.getMetros(), espacamento.getQntRuasCana());        
        return espacamento.getId();
    }
    
    public Espacamento getEspacamento(int idEspacamento) throws SQLException {
        String sql = "SELECT * FROM ESPACAMENTO WHERE ID = ?";
        ResultSet rs = executeQuery(sql, idEspacamento);;
        Espacamento espacamento = null;
        if(rs.next()) {
            espacamento = populateEspacamentoInfo(rs);
        }
        rs.close();
        
        return espacamento;
    }
    
    public void updateEspacamento(Espacamento espacamento) throws SQLException {
        String sql = "UPDATE ESPACAMENTO SET DESCRICAO = ?, METROS = ?, QNTRUASCANA = ? WHERE ID = ?";
        executeCommand(sql, espacamento.getDescricao(), espacamento.getMetros(), espacamento.getQntRuasCana(), espacamento.getId());        
    }
    
    public void removeEspacamento(int idEspacamento) throws SQLException {
        executeCommand("DELETE FROM ESPACAMENTO WHERE ID = ?", idEspacamento);
    }
    
    public Espacamento populateEspacamentoInfo(ResultSet rs) throws SQLException {
        Espacamento toReturn = new Espacamento();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setDescricao(rs.getString("DESCRICAO"));
        toReturn.setMetrosEspacamento(rs.getFloat("METROS"));
        toReturn.setQntRuasCana(rs.getFloat("QNTRUASCANA"));
        
        return toReturn;
    }
    
        public List<Espacamento> getAllEspacamento() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM ESPACAMENTO ");
        List<Espacamento> toReturn = new LinkedList<Espacamento>();
        while(rs.next()) {
            toReturn.add(populateEspacamentoInfo(rs));
        }
        rs.close();
        return toReturn;
    }
    
     public List<Espacamento> getEspacamentoByName(String text) throws SQLException {
        String sql = "SELECT * FROM ESPACAMENTO WHERE DESCRICAO LIKE '%"+text+"%'";
        ResultSet rs = executeQuery(sql);
        List<Espacamento> toReturn = new LinkedList<Espacamento>();
        while(rs.next()) {
            toReturn.add(populateEspacamentoInfo(rs));
        }
        rs.close();
        return toReturn;
    }        
}
