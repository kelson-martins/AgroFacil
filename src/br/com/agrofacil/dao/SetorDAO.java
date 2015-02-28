/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.dao;

import br.com.agrofacil.entity.Setor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class SetorDAO extends GenericDAO{

    public SetorDAO() {
    }
        
    public int addSetor(Setor setor) throws SQLException {
        setor.setId(getNextId("SETOR"));
        String sql = "INSERT INTO SETOR VALUES (?,?,?,?,?,?,?)";        
        executeCommand(sql, setor.getId(), setor.getFazenda().getId(),setor.getDescricao(), setor.getCep(), setor.getAreaTotal(), setor.getAreaProdutiva(), setor.getAreaArrendamento());
        
        return setor.getId();
    }
    
    public Setor getSetor(int id) throws SQLException {
        
        Setor setor = new Setor(0,0,0);
        String sql = "SELECT * FROM SETOR WHERE ID = ?";
        ResultSet rs = executeQuery(sql, id);
        
        if (rs.next()) {
            setor = populateSetorInfo(rs);
        }
        
        return setor;
    }
    
    public void deleteSetor(int id) throws SQLException {
        String sql = "DELETE FROM SETOR WHERE ID = ?";
        executeCommand(sql, id);
    }

    public Setor populateSetorInfo(ResultSet rs) throws SQLException {
        FazendaDAO fazendaDAO = new FazendaDAO();
        
        Setor toReturn = new Setor(0,0,0);

        toReturn.setId(rs.getInt("ID"));
        toReturn.setDescricao(rs.getString("DESCRICAO"));
        toReturn.setFazenda(fazendaDAO.getFazenda(rs.getInt("IDFAZENDA")));
        toReturn.setCep(rs.getString("CEP"));
        toReturn.setAreaArrendamento(rs.getFloat("QTDAREAARREND"));
        toReturn.setAreaProdutiva(rs.getFloat("QTDAREAPROD"));
        toReturn.setAreaTotal(rs.getFloat("QTDAREATOTAL")); 
        
        return toReturn;
    }
    
    public void updateSetor(Setor setor) throws SQLException {        
        String sql = "UPDATE SETOR SET DESCRICAO = ?, IDFAZENDA = ?, CEP = ?, QTDAREATOTAL = ?, QTDAREAPROD = ?, QTDAREAARREND = ? WHERE ID = ?";
        executeCommand(sql, setor.getDescricao(), setor.getFazenda().getId(), setor.getCep(), setor.getAreaTotal(), setor.getAreaProdutiva(), setor.getAreaArrendamento(), setor.getId());
    }
    
    public List<Setor> getAllSetor() throws SQLException {
        List<Setor> toReturn = new ArrayList<Setor>();
        String sql = "SELECT * FROM SETOR";
        ResultSet rs = executeQuery(sql);
        
        while (rs.next()) {
            toReturn.add(populateSetorInfo(rs));
        }
        
        return toReturn;
    }
    
    public List<Setor> get10Setor() throws SQLException {
        List<Setor> toReturn = new ArrayList<Setor>();
        String sql = "SELECT * FROM SETOR LIMIT 10";
        ResultSet rs = executeQuery(sql);
        
        while (rs.next()) {
            toReturn.add(populateSetorInfo(rs));
        }
        
        return toReturn;
    }    
    
     public List<Setor> getSetorByName(String text) throws SQLException {
        String sql = "SELECT * FROM SETOR WHERE DESCRICAO LIKE '%"+text+"%'";
        ResultSet rs = executeQuery(sql);
        List<Setor> toReturn = new LinkedList<Setor>();
        while(rs.next()) {
            toReturn.add(populateSetorInfo(rs));
        }
        rs.close();
        return toReturn;
    }     
}
