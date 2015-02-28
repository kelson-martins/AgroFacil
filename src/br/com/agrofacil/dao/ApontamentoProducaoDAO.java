/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.dao;

import br.com.agrofacil.entity.ApontamentoProducao;
import br.com.agrofacil.entity.TipoPlantioColheita;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class ApontamentoProducaoDAO extends GenericDAO {

    public ApontamentoProducaoDAO() {
    }
    
    public int addApontProd(ApontamentoProducao apontProd) throws SQLException {
        String query = "INSERT INTO APONTAMENTOPRODUCAO VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        apontProd.setId(getNextId("APONTAMENTOPRODUCAO"));
        
        executeCommand(query, apontProd.getId(),
                apontProd.getTipoPlantioColheita().toString(),
                apontProd.getCentroCusto().getId(),
                apontProd.getOperacao().getId(),
                apontProd.getEquipamento().getId(),
                apontProd.getFrenteTransporte().getId(),
                apontProd.getSafra().getId(),
                apontProd.getFazenda().getId(),
                apontProd.getSetor().getId(),
                apontProd.getTalhao().getId(),
                apontProd.getQtdKmIni(),
                apontProd.getQtdKmFim(),
                apontProd.getQtdTotalHoras(),
                apontProd.getQtdProducao(),
                apontProd.getDataOperacao());
        
        
        return apontProd.getId();
    }
    
    public void deleteApontProd(int id) throws SQLException {
        String sql = "DELETE FROM APONTAMENTOPRODUCAO WHERE ID = ?";
        executeCommand(sql, id);    
    }
    
    public ApontamentoProducao getApontProd(int id) throws SQLException {
        ApontamentoProducao apontProd = new ApontamentoProducao();
        String sql = "SELECT * FROM APONTAMENTOPRODUCAO WHERE ID = ?";
        ResultSet rs = executeQuery(sql, id);
        if ( rs.next() ) {
            apontProd = populateApontProdInfo(rs);
        }
        
        return apontProd;
    }

    public ApontamentoProducao populateApontProdInfo(ResultSet rs) throws SQLException {
        ApontamentoProducao toReturn = new ApontamentoProducao();
        CentroCustoDAO centroDAO = new CentroCustoDAO();
        OperacaoDAO operacaoDAO = new OperacaoDAO();
        EquipamentoDAO equipamentoDAO = new EquipamentoDAO();                
        FrenteTransporteDAO frenteDAO = new FrenteTransporteDAO();
        SafraDAO safraDAO = new SafraDAO();
        FazendaDAO fazendaDAO = new FazendaDAO();
        SetorDAO setorDAO = new SetorDAO();
        TalhaoDAO talhaoDAO = new TalhaoDAO();
        
        toReturn.setId(rs.getInt("ID"));
        toReturn.setTipoPlantioColheita(TipoPlantioColheita.valueOf(rs.getString("TIPOAPONTAMENTO")));
        toReturn.setCentroCusto(centroDAO.getCentroCusto(rs.getInt("IDCENTROCUSTO")));
        toReturn.setOperacao(operacaoDAO.getOperacao(rs.getInt("IDOPERACAO")));
        toReturn.setEquipamento(equipamentoDAO.getEquipamento(rs.getInt("IDEQUIPAMENTO")));
        toReturn.setFrenteTransporte(frenteDAO.getFrenteTransporte(rs.getInt("IDFRENTE")));
        toReturn.setSafra(safraDAO.getSafra(rs.getInt("IDSAFRA")));
        toReturn.setFazenda(fazendaDAO.getFazenda(rs.getInt("IDFAZENDA")));
        toReturn.setSetor(setorDAO.getSetor(rs.getInt("IDSETOR")));
        toReturn.setTalhao(talhaoDAO.getTalhao(rs.getInt("IDTALHAO")));
        toReturn.setQtdKmIni(rs.getInt("QTDKMINI"));
        toReturn.setQtdKmFim(rs.getInt("QTDKMFIM"));
        toReturn.setQtdTotalHoras(rs.getFloat("QTDTOTALHORAS"));
        toReturn.setQtdProducao(rs.getFloat("QTDPRODUCAO"));                
        toReturn.setDataOperacao(rs.getDate("DATAOPERACAO"));
        
        return toReturn;
    }
    
    public List<ApontamentoProducao> getAllApontProd() throws SQLException {
        List<ApontamentoProducao> toReturn = new LinkedList<>();
        ResultSet rs = executeQuery("SELECT * FROM APONTAMENTOPRODUCAO");
        
        while (rs.next()) {
            toReturn.add(populateApontProdInfo(rs));
        }
        return toReturn;
    }
}
