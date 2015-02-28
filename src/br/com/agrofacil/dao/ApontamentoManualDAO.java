package br.com.agrofacil.dao;

import br.com.agrofacil.entity.ApontamentoManual;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class ApontamentoManualDAO extends GenericDAO {

    public ApontamentoManualDAO() {
    }
    
    public int addApontamentoManual(ApontamentoManual ap) throws SQLException {
        String sql = "INSERT INTO APONTAMENTOMANUAL VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        ap.setId(getNextId("APONTAMENTOMANUAL"));
        executeCommand(sql, ap.getId(),                
                ap.getFuncionario().getId(),
                ap.getCentroCusto().getId(),
                ap.getOperacao().getId(),
                ap.getSafra().getId(),
                ap.getFazenda().getId(),
                ap.getSetor().getId(),
                ap.getTalhao().getId(),
                ap.getHoraInicial(),
                ap.getHoraFinal(),
                ap.getHorasTotais(),
                ap.getHorasExtras(),
                ap.getFrente().getId(),
                ap.getQtdProducao(),
                ap.getDataOperacao()
                );
        
        return ap.getId();
    }
    
    public void deleteApontamentoManual(int id) throws SQLException {
        executeCommand("DELETE FROM APONTAMENTOMANUAL WHERE ID = ?", id);
    }
    
    public ApontamentoManual getApontamentoManual(int id) throws SQLException {
        String sql = "SELECT * FROM APONTAMENTOMANUAL WHERE ID = ?";
        ApontamentoManual apont = new ApontamentoManual();
        ResultSet rs = executeQuery(sql, id);
        if (rs.next()) {
            apont = populateApontamentoManualInfo(rs);
        }
         
        return apont;
    }

    public List<ApontamentoManual> getAllApontamentoManual() throws SQLException {
        List<ApontamentoManual> apontamentos = new LinkedList<>();
        
        String sql = "SELECT * FROM APONTAMENTOMANUAL";
        ResultSet rs = executeQuery(sql);
        while(rs.next()) {
            apontamentos.add(populateApontamentoManualInfo(rs));
        }
        
        return apontamentos;
    }
    
    public ApontamentoManual populateApontamentoManualInfo(ResultSet rs) throws SQLException {
        ApontamentoManual toReturn = new ApontamentoManual();
        CentroCustoDAO centro = new CentroCustoDAO();
        FuncionarioDAO func = new FuncionarioDAO();
        OperacaoDAO operacao = new OperacaoDAO();
        SafraDAO safra = new SafraDAO();
        FazendaDAO fazenda = new FazendaDAO();
        SetorDAO setor = new SetorDAO();
        TalhaoDAO talhao = new TalhaoDAO();
        FrenteTransporteDAO frente = new FrenteTransporteDAO();
        
        toReturn.setId(rs.getInt("ID"));
        toReturn.setFuncionario(func.getFuncionario(rs.getInt("IDFUNCIONARIO")));
        toReturn.setCentroCusto(centro.getCentroCusto(rs.getInt("IDCENTROCUSTO")));
        toReturn.setDataOperacao(rs.getDate("DATAOPERACAO"));
        toReturn.setOperacao(operacao.getOperacao(rs.getInt("IDOPERACAO")));
        toReturn.setSafra(safra.getSafra(rs.getInt("IDSAFRA")));
        toReturn.setFazenda(fazenda.getFazenda(rs.getInt("IDFAZENDA")));
        toReturn.setSetor(setor.getSetor(rs.getInt("IDSETOR")));
        toReturn.setTalhao(talhao.getTalhao(rs.getInt("IDTALHAO")));
        toReturn.setHoraInicial(rs.getString("HORAINICIAL"));
        toReturn.setHoraFinal(rs.getString("HORAFINAL"));
        toReturn.setHorasTotais(rs.getString("HORASTOTAIS"));
        toReturn.setHorasExtras(rs.getString("HORASEXTRAS"));
        toReturn.setFrente(frente.getFrenteTransporte(rs.getInt("IDFRENTE")));
        toReturn.setQtdProducao(rs.getFloat("QTDPRODUCAO"));
        
        return toReturn;
    }
}
