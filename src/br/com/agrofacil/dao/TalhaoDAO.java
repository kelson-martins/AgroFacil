/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.dao;

import br.com.agrofacil.entity.SituacaoLocalProducao;
import br.com.agrofacil.entity.Talhao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class TalhaoDAO extends GenericDAO{

    public TalhaoDAO() {
    }
    
    public int addTalhao(Talhao talhao) throws SQLException {
        talhao.setId(getNextId("TALHAO"));
        String sql = "INSERT INTO TALHAO VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        executeCommand(sql, 
                talhao.getId(),
                talhao.getFazenda().getId(),
                talhao.getSetor().getId(),
                talhao.getSafra().getId(),
                talhao.getFrenteTransporte().getId(),
                talhao.getDistTerra(),
                talhao.getDistAsfalto(),
                talhao.getDistHidrovia(),
                talhao.getVariedade().getId(),
                talhao.getEspacamento().getId(),
                talhao.getQtdAreaProd(),
                talhao.getEmpresa().getId(),
                talhao.getUnidadeIndustrial().getId(),
                talhao.getQtdAreaMuda(),
                talhao.getDataSituacao(),
                talhao.getSituacao().toString(),
                talhao.getDescricao()
                );

        return talhao.getId();
    }
    
    public void deleteTalhao(int id) throws SQLException {
        String sql = "DELETE FROM TALHAO WHERE ID = ?";
        executeCommand(sql, id);
    }
    
    public void updateTalhao(Talhao talhao) throws SQLException {
        String sql = "UPDATE TALHAO SET " + 
                "IDFAZENDA = ? " + 
                "IDSETOR = ? "   +
                "IDSAFRA = ? "   + 
                "IDFRENTE = ? "  +
                "DISTTERRA = ? " +
                "DISTASFALTO = ? " + 
                "DISTHIDROVIA = ? " +
                "IDVARIEDADE = ? " +
                "IDESPACAMENTO = ? " +
                "QTDAREAPROD = ? " + 
                "IDEMPRESA = ? " + 
                "IDUNIDADEINDUSTRIAL = ? " + 
                "QTDAREAMUDA = ? " +
                "DATASITUACAO = ? " +
                "SITUACAO = ? " +
                "DESCRICAO = ? " +
                "WHERE ID = ?";
        executeCommand(sql, talhao.getFazenda().getId(), talhao.getSetor().getId(), talhao.getSafra().getId(),
                talhao.getFrenteTransporte().getId(),talhao.getDistTerra(), talhao.getDistAsfalto(), talhao.getDistHidrovia(),
                talhao.getVariedade().getId(),talhao.getEspacamento().getId(),talhao.getQtdAreaProd(),
                talhao.getEmpresa().getId(), talhao.getUnidadeIndustrial().getId(), talhao.getQtdAreaMuda(),
                talhao.getDataSituacao(), talhao.getSituacao().toString(),talhao.getDescricao(), talhao.getId());
                
    }
    
    public Talhao getTalhao(int id) throws SQLException {
        Talhao talhao = new Talhao();
        String sql = "SELECT * FROM TALHAO WHERE ID = ?";
        ResultSet rs = executeQuery(sql, id);
        if (rs.next()) {
            talhao = populateTalhaoInfo(rs);
        }
        
        return talhao;
    }

    public Talhao populateTalhaoInfo(ResultSet rs) throws SQLException {
        Talhao toReturn = new Talhao();
        FazendaDAO fazendaDAO = new FazendaDAO();
        SetorDAO setorDAO = new SetorDAO();
        SafraDAO safraDAO = new SafraDAO();
        FrenteTransporteDAO frenteDAO = new FrenteTransporteDAO();
        VariedadeDAO variedadeDAO = new VariedadeDAO();
        EspacamentoDAO espacamentoDAO = new EspacamentoDAO();
        EmpresaDAO empresaDAO = new EmpresaDAO();
        UnidadeIndustrialDAO unidadeDAO = new UnidadeIndustrialDAO();
        
        toReturn.setFazenda((fazendaDAO.getFazenda(rs.getInt("IDFAZENDA"))));
        toReturn.setId(rs.getInt("ID"));
        toReturn.setDescricao(rs.getString("DESCRICAO"));
        toReturn.setSetor(setorDAO.getSetor(rs.getInt("IDSETOR")));
        toReturn.setSafra(safraDAO.getSafra(rs.getInt("IDSAFRA")));
        toReturn.setFrenteTransporte(frenteDAO.getFrenteTransporte(rs.getInt("IDFRENTE")));
        toReturn.setDistTerra(rs.getFloat("DISTTERRA"));
        toReturn.setDistAsfalto(rs.getFloat("DISTASFALTO"));
        toReturn.setDistHidrovia(rs.getFloat("DISTHIDROVIA"));
        toReturn.setVariedade(variedadeDAO.getVariedade(rs.getInt("IDVARIEDADE")));
        toReturn.setEspacamento(espacamentoDAO.getEspacamento(rs.getInt("IDESPACAMENTO")));
        toReturn.setQtdAreaProd(rs.getFloat("QTDAREAPROD"));
        toReturn.setQtdAreaMuda(rs.getFloat("QTDAREAMUDA"));
        toReturn.setEmpresa(empresaDAO.getEmpresa(rs.getInt("IDEMPRESA")));
        toReturn.setUnidadeIndustrial(unidadeDAO.getUnidadeIndustrial(rs.getInt("IDUNIDADEINDUSTRIAL")));
        toReturn.setDataSituacao(rs.getDate("DATASITUACAO"));
        toReturn.setSituacao(SituacaoLocalProducao.valueOf(rs.getString("SITUACAO")));
        
        return toReturn;
    }
    
    public List<Talhao> getAllTalhao() throws SQLException {
        List<Talhao> toReturn = new LinkedList<Talhao>();
        String sql = "SELECT * FROM TALHAO";
        ResultSet rs = executeQuery(sql);        
        while (rs.next()) {
            toReturn.add(populateTalhaoInfo(rs));
        }
        
        return toReturn;
    }
    
    public List<Talhao> get10Talhao() throws SQLException {
        List<Talhao> toReturn = new LinkedList<Talhao>();
        String sql = "SELECT * FROM TALHAO LIMIT 10";
        ResultSet rs = executeQuery(sql);        
        while (rs.next()) {
            toReturn.add(populateTalhaoInfo(rs));
        }
        
        return toReturn;
    }    
    
     public List<Talhao> getTalhaoByName(String text) throws SQLException {
        String sql = "SELECT * FROM TALHAO T INNER JOIN FAZENDA F ON (F.ID = T.IDFAZENDA) WHERE F.DESCRICAO LIKE '%"+text+"%'";
        ResultSet rs = executeQuery(sql);
        List<Talhao> toReturn = new LinkedList<Talhao>();
        while(rs.next()) {
            toReturn.add(populateTalhaoInfo(rs));
        }
        rs.close();
        return toReturn;
    }    
}
