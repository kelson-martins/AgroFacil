/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.dao;

import br.com.agrofacil.entity.Empresa;
import br.com.agrofacil.entity.Equipamento;
import br.com.agrofacil.entity.UnidadeFederativa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class EquipamentoDAO extends GenericDAO{

    public EquipamentoDAO() {
    }
    
    public int addEquipamento(Equipamento equipamento) throws SQLException {
        equipamento.setId(getNextId("EQUIPAMENTO"));
        String sql = "INSERT INTO EQUIPAMENTO(ID, ANOFABRICACAO, IDCENTROCUSTO, DISPONIVEL, PLACA, CHASSI, IDFRENTETRANSPORTE, IDCOMPOSICAO, ANOMODELO, DATAAQUISICAO, UNIDADEFEDERATIVA, DESCRICAOMODELO) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        executeCommand(sql, equipamento.getId(), equipamento.getAnoFabricacao(), equipamento.getCentroCusto().getId(), equipamento.isDisponivel(), equipamento.getPlaca(), equipamento.getChassi(), equipamento.getFrenteTransporte().getId(), equipamento.getComposicao().getId(), equipamento.getAnoModelo(), equipamento.getDataAquisicao(), equipamento.getUf().toString(), equipamento.getModelo());
        return equipamento.getId();
    }
    
    public Equipamento getEquipamento(int id) throws SQLException {
        String sql = "SELECT * FROM EQUIPAMENTO WHERE ID = ?";
        ResultSet rs = executeQuery(sql, id);
        Equipamento equipamento = new Equipamento();
        if ( rs.next() ) {
            equipamento = populateEquipamentoInfo(rs);
        }
        rs.close();
        return equipamento;
    }

    public Equipamento populateEquipamentoInfo(ResultSet rs) throws SQLException {
        Equipamento toReturn = new Equipamento();
        
        CentroCustoDAO centroCustoDAO = new CentroCustoDAO();
        FrenteTransporteDAO frenteTransporteDAO = new FrenteTransporteDAO();
        ComposicaoDAO composicaoDAO = new ComposicaoDAO();
        
        toReturn.setId(rs.getInt("ID"));
        toReturn.setAnoFabricacao(rs.getInt("ANOFABRICACAO"));
        toReturn.setCentroCusto(centroCustoDAO.getCentroCusto(rs.getInt("IDCENTROCUSTO")));
        toReturn.setDisponivel(rs.getBoolean("DISPONIVEL"));
        toReturn.setPlaca(rs.getString("PLACA"));
        toReturn.setChassi(rs.getString("CHASSI"));
        toReturn.setFrenteTransporte(frenteTransporteDAO.getFrenteTransporte(rs.getInt("IDFRENTETRANSPORTE")));
        toReturn.setComposicao(composicaoDAO.getComposicao(rs.getInt("IDCOMPOSICAO")));
        toReturn.setAnoModelo(rs.getInt("ANOMODELO"));
        toReturn.setDataAquisicao(rs.getDate("DATAAQUISICAO"));
        toReturn.setUf(UnidadeFederativa.valueOf(rs.getString("UNIDADEFEDERATIVA")));
        toReturn.setModelo(rs.getString("DESCRICAOMODELO"));
        
        return toReturn;
    }
    
    public void deleteEquipamento(int id) throws SQLException {
        executeCommand("DELETE FROM EQUIPAMENTO WHERE ID = ?", id);
    }
    
    public void updateEquipamento(Equipamento equipamento) throws SQLException {
        String sql = "UPDATE EQUIPAMENTO SET ANOFABRICACAO = ?, IDCENTROCUSTO = ?, DISPONIVEL = ?, PLACA = ?, CHASSI = ?, IDFRENTETRANSPORTE = ?, IDCOMPOSICAO = ?, ANOMODELO = ?, DATAAQUISICAO = ?, UNIDADEFEDERATIVA = ?, DESCRICAOMODELO = ? WHERE ID = ?";
        executeCommand(sql, equipamento.getAnoFabricacao(), equipamento.getCentroCusto().getId(), equipamento.isDisponivel(), equipamento.getPlaca(),equipamento.getChassi(), equipamento.getFrenteTransporte().getId(), equipamento.getComposicao().getId(),equipamento.getAnoModelo(),equipamento.getDataAquisicao(),equipamento.getUf().toString(),equipamento.getModelo(),equipamento.getId());
    }
    
    public List<Equipamento> getAllEquipamento() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM EQUIPAMENTO ");
        List<Equipamento> toReturn = new LinkedList<Equipamento>();
        while(rs.next()) {
            toReturn.add(populateEquipamentoInfo(rs));
        }
        rs.close();
        return toReturn;
    }  
    
    public List<Equipamento> get10Equipamento() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM EQUIPAMENTO LIMIT 10");
        List<Equipamento> toReturn = new LinkedList<Equipamento>();
        while(rs.next()) {
            toReturn.add(populateEquipamentoInfo(rs));
        }
        rs.close();
        return toReturn;
    }     
    
     public List<Equipamento> getEquipamentoByName(String text) throws SQLException {
        String sql = "SELECT * FROM EQUIPAMENTO WHERE DESCRICAOMODELO LIKE '%"+text+"%'";
        ResultSet rs = executeQuery(sql);
        List<Equipamento> toReturn = new LinkedList<Equipamento>();
        while(rs.next()) {
            toReturn.add(populateEquipamentoInfo(rs));
        }
        rs.close();
        return toReturn;
    }     
}
