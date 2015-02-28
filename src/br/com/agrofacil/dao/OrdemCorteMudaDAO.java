/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.dao;

import br.com.agrofacil.entity.OrdemCorteMuda;
import br.com.agrofacil.entity.TipoCorteQueima;
import br.com.agrofacil.entity.TipoPlantioColheita;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class OrdemCorteMudaDAO extends GenericDAO {

    public OrdemCorteMudaDAO() {
    }
    
    public int addOrdemCorteMuda(OrdemCorteMuda ordem) throws SQLException {
        ordem.setId(getNextId("ORDEMCORTEMUDA"));
        String sql = "INSERT INTO ORDEMCORTEMUDA VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        executeCommand(sql, ordem.getId(),
                ordem.getSafra().getId(),
                ordem.getFazenda().getId(),
                ordem.getSetor().getId(),
                ordem.getTalhao().getId(),
                ordem.getTipoCorte().toString(),                
                ordem.getVariedade().getId(),
                ordem.getTipoColheita().toString(),
                ordem.getDataOrdem(),
                ordem.getHoraOrdem(),
                ordem.getQtdAreaTotal(),
                ordem.getQtdEstTotal());
        
        return ordem.getId();
    }
    
    public void deleteOrdemCorteMuda(int id) throws SQLException {
        executeCommand("DELETE FROM ORDEMCORTEMUDA WHERE ID = ?", id);
    }
    
    public OrdemCorteMuda getOrdemCorteMuda(int id) throws SQLException {
        String sql = "SELECT * FROM ORDEMCORTEMUDA WHERE ID = ?";
        OrdemCorteMuda ordemCorteMuda = new OrdemCorteMuda();
        ResultSet rs = executeQuery(sql, id);
        if (rs.next()) {
            ordemCorteMuda = populateOrdemCorteMudaInfo(rs);
        }
        
        return ordemCorteMuda;
    }
    
    public void updateOrdemCorteMuda(OrdemCorteMuda ordemCorteMuda) throws SQLException {
        String sql = "UPDATE ORDEMCORTEMUDA SET IDSAFRA = ?,"
                + "IDFAZENDA = ?,"
                + "IDSETOR = ?"
                + "IDTALHAO = ?"
                + "TIPOCORTE = ?"
                + "IDVARIEDADE = ?"
                + "TIPOCOLHEITA = ?"
                + "DATAORDEM = ?"
                + "HORAORDEM = ?"
                + "QTDAREATOTAL = ?"
                + "QTDESTIMATIVATOTAL = ?"
                + "WHERE ID = ?";
        executeCommand(sql, ordemCorteMuda.getId());
    }

    public List<OrdemCorteMuda> getAllOrdemCorteMuda() throws SQLException {
        String sql = "SELECT * FROM ORDEMCORTEMUDA";
        List<OrdemCorteMuda> toReturn = new LinkedList<OrdemCorteMuda>();
        ResultSet rs = executeQuery(sql);
        while (rs.next()) {
            toReturn.add(populateOrdemCorteMudaInfo(rs));
        }
        
        return toReturn;
    }
    
    public OrdemCorteMuda populateOrdemCorteMudaInfo(ResultSet rs) throws SQLException {
        OrdemCorteMuda toReturn = new OrdemCorteMuda();
        FazendaDAO fazendaDAO = new FazendaDAO();
        SafraDAO safraDAO = new SafraDAO();
        SetorDAO setorDAO = new SetorDAO();
        TalhaoDAO talhaoDAO = new TalhaoDAO();
        VariedadeDAO variedadeDAO = new VariedadeDAO();
            
        toReturn.setId(rs.getInt("ID"));
        toReturn.setSafra(safraDAO.getSafra(rs.getInt("IDSAFRA")));
        toReturn.setFazenda(fazendaDAO.getFazenda(rs.getInt("IDFAZENDA")));
        toReturn.setSetor(setorDAO.getSetor(rs.getInt("IDSETOR")));
        toReturn.setTalhao(talhaoDAO.getTalhao(rs.getInt("IDTALHAO")));
        toReturn.setTipoCorte(TipoCorteQueima.valueOf(rs.getString("TIPOCORTE")));
        toReturn.setVariedade(variedadeDAO.getVariedade(rs.getInt("IDVARIEDADE")));
        toReturn.setTipoColheita(TipoPlantioColheita.valueOf(rs.getString("TIPOCOLHEITA")));
        toReturn.setDataOrdem(rs.getDate("DATAORDEM"));
        toReturn.setHoraOrdem(rs.getString("HORAORDEM"));
        toReturn.setQtdAreaTotal(rs.getFloat("QTDAREATOTAL"));
        toReturn.setQtdEstTotal(rs.getFloat("QTDESTIMATIVATOTAL"));        
        
        return toReturn;
    }
    
   public List<OrdemCorteMuda> getOrdemCorteMudaByName(String text) throws SQLException {
        String sql = "SELECT * FROM ORDEMCORTEMUDA A"
                + "INNER JOIN FAZENDA B ON (A.IDFAZENDA = B.ID) "
                + "WHERE B.DESCRICAO LIKE '%"+text+"%'";
        ResultSet rs = executeQuery(sql);
        List<OrdemCorteMuda> toReturn = new LinkedList<OrdemCorteMuda>();
        while(rs.next()) {
            toReturn.add(populateOrdemCorteMudaInfo(rs));
        }
        rs.close();
        return toReturn;
    } 
   
}
