package br.com.agrofacil.dao;

import br.com.agrofacil.entity.HistoricoSafra;
import br.com.agrofacil.entity.ObjetivoSafra;
import br.com.agrofacil.entity.TipoPlantioColheita;
import br.com.agrofacil.entity.TipoPropriedade;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class ObjetivoSafraDAO extends GenericDAO {

    public ObjetivoSafraDAO() {
    }
    
    public int addObjetivoSafra(ObjetivoSafra objetivoSafra) throws SQLException {
        String sql = "INSERT INTO OBJETIVOSAFRA(ID,HISTORICO,IDSAFRA,IDFAZENDA,IDSETOR,IDTALHAO,DATAHISTORICO,TIPOPROPRIEDADE,"
                + "IDFRENTE,TIPOCOLHEITA,IDVARIEDADE,IDESPACAMENTO,TIPOPLANTIO,IDEMPRESA,IDUNIDADEINDUSTRIAL,"
                + "DISTTERRA,DISTASFALTO,DISTHIDROVIA,IDADE,QTDAREAPROD,QTDTHC) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        objetivoSafra.setId(getNextId("OBJETIVOSAFRA"));
        
        executeCommand(sql, 
                objetivoSafra.getId(),
                objetivoSafra.getHistorico().toString(),
                objetivoSafra.getSafra().getId(),
                objetivoSafra.getFazenda().getId(),
                objetivoSafra.getSetor().getId(),
                objetivoSafra.getTalhao().getId(),
                objetivoSafra.getDataHistorico(),
                objetivoSafra.getTipropriedade().toString(),
                objetivoSafra.getFrente().getId(),
                objetivoSafra.getTipoColheita().toString(),
                objetivoSafra.getVariedade().getId(),
                objetivoSafra.getEspacamento().getId(),
                objetivoSafra.getTipoPlantio().toString(),
                objetivoSafra.getEmpresa().getId(),
                objetivoSafra.getUnidadeIndustrial().getId(),
                objetivoSafra.getDistTerra(),
                objetivoSafra.getDistAsfalto(),
                objetivoSafra.getDistHidrovia(),
                objetivoSafra.getIdade(),
                objetivoSafra.getAreaProdutiva(),
                objetivoSafra.getThc());
        
        return objetivoSafra.getId();
    }
    
    public void deleteObjetivoSafra(int id) throws SQLException {
        executeCommand("DELETE FROM OBJETIVOSAFRA WHERE ID = ?", id);
    }
    
    public ObjetivoSafra getObjetivoSafra(int id) throws SQLException {
        String sql = "SELECT * FROM OBJETIVOSAFRA WHERE ID = ?";
        ObjetivoSafra toReturn = new ObjetivoSafra();
        ResultSet rs = executeQuery(sql, id);
        
        if (rs.next()) {
            toReturn = populateObjSafraInfo(rs);
        }
        
        return toReturn;
    }

    public List<ObjetivoSafra> getAllObjetivoSafra() throws SQLException {
        List<ObjetivoSafra> objetivosSafra = new LinkedList<>();
        String sql = "SELECT * FROM OBJETIVOSAFRA";
        ResultSet rs = executeQuery(sql);
        
        while (rs.next()) {
           objetivosSafra.add(populateObjSafraInfo(rs));
        }
        return objetivosSafra;
    }
            
    public ObjetivoSafra populateObjSafraInfo(ResultSet rs) throws SQLException {
        ObjetivoSafra toReturn = new ObjetivoSafra();
        SafraDAO safra = new SafraDAO();
        TalhaoDAO talhao = new TalhaoDAO();
        SetorDAO setor = new SetorDAO();
        FazendaDAO fazenda = new FazendaDAO();
        FrenteTransporteDAO frente = new FrenteTransporteDAO();
        VariedadeDAO variedade = new VariedadeDAO();
        EspacamentoDAO espacamento = new EspacamentoDAO();
        EmpresaDAO empresa = new EmpresaDAO();
        UnidadeIndustrialDAO unidade = new UnidadeIndustrialDAO();
        
        toReturn.setId(rs.getInt("ID"));
        toReturn.setHistorico(HistoricoSafra.valueOf(rs.getString("HISTORICO")));
        toReturn.setSafra(safra.getSafra(rs.getInt("IDSAFRA")));
        toReturn.setFazenda(fazenda.getFazenda(rs.getInt("IDFAZENDA")));
        toReturn.setSetor(setor.getSetor(rs.getInt("IDSETOR")));
        toReturn.setTalhao(talhao.getTalhao(rs.getInt("IDTALHAO")));
        toReturn.setDataHistorico(rs.getDate("DATAHISTORICO"));
        toReturn.setTipropriedade(TipoPropriedade.valueOf(rs.getString("TIPOPROPRIEDADE")));
        toReturn.setFrente(frente.getFrenteTransporte(rs.getInt("IDFRENTE")));
        toReturn.setTipoColheita(TipoPlantioColheita.valueOf(rs.getString("TIPOCOLHEITA")));
        toReturn.setVariedade(variedade.getVariedade(rs.getInt("IDVARIEDADE")));
        toReturn.setEspacamento(espacamento.getEspacamento(rs.getInt("IDESPACAMENTO")));
        toReturn.setTipoPlantio(TipoPlantioColheita.valueOf(rs.getString("TIPOPLANTIO")));
        toReturn.setEmpresa(empresa.getEmpresa(rs.getInt("IDEMPRESA")));
        toReturn.setUnidadeIndustrial(unidade.getUnidadeIndustrial(rs.getInt("IDUNIDADEINDUSTRIAL")));
        toReturn.setDistTerra(rs.getFloat("DISTTERRA"));
        toReturn.setDistAsfalto(rs.getFloat("DISTASFALTO"));
        toReturn.setDistHidrovia(rs.getFloat("DISTHIDROVIA"));
        toReturn.setIdade(rs.getInt("IDADE"));
        toReturn.setAreaProdutiva(rs.getFloat("QTDAREAPROD"));
        toReturn.setThc(rs.getFloat("QTDTHC"));
        
        return toReturn;
    }
}
