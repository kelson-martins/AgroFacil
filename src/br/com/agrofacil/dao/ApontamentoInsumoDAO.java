/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.dao;

import br.com.agrofacil.entity.ApontamentoInsumo;
import br.com.agrofacil.entity.ApontamentoInsumoItem;
import br.com.agrofacil.entity.Espacamento;
import br.com.agrofacil.entity.TipoPlantioColheita;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class ApontamentoInsumoDAO extends GenericDAO {

    public ApontamentoInsumoDAO() {
    }
    
    public int addApontamentoInsumo(ApontamentoInsumo apontamento, boolean cascade) throws SQLException {
        apontamento.setId(getNextId("APONTAMENTOINSUMO"));
        String sql = "INSERT INTO APONTAMENTOINSUMO VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        executeCommand(sql, 
                apontamento.getId(),
                apontamento.getDataOperacao(),
                apontamento.getCentro().getId(),
                apontamento.getOperacao().getId(),
                apontamento.getTipoSistema().toString(),
                apontamento.getEquipamento().getId(),
                apontamento.getQtdAplicada(),
                apontamento.getFrente().getId(),
                apontamento.getQtdAreaAplicada(),
                apontamento.getSafra().getId(),
                apontamento.getFazenda().getId(),
                apontamento.getSetor().getId(),
                apontamento.getTalhao().getId(),
                apontamento.getConcluido(),
                apontamento.getHoraIni(),
                apontamento.getHoraFim());
        
                //Persiste the itens
        for(ApontamentoInsumoItem item : apontamento.getItens()) {
            addApontamentoInsumoItens(item);
        }
        
        return apontamento.getId();
    }
    
    public int addApontamentoInsumoItens(ApontamentoInsumoItem item) throws SQLException {
        item.setId(getNextId("APONTAMENTOINSUMOITENS"));
        String query = "INSERT INTO APONTAMENTOINSUMOITENS (id, idApontamentoInsumo, doseProgramada, idInsumo, vazaoProgramada, qtdTotal) VALUES (?,?,?,?,?,?)";
        executeCommand(
                query, item.getId(),
                item.getApontamentoInsumo().getId(),
                //item.getSequencia(),
                item.getDoseProgramada(), 
                item.getInsumo().getId(),
                item.getVazaoProgramada(), 
                item.getQtdTotal());
        
        return item.getId();        
    }
    
    public void updateApontamentoInsumo(ApontamentoInsumo ap) throws SQLException {
        String sql = "UPDATE APONTAMENTOINSUMO SET DATAOPERACAO = ?, "
                + "IDCENTROCUSTO = ?, "
                + "IDOPERACAO = ?, "
                + "TIPOSISTEMAAPLICACAO = ?, "
                + "IDEQUIPAMENTO = ?, "
                + "QTDAPLICADA = ?, "
                + "IDFRENTE = ?, "
                + "QTDAREAAPLICADA = ?, "
                + "IDSAFRA = ?, "
                + "IDFAZENDA = ?, "
                + "IDSETOR = ?, "
                + "IDTALHAO = ?, "
                + "CONCLUIDO = ?, "
                + "HORAINI = ?, "
                + "HORAFIM = ? "
                + "WHERE ID = ?";
        
         executeCommand(sql, ap.getDataOperacao(),
                 ap.getCentro().getId(),
                 ap.getOperacao().getId(),
                 ap.getTipoSistema().toString(),
                 ap.getEquipamento().getId(),
                 ap.getQtdAplicada(),
                 ap.getFrente().getId(),
                 ap.getQtdAreaAplicada(),
                 ap.getSafra().getId(),
                 ap.getFazenda().getId(),
                 ap.getSetor().getId(),
                 ap.getTalhao().getId(),
                 ap.getConcluido(),
                 ap.getHoraIni(),
                 ap.getHoraFim(),
                 ap.getId()
                 );
         executeCommand("DELETE FROM APONTAMENTOINSUMOITENS WHERE IDAPONTAMENTOINSUMO = ?", ap.getId());
        //Persiste the itens
        for(ApontamentoInsumoItem item : ap.getItens()) {
            addApontamentoInsumoItens(item);
        }         
    }
    
    public void deleteApontamentoInsumo(int id) throws SQLException {
        executeCommand("DELETE FROM APONTAMENTOINSUMOITENS WHERE IDAPONTAMENTOINSUMO = ?", id);
        executeCommand("DELETE FROM APONTAMENTOINSUMO WHERE ID = ?", id);
    }
    
    public void deleteApontementoInsumoItem(int id) throws SQLException {
        executeCommand("DELETE FROM APONTAMENTOINSUMOITEM WHERE ID = ?", id);
    }
    
    public ApontamentoInsumo getApontamentoInsumo(int id) throws SQLException {
        ApontamentoInsumo apontamento = new ApontamentoInsumo();
        String sql = "SELECT * FROM APONTAMENTOINSUMO WHERE ID = ?";
        ResultSet rs = executeQuery(sql, id);
        if (rs.next()) {
            apontamento = populateApontamentoInsumoInfo(rs,true);
        }
        return apontamento;
    }
    
    public List<ApontamentoInsumo> getAllApontamentoInsumo() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM APONTAMENTOINSUMO");
        List<ApontamentoInsumo> apontamentoInsumo = new LinkedList<>();
        while(rs.next()) {
            apontamentoInsumo.add(populateApontamentoInsumoInfo(rs, true));
        }
        rs.close();
        return apontamentoInsumo;
    } 

    public ApontamentoInsumo populateApontamentoInsumoInfo(ResultSet rs, boolean populateItens) throws SQLException {
        ApontamentoInsumo toReturn = new ApontamentoInsumo();
        CentroCustoDAO centro = new CentroCustoDAO();
        OperacaoDAO operacao = new OperacaoDAO();
        EquipamentoDAO equipamento = new EquipamentoDAO();
        FrenteTransporteDAO frente = new FrenteTransporteDAO();
        SafraDAO safra = new SafraDAO();
        FazendaDAO fazenda = new FazendaDAO();
        TalhaoDAO talhao = new TalhaoDAO();
        SetorDAO setor = new SetorDAO();
        
        toReturn.setId(rs.getInt("ID"));
        toReturn.setDataOperacao(rs.getDate("DATAOPERACAO"));
        toReturn.setCentro(centro.getCentroCusto(rs.getInt("IDCENTROCUSTO")));
        toReturn.setOperacao(operacao.getOperacao(rs.getInt("IDOPERACAO")));
        toReturn.setTipoSistema(TipoPlantioColheita.valueOf(rs.getString("TIPOSISTEMAAPLICACAO")));
        toReturn.setEquipamento(equipamento.getEquipamento(rs.getInt("IDEQUIPAMENTO")));
        toReturn.setQtdAplicada(rs.getFloat("QTDAPLICADA"));
        toReturn.setFrente(frente.getFrenteTransporte(rs.getInt("IDFRENTE")));
        toReturn.setQtdAreaAplicada(rs.getFloat("QTDAREAAPLICADA"));
        toReturn.setSafra(safra.getSafra(rs.getInt("IDSAFRA")));
        toReturn.setFazenda(fazenda.getFazenda(rs.getInt("IDFAZENDA")));
        toReturn.setSetor(setor.getSetor(rs.getInt("IDSETOR")));
        toReturn.setTalhao(talhao.getTalhao(rs.getInt("IDTALHAO")));
        toReturn.setConcluido(rs.getBoolean("CONCLUIDO"));
        toReturn.setHoraIni(rs.getString("HORAINI"));
        toReturn.setHoraFim(rs.getString("HORAFIM"));
        
        if(populateItens) {
            //toReturn.setItens(getSellItens(toReturn));
        }
        
        return toReturn;
    }
    
    public List<ApontamentoInsumoItem> getApontamentoInsumoItem(ApontamentoInsumo apontamento) throws SQLException {
        List<ApontamentoInsumoItem> item = new LinkedList<ApontamentoInsumoItem>();
        ResultSet rs = executeQuery("SELECT * FROM APONTAMENTOINSUMOITENS WHERE IDAPONTAMENTOINSUMO = ?", apontamento.getId());
        while (rs.next()) {
            item.add(populateApontamentoInsumoItem(rs, apontamento));
        }
        
        return item;
    }
    
     public List<ApontamentoInsumo> getApontamentoInsumoByFazenda(String text) throws SQLException {
        String sql = "SELECT * FROM APONTAMENTOINSUMO A INNER JOIN FAZENDA B ON A.IDFAZENDA = B.ID WHERE B.DESCRICAO LIKE '%"+text+"%'";
        ResultSet rs = executeQuery(sql);
        List<ApontamentoInsumo> toReturn = new LinkedList<ApontamentoInsumo>();
        while(rs.next()) {
            toReturn.add(populateApontamentoInsumoInfo(rs, true));
        }
        rs.close();
        return toReturn;
    }
     
     public List<ApontamentoInsumo> getApontamentoInsumoByData(String text) throws SQLException {
        String sql = "SELECT * FROM APONTAMENTOINSUMO WHERE DATAOPERACAO = '"+text+"'";
        ResultSet rs = executeQuery(sql);
        List<ApontamentoInsumo> toReturn = new LinkedList<ApontamentoInsumo>();
        while(rs.next()) {
            toReturn.add(populateApontamentoInsumoInfo(rs, true));
        }
        rs.close();
        return toReturn;
    }     
     
    public ApontamentoInsumoItem populateApontamentoInsumoItem(ResultSet rs,ApontamentoInsumo... apontamento) throws SQLException {
        ApontamentoInsumoItem toReturn = new ApontamentoInsumoItem();
        InsumoDAO insumo = new InsumoDAO();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setSequencia(rs.getInt("SEQUENCIA"));
        toReturn.setDoseProgramada(rs.getFloat("DOSEPROGRAMADA"));
        toReturn.setInsumo(insumo.getInsumo(rs.getInt("IDINSUMO")));
        toReturn.setVazaoProgramada(rs.getFloat("VAZAOPROGRAMADA"));
        toReturn.setQtdTotal(rs.getFloat("QTDTOTAL"));
        
        if(apontamento != null && apontamento.length > 0) {
            toReturn.setApontamentoInsumo(apontamento[0]);
        } else {
            toReturn.setApontamentoInsumo(getApontamentoInsumo(rs.getInt("IDAPONTAMENTOINSUMO")));
        }
                
        return toReturn;
    }
    
    
}
