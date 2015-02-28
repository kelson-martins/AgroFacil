package br.com.agrofacil.dao;

import br.com.agrofacil.entity.OrdemCorteProducao;
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
public class OrdemCorteProducaoDAO extends GenericDAO {

    public OrdemCorteProducaoDAO() {
    }
    
    public int addOrdemCorteProducao(OrdemCorteProducao ordem) throws SQLException {
        String sql = "INSERT INTO ORDEMCORTEPRODUCAO VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        ordem.setId(getNextId("ORDEMCORTEPRODUCAO"));
        executeCommand(sql, 
                ordem.getId(),
                ordem.getSafra().getId(),
                ordem.getFazenda().getId(),
                ordem.getSetor().getId(),
                ordem.getTalhao().getId(),
                ordem.getTipoCorte().toString(),
                ordem.getQtdEstimativaTon(),
                ordem.getQtdAreaOrdem(),
                ordem.getTipoQueima().toString(),
                ordem.getDataCorte(),
                ordem.getHoraCorte(),
                ordem.getQtdThc(),
                ordem.getTipoColheita().toString(),
                ordem.getFrenteTransporte().getId(),
                ordem.getDataQueima(),
                ordem.getHoraQueima(),
                ordem.getCanaCrua(),
                ordem.getQtdAreaTotal(),
                ordem.getQtdToneladaEst(),
                ordem.getDataFechamentoOrdem());
        
        
        return ordem.getId();
    }
    
    public void deleteOrdemCorteProducao(int id) throws SQLException {
        executeCommand("DELETE FROM ORDEMCORTEPRODUCAO WHERE ID = ?", id);
    }
    
    public OrdemCorteProducao getOrdemCorteProducao(int id) throws SQLException {
        String sql = "SELECT * FROM ORDEMCORTEPRODUCAO WHERE ID = ?";
        OrdemCorteProducao ordem = new OrdemCorteProducao();
        
        ResultSet rs = executeQuery(sql, id);
        if (rs.next()) {
            ordem = populateOrdemInfo(rs);
        }
        
        return ordem;
    }
    
    public List<OrdemCorteProducao> getAllOrdemCorteProducao() throws SQLException {
        String sql = "SELECT * FROM ORDEMCORTEPRODUCAO";
        List<OrdemCorteProducao> ordens = new LinkedList<OrdemCorteProducao>();
        
        ResultSet rs = executeQuery(sql);
        while (rs.next()) {
            ordens.add(populateOrdemInfo(rs));
        }
        
        return ordens;
    }
 
    public OrdemCorteProducao populateOrdemInfo(ResultSet rs) throws SQLException {
        OrdemCorteProducao toReturn = new OrdemCorteProducao();
        EquipamentoDAO equipamentoDAO = new EquipamentoDAO();                
        FrenteTransporteDAO frenteDAO = new FrenteTransporteDAO();
        SafraDAO safraDAO = new SafraDAO();
        FazendaDAO fazendaDAO = new FazendaDAO();
        SetorDAO setorDAO = new SetorDAO();
        TalhaoDAO talhaoDAO = new TalhaoDAO();
        
        
        toReturn.setId(rs.getInt("ID"));        
        toReturn.setSafra(safraDAO.getSafra(rs.getInt("IDSAFRA")));
        toReturn.setFazenda(fazendaDAO.getFazenda(rs.getInt("IDFAZENDA")));
        toReturn.setSetor(setorDAO.getSetor(rs.getInt("IDSETOR")));
        toReturn.setTalhao(talhaoDAO.getTalhao(rs.getInt("IDTALHAO")));
        toReturn.setTipoCorte(TipoPlantioColheita.valueOf(rs.getString("TIPOCORTE")));
        toReturn.setQtdEstimativaTon(rs.getInt("QTDESTIMATIVATON"));
        toReturn.setQtdAreaOrdem(rs.getFloat("QTDAREAORDEM"));
        toReturn.setTipoQueima(TipoCorteQueima.valueOf(rs.getString("TIPOQUEIMA")));
        toReturn.setDataCorte(rs.getDate("DATACORTE"));
        toReturn.setHoraCorte(rs.getString("HORACORTE"));
        toReturn.setQtdThc(rs.getFloat("QTDTHC"));
        toReturn.setTipoColheita(TipoPlantioColheita.valueOf(rs.getString("TIPOCOLHEITA")));
        toReturn.setFrenteTransporte(frenteDAO.getFrenteTransporte(rs.getInt("IDFRENTE")));
        toReturn.setDataQueima(rs.getDate("DATAQUEIMA"));
        toReturn.setHoraQueima(rs.getString("HORAQUEIMA"));
        toReturn.setCanaCrua(rs.getBoolean("CANACRUA"));
        toReturn.setQtdAreaTotal(rs.getFloat("QTDAREATOTAL"));
        toReturn.setQtdToneladaEst(rs.getInt("QTDTONELADAEST"));
        toReturn.setDataFechamentoOrdem(rs.getDate("DATAFECHAMENTOORDEM"));
        
        return toReturn;
    }
}
