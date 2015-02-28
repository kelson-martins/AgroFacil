package br.com.agrofacil.dao;

import br.com.agrofacil.entity.Operacao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class OperacaoDAO extends GenericDAO{

    public OperacaoDAO() {
    }
    
    public int addOperacao(Operacao operacao) throws SQLException {
        operacao.setId(getNextId("OPERACAO"));
        String sql = "INSERT INTO OPERACAO(ID,DESCRICAO,IDUNIDADEMEDIDA) VALUES(?,?,?)";
        executeCommand(sql, operacao.getId(), operacao.getDescricao(), operacao.getUnidadeMedida().getId());
        return operacao.getId();
    }
    
    public Operacao getOperacao(int id) throws SQLException {
        String sql = "SELECT * FROM OPERACAO WHERE ID = ?";
        ResultSet rs = executeQuery(sql, id);
        Operacao operacao = null;
        if(rs.next()) {
            operacao = populateOperacaoInfo(rs);
        }
        rs.close();
        
        return operacao;
    }

    public void updateOperacao(Operacao operacao) throws SQLException {
        String sql = "UPDATE OPERACAO SET DESCRICAO = ?, IDUNIDADEMEDIDA = ? WHERE ID = ?";
        executeCommand(sql, operacao.getDescricao(), operacao.getUnidadeMedida().getId(), operacao.getId());
    }
    
    public void deleteOperacao(int id) throws SQLException {
        executeCommand("DELETE FROM OPERACAO WHERE ID = ?", id);
    }
    
    public Operacao populateOperacaoInfo(ResultSet rs) throws SQLException {
        UnidadeMedidaDAO unidadeMedidaDAO = new UnidadeMedidaDAO();
        Operacao toReturn = new Operacao();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setDescricao(rs.getString("DESCRICAO"));
        toReturn.setUnidadeMedida(unidadeMedidaDAO.getUnidadeMedida(rs.getInt("IDUNIDADEMEDIDA")));
        
        return toReturn;
    }
    
        public List<Operacao> getAllOperacao() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM OPERACAO");
        List<Operacao> toReturn = new LinkedList<>();
        while(rs.next()) {
            toReturn.add(populateOperacaoInfo(rs));
        }
        rs.close();
        return toReturn;
    }
        
        public List<Operacao> get10Operacao() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM OPERACAO LIMIT 10");
        List<Operacao> toReturn = new LinkedList<>();
        while(rs.next()) {
            toReturn.add(populateOperacaoInfo(rs));
        }
        rs.close();
        return toReturn;
    }        
        
     public List<Operacao> getOperacaoByName(String text) throws SQLException {
        String sql = "SELECT * FROM OPERACAO WHERE DESCRICAO LIKE '%"+text+"%'";
        ResultSet rs = executeQuery(sql);
        List<Operacao> toReturn = new LinkedList<Operacao>();
        while(rs.next()) {
            toReturn.add(populateOperacaoInfo(rs));
        }
        rs.close();
        return toReturn;
    }         
}
