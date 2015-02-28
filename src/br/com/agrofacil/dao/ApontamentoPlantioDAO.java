/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.dao;

import br.com.agrofacil.entity.ApontamentoPlantio;
import br.com.agrofacil.entity.ApontamentoPlantioItem;
import br.com.agrofacil.entity.ApontamentoPlantioItem2;
import br.com.agrofacil.entity.TipoPlantioColheita;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class ApontamentoPlantioDAO extends GenericDAO{

    public ApontamentoPlantioDAO() {
    }
    
    public int addApontamentoPlantio(ApontamentoPlantio apontamento, boolean cascade) throws SQLException {
        apontamento.setId(getNextId("APONTAMENTOPLANTIO"));
        String query = "INSERT INTO APONTAMENTOPLANTIO VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        executeCommand(query, 
                apontamento.getId(),
                apontamento.getSafra().getId(),
                apontamento.getFazenda().getId(),
                apontamento.getSetor().getId(),
                apontamento.getTalhao().getId(),
                apontamento.getDataPlantio(),
                apontamento.getDataFechamento(),
                apontamento.getTipoPlantio().toString(),
                apontamento.getVariedade().getId(),
                apontamento.getEspacamento().getId(),
                apontamento.getQtdAreaPlantada(),
                apontamento.getQtdProducao(),
                apontamento.getPlantio(),
                apontamento.getConcluido(),
                apontamento.getCentroCusto().getId(),
                apontamento.getOperacao().getId(),
                apontamento.getTonEstimada(),
                apontamento.getNumeroOrdem(),
                apontamento.getOrdemCorteMuda().getId());
        
                for(ApontamentoPlantioItem itens : apontamento.getItens()) {
                    addApontamentoPlantioItens(itens);
                }
                
                for(ApontamentoPlantioItem2 itens2 : apontamento.getEquipamentos()) {
                    addApontamentoPlantioItens2(itens2);
                }
        return apontamento.getId();
    }
    
    public int addApontamentoPlantioItens(ApontamentoPlantioItem item) throws SQLException {
        item.setId(getNextId("APONTAMENTOPLANTIOITENS"));
        String query = "INSERT INTO APONTAMENTOPLANTIOITENS VALUES (?,?,?,?,?,?)";
        executeCommand(
                query, item.getId(),
                item.getSafra().getId(),
                item.getFazenda().getId(), 
                item.getSetor().getId(),
                item.getTalhao().getId(),
                item.getApontamentoPlantio().getId());
        
        return item.getId();        
    }
    
    public int addApontamentoPlantioItens2(ApontamentoPlantioItem2 item) throws SQLException {
        item.setId(getNextId("APONTAMENTOPLANTIOITENS2"));
        String query = "INSERT INTO APONTAMENTOPLANTIOITENS2 VALUES (?,?,?,?,?)";
        executeCommand(
                query, item.getId(),
                item.getApontamentoPlantio().getId(),
                item.getEquipamento().getId(),
                item.getTipo(),
                item.getDescricao());
        
        return item.getId();        
    }
     
    public void deleteApontamentoPlantioItem2(int id) throws SQLException {
        executeCommand("DELETE FROM APONTAMENTOPLANTIOITENS2 WHERE ID = ?", id);
    }    
    
    public void deleteApontamentoPlantioItem(int id) throws SQLException {
        executeCommand("DELETE FROM APONTAMENTOPLANTIOITENS WHERE ID = ?", id);
    }    
    
    public void deleteApontamentoPlantio(int id) throws SQLException {
        executeCommand("DELETE FROM APONTAMENTOPLANTIOITENS2 WHERE IDAPONTAMENTOPLANTIO = ?", id);        
        executeCommand("DELETE FROM APONTAMENTOPLANTIO WHERE IDAPONTAMENTOPLANTIO = ?", id);        
        executeCommand("DELETE FROM APONTAMENTOPLANTIOITENS WHERE ID = ?", id);
    }
    
    public List<ApontamentoPlantio> getAllApontamentoPlantio() throws SQLException {
        List<ApontamentoPlantio> toReturn = new LinkedList<ApontamentoPlantio>();
        String sql = "SELECT * FROM APONTAMENTOPLANTIO";
        ResultSet rs = executeQuery(sql);
        
        while (rs.next()) {
            toReturn.add(populateApontamentoPlantioInfo(rs));
        }
              
        return toReturn;
    }
    
    public ApontamentoPlantio getApontamentoPlantio(int id) throws SQLException {
        String sql = "SELECT * FROM APONTAMENTOPLANTIO WHERE ID = ?";
        ApontamentoPlantio apontamento = new ApontamentoPlantio();
        ResultSet rs = executeQuery(sql, id);
        
        if (rs.next()) {
            apontamento = populateApontamentoPlantioInfo(rs);
        }
        
        return apontamento;
    }

    public ApontamentoPlantio populateApontamentoPlantioInfo(ResultSet rs) throws SQLException {
        ApontamentoPlantio toReturn = new ApontamentoPlantio();
        
        SafraDAO safra = new SafraDAO();
        FazendaDAO fazenda = new FazendaDAO();
        SetorDAO setor = new SetorDAO();
        TalhaoDAO talhao = new TalhaoDAO();
        VariedadeDAO variedade = new VariedadeDAO();
        EspacamentoDAO espacamento = new EspacamentoDAO();
        CentroCustoDAO centro = new CentroCustoDAO();
        OperacaoDAO opecacao = new OperacaoDAO();
        OrdemCorteMudaDAO ordem = new OrdemCorteMudaDAO();
        
        toReturn.setId(rs.getInt("ID"));
        toReturn.setSafra(safra.getSafra(rs.getInt("IDSAFRA")));
        toReturn.setFazenda(fazenda.getFazenda(rs.getInt("IDFAZENDA")));
        toReturn.setSetor(setor.getSetor(rs.getInt("IDSETOR")));
        toReturn.setTalhao(talhao.getTalhao(rs.getInt("IDTALHAO")));
        toReturn.setDataPlantio(rs.getDate("DATAPLANTIO"));
        toReturn.setDataFechamento(rs.getDate("DATAFECHAMENTO"));
        toReturn.setTipoPlantio(TipoPlantioColheita.valueOf(rs.getString("TIPOPLANTIO")));
        toReturn.setVariedade(variedade.getVariedade(rs.getInt("IDVARIEDADE")));
        toReturn.setEspacamento(espacamento.getEspacamento(rs.getInt("IDESPACAMENTO")));
        toReturn.setQtdAreaPlantada(rs.getFloat("QTDAREA"));
        toReturn.setQtdProducao(rs.getFloat("QTDPROD"));
        toReturn.setPlantio(rs.getBoolean("REPLANTIO"));
        toReturn.setConcluido(rs.getBoolean("CONCLUIDO"));
        toReturn.setCentroCusto(centro.getCentroCusto(rs.getInt("IDCENTROCUSTO")));
        toReturn.setOperacao(opecacao.getOperacao(rs.getInt("IDOPERACAO")));
        toReturn.setTonEstimada(rs.getFloat("QTDESTIMADA"));
        //toReturn.setNumeroOrdem(rs.getInt("NUMEROORDEM"));
        toReturn.setOrdemCorteMuda(ordem.getOrdemCorteMuda(rs.getInt("IDORDEMCORTEMUDA")));
        
        toReturn.setItens(getApontamentoPlantioItem(toReturn));
        toReturn.setEquipamentos(getApontamentoPlantioItem2(toReturn));
        return toReturn;
    }
    
    public List<ApontamentoPlantioItem> getApontamentoPlantioItem(ApontamentoPlantio apontamento) throws SQLException {
        List<ApontamentoPlantioItem> itens = new LinkedList<ApontamentoPlantioItem>();
        String sql = "SELECT * FROM APONTAMENTOPLANTIOITENS WHERE IDAPONTAMENTOPLANTIO = ?";
        ResultSet rs = executeQuery(sql, apontamento.getId());
        
        while(rs.next()) {
            itens.add(populateApontamentoPlantioItemInfo(rs,apontamento));
        }
        return itens;
    } 

    public ApontamentoPlantioItem populateApontamentoPlantioItemInfo(ResultSet rs,ApontamentoPlantio... apontamento) throws SQLException {
        ApontamentoPlantioItem toReturn = new ApontamentoPlantioItem();
        
        SafraDAO safra = new SafraDAO();
        FazendaDAO fazenda = new FazendaDAO();
        SetorDAO setor = new SetorDAO();
        TalhaoDAO talhao = new TalhaoDAO();
        
        toReturn.setId(rs.getInt("ID"));
        toReturn.setSafra(safra.getSafra(rs.getInt("IDSAFRA")));
        toReturn.setFazenda(fazenda.getFazenda(rs.getInt("IDFAZENDA")));
        toReturn.setSetor(setor.getSetor(rs.getInt("IDSETOR")));
        toReturn.setTalhao(talhao.getTalhao(rs.getInt("IDTALHAO")));
        
        if(apontamento != null && apontamento.length > 0) {
            toReturn.setApontamentoPlantio(apontamento[0]);
        } else {
            toReturn.setApontamentoPlantio(getApontamentoPlantio(rs.getInt("IDAPONTAMENTOPLANTIO")));
        }
        return toReturn;
    }
    
    public void updateApontamentoPlantio(ApontamentoPlantio ap) throws SQLException {
        String sql = "UPDATE APONTAMENTOPLANTIO "
                + "SET IDSAFRA = ?, "
                + "IDFAZENDA = ?, "
                + "IDSETOR = ?, "
                + "IDTALHAO = ?, "
                + "DATAPLANTIO = ?, "
                + "DATAFECHAMENTO = ?, "
                + "TIPOPLANTIO = ?, "
                + "IDVARIEDADE = ?, "
                + "IDESPACAMENTO = ?, "
                + "QTDAREA = ?, "
                + "QTDPROD = ?, "
                + "REPLANTIO = ?, "
                + "CONCLUIDO = ?, "
                + "IDCENTROCUSTO = ?, "
                + "IDOPERACAO = ?, "
                + "QTDESTIMADA = ?, "
                + "IDORDEMCORTEMUDA = ? "
                + "WHERE ID = ?";
        
        executeCommand(sql, 
                ap.getSafra().getId(),
                ap.getFazenda().getId(),
                ap.getSetor().getId(),
                ap.getTalhao().getId(),
                ap.getDataPlantio(),
                ap.getDataFechamento(),
                ap.getTipoPlantio().toString(),
                ap.getVariedade().getId(),
                ap.getEspacamento().getId(),
                ap.getQtdAreaPlantada(),
                ap.getQtdProducao(),
                ap.getPlantio(),
                ap.getConcluido(),
                ap.getCentroCusto().getId(),
                ap.getOperacao().getId(),
                ap.getTonEstimada(),
                ap.getOrdemCorteMuda().getId(),
                ap.getId());
        
        executeCommand("DELETE FROM APONTAMENTOPLANTIOITENS WHERE IDAPONTAMENTOPLANTIO = ?" , ap.getId());
        executeCommand("DELETE FROM APONTAMENTOPLANTIOITENS2 WHERE IDAPONTAMENTOPLANTIO = ?", ap.getId());
        
        for(ApontamentoPlantioItem itens : ap.getItens()) {
            addApontamentoPlantioItens(itens);
        }

        for(ApontamentoPlantioItem2 itens2 : ap.getEquipamentos()) {
            addApontamentoPlantioItens2(itens2);
        }
    }
    
    public List<ApontamentoPlantioItem2> getApontamentoPlantioItem2(ApontamentoPlantio apontamento) throws SQLException {
        List<ApontamentoPlantioItem2> itens = new LinkedList<ApontamentoPlantioItem2>();
        String sql = "SELECT * FROM APONTAMENTOPLANTIOITENS2 WHERE IDAPONTAMENTOPLANTIO = ?";       
        ResultSet rs = executeQuery(sql, apontamento.getId());
        
        while(rs.next()) {
            itens.add(populatePlantioItens2(rs,apontamento));
        }
        
        return itens;
    }

    public ApontamentoPlantioItem2 populatePlantioItens2(ResultSet rs, ApontamentoPlantio... apontamento) throws SQLException {
        ApontamentoPlantioItem2 toReturn = new ApontamentoPlantioItem2();
        EquipamentoDAO equipamento = new EquipamentoDAO();
        
        toReturn.setId(rs.getInt("ID"));
        toReturn.setEquipamento(equipamento.getEquipamento(rs.getInt("IDEQUIPAMENTO")));
        toReturn.setTipo(rs.getString("TIPO"));
        toReturn.setDescricao(rs.getString("DESCRICAO"));
        
        if(apontamento != null && apontamento.length > 0) {
            toReturn.setApontamentoPlantio(apontamento[0]);
        } else {
            toReturn.setApontamentoPlantio(getApontamentoPlantio(rs.getInt("IDAPONTAMENTOPLANTIO")));
        }
        
        return toReturn;
    }
    
     public List<ApontamentoPlantio> getApontamentoPlantioByFazenda(String text) throws SQLException {
        String sql = "SELECT * FROM APONTAMENTOPLANTIO A INNER JOIN FAZENDA B ON A.IDFAZENDA = B.ID WHERE B.DESCRICAO LIKE '%"+text+"%'";
        ResultSet rs = executeQuery(sql);
        List<ApontamentoPlantio> toReturn = new LinkedList<ApontamentoPlantio>();
        while(rs.next()) {
            toReturn.add(populateApontamentoPlantioInfo(rs));
        }
        rs.close();
        return toReturn;
    }
     
     public List<ApontamentoPlantio> getApontamentoPlantioByDataPlantio(String text) throws SQLException {
        String sql = "SELECT * FROM APONTAMENTOPLANTIO WHERE DATAPLANTIO = '"+text+"'";
        ResultSet rs = executeQuery(sql);
        List<ApontamentoPlantio> toReturn = new LinkedList<ApontamentoPlantio>();
        while(rs.next()) {
            toReturn.add(populateApontamentoPlantioInfo(rs));
        }
        rs.close();
        return toReturn;
    }    
}
