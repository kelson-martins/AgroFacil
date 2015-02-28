package br.com.agrofacil.dao;

import static br.com.agrofacil.dao.SafraDAO.populateSafraInfo;
import br.com.agrofacil.entity.FrenteTransporte;
import br.com.agrofacil.entity.Safra;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class FrenteTransporteDAO extends GenericDAO{
    
    public FrenteTransporteDAO() {
        
    }
    
    public int addFrenteTransporte(FrenteTransporte frente) throws SQLException {
        frente.setId(getNextId("FRENTETRANSPORTE"));
        String sql = "INSERT INTO FRENTETRANSPORTE(ID, DESCRICAO, DISTANCIAINICIAL, DISTANCIAFINAL) VALUES(?, ?, ?, ?)";
        executeCommand(sql, frente.getId(), frente.getDescricao(), frente.getDistanciaInicial(), frente.getDistanciaFinal());
        return frente.getId();
    }
    
    public FrenteTransporte getFrenteTransporte(int idFrente) throws SQLException {
        FrenteTransporte frente = null;
        String sql = "SELECT * FROM FRENTETRANSPORTE WHERE ID = ?";
        ResultSet rs = executeQuery(sql, idFrente);
        if(rs.next()) {
            frente = populateFrenteTransporteInfo(rs);
        }
        rs.close();
        return frente;
    }
    
    public void updateFrenteTransporte(FrenteTransporte frente) throws SQLException {
        String sql = "UPDATE FRENTETRANSPORTE SET DESCRICAO = ?, DISTANCIAINICIAL = ?, DISTANCIAFINAL = ? WHERE ID = ?";
        executeCommand(sql, frente.getDescricao(), frente.getDistanciaInicial(), frente.getDistanciaFinal(), frente.getId());
    }
    
    public void deleteFrenteTransporte(int idFrente) throws SQLException {
        executeCommand("DELETE FROM FRENTETRANSPORTE WHERE ID = ?", idFrente);
    }

    public FrenteTransporte populateFrenteTransporteInfo(ResultSet rs) throws SQLException {
        FrenteTransporte toReturn = new FrenteTransporte();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setDescricao(rs.getString("DESCRICAO"));
        toReturn.setDistanciaInicial(rs.getFloat("DISTANCIAINICIAL"));
        toReturn.setDistanciaFinal(rs.getFloat("DISTANCIAFINAL"));
        
        return toReturn;
    }
    
    public List<FrenteTransporte> getAllFrenteTransporte() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM FRENTETRANSPORTE ");
        List<FrenteTransporte> toReturn = new LinkedList<FrenteTransporte>();
        while(rs.next()) {
            toReturn.add(populateFrenteTransporteInfo(rs));
        }
        rs.close();
        return toReturn;
    }
}
