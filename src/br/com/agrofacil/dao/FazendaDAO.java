/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.dao;

import br.com.agrofacil.entity.Fazenda;
import br.com.agrofacil.entity.TipoPessoa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class FazendaDAO extends GenericDAO {

    public FazendaDAO() {
    }
    
    public int addFazenda(Fazenda fazenda) throws SQLException {
        fazenda.setId(getNextId("FAZENDA"));
        String sql = "INSERT INTO FAZENDA VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        executeCommand(sql, fazenda.getId(), fazenda.getMunicipio().getId(),fazenda.getDescricao(), fazenda.getEndereco(),fazenda.getTelefone(), fazenda.getCpfcgc(), fazenda.getInscricaoIncra(), fazenda.getInscricaoProdutor(),fazenda.getCep(), fazenda.getTipoPessoa().toString(), fazenda.isFunrual(), fazenda.getAreaTotal(), fazenda.getAreaProdutiva(), fazenda.getAreaArrendamento(), fazenda.getRazaoSocialFundo(), fazenda.getImovelReceita(), fazenda.getQtdAreaMat(), fazenda.getCnpjPesFis());        
        return fazenda.getId();
    }
    
    public Fazenda getFazenda(int id) throws SQLException {        
        ResultSet rs = executeQuery("SELECT * FROM FAZENDA WHERE ID = ?", id);
        Fazenda fazenda = new Fazenda(0, 0, 0);
        if ( rs.next() ) {
            fazenda = populateFazendaInfo(rs);
        }
        rs.close();        
        return fazenda;
    }
    
    public void deleteFazenda(int id) throws SQLException {
        String sql = "DELETE FROM FAZENDA WHERE ID = ?";
        executeCommand(sql, id);        
    }
    
    public void updateFazenda(Fazenda fazenda) throws SQLException {
        String sql = "UPDATE FAZENDA SET IDMUNICIPIO = ?, DESCRICAO = ?, ENDERECO = ?, TELEFONE = ?, CGC = ?, INSCRICAOINCRA = ?, INSCRICAOPROD = ?, CEP = ?, TIPOPESSOA = ?, FUNRUAL = ?, QTDAREATOTAL = ?, QTDAREAPROD = ?, QTDAREAARREND = ?, RAZAOFUNDO = ?, IMOVELRECEITA = ?, QTDAREAMAT = ?, CNPJPESFIS = ? WHERE ID = ?";
        executeCommand(sql, fazenda.getMunicipio().getId(), fazenda.getDescricao(), fazenda.getEndereco(), fazenda.getTelefone(), fazenda.getCpfcgc(), fazenda.getInscricaoIncra(), fazenda.getInscricaoProdutor(), fazenda.getCep(), fazenda.getTipoPessoa().toString(), fazenda.isFunrual(), fazenda.getAreaTotal(), fazenda.getAreaProdutiva(), fazenda.getAreaArrendamento(),fazenda.getRazaoSocialFundo(),fazenda.getImovelReceita(),fazenda.getQtdAreaMat(),fazenda.getCnpjPesFis(), fazenda.getId());
    }
    
    public List<Fazenda> getAllFazenda() throws SQLException {
        List<Fazenda> toReturn = new LinkedList<Fazenda>();
        String sql = "SELECT * FROM FAZENDA";
        ResultSet rs = executeQuery(sql);
        while ( rs.next() ) {
            toReturn.add(populateFazendaInfo(rs));
        }
        return toReturn;
    }

    
    public List<Fazenda> get10Fazenda() throws SQLException {
        List<Fazenda> toReturn = new LinkedList<Fazenda>();
        String sql = "SELECT * FROM FAZENDA LIMIT 10";
        ResultSet rs = executeQuery(sql);
        while ( rs.next() ) {
            toReturn.add(populateFazendaInfo(rs));
        }
        return toReturn;
    }
    
    public Fazenda populateFazendaInfo(ResultSet rs) throws SQLException {
        Fazenda toReturn = new Fazenda(0,0,0);
        MunicipioDAO municipioDAO = new MunicipioDAO();
        
        toReturn.setId(rs.getInt("ID"));
        toReturn.setMunicipio(municipioDAO.getMunicipio(rs.getInt("IDMUNICIPIO")));
        toReturn.setDescricao(rs.getString("DESCRICAO"));
        toReturn.setEndereco(rs.getString("ENDERECO"));
        toReturn.setTelefone(rs.getString("Telefone"));
        toReturn.setCpfcgc(rs.getString("CGC"));
        toReturn.setInscricaoIncra(rs.getString("INSCRICAOINCRA"));
        toReturn.setInscricaoProdutor(rs.getString("INSCRICAOPROD"));
        toReturn.setCep(rs.getString("CEP"));
        toReturn.setTipoPessoa(TipoPessoa.valueOf(rs.getString("TIPOPESSOA")));
        toReturn.setFunrual(rs.getBoolean("FUNRUAL"));
        toReturn.setAreaTotal(rs.getFloat("QTDAREAPROD"));
        toReturn.setAreaProdutiva(rs.getFloat("QTDAREAPROD"));
        toReturn.setAreaArrendamento(rs.getFloat("QTDAREAARREND"));
        toReturn.setRazaoSocialFundo(rs.getString("RAZAOFUNDO"));
        toReturn.setImovelReceita(rs.getString("IMOVELRECEITA"));
        toReturn.setQtdAreaMat(rs.getFloat(("QTDAREAMAT")));
        toReturn.setCnpjPesFis(rs.getString("CNPJPESFIS"));
        
        return toReturn;
    }
    
     public List<Fazenda> getFazendaByName(String text) throws SQLException {
        String sql = "SELECT * FROM FAZENDA WHERE DESCRICAO LIKE '%"+text+"%'";
        ResultSet rs = executeQuery(sql);
        List<Fazenda> toReturn = new LinkedList<Fazenda>();
        while(rs.next()) {
            toReturn.add(populateFazendaInfo(rs));
        }
        rs.close();
        return toReturn;
    }     
}
