package br.com.agrofacil.dao;

import br.com.agrofacil.entity.Empresa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class EmpresaDAO extends GenericDAO {

    public EmpresaDAO() {
    }
    
    public int addEmpresa(Empresa empresa) throws SQLException {
        empresa.setId(getNextId("EMPRESA"));
        String sql = "INSERT INTO EMPRESA(ID, IDMUNICIPIO, DESCRICAO, CEP, CGC, INSCRICAOESTADUAL, TELEFONE, FAX, RAZAOSOCIAL, ATIVA, ENDERECO) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        executeCommand(sql, empresa.getId(), empresa.getMunicipio().getId(), empresa.getDescricao(), empresa.getCep(), empresa.getCgc(), empresa.getInscricaoEstadual(), empresa.getTelefone(), empresa.getFax(), empresa.getRazaoSocial(), empresa.isAtiva(), empresa.getEndereco());        
        return empresa.getId();
    }
    
    public Empresa getEmpresa(int id) throws SQLException {
        String sql = "SELECT * FROM EMPRESA WHERE ID = ?";
        ResultSet rs = executeQuery(sql, id);
        Empresa empresa = new Empresa();
        if (rs.next()) {
            empresa = populateteEmpresaInfo(rs);
        }      
        rs.close();
        
        return empresa;
    }

    public Empresa populateteEmpresaInfo(ResultSet rs) throws SQLException {
        Empresa toReturn = new Empresa();
        MunicipioDAO municipioDAO = new MunicipioDAO();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setMunicipio(municipioDAO.getMunicipio(rs.getInt("IDMUNICIPIO")));
        toReturn.setDescricao(rs.getString("DESCRICAO"));
        toReturn.setCep(rs.getString("CEP"));
        toReturn.setCgc(rs.getString("CGC"));
        toReturn.setInscricaoEstadual(rs.getString("INSCRICAOESTADUAL"));
        toReturn.setTelefone(rs.getString("TELEFONE"));
        toReturn.setFax(rs.getString("FAX"));
        toReturn.setRazaoSocial(rs.getString("RAZAOSOCIAL"));
        toReturn.setEndereco(rs.getString("ENDERECO"));
        toReturn.setAtiva(rs.getBoolean("ATIVA"));
        return toReturn;
    }
    
    public void updateEmpresa(Empresa empresa) throws SQLException {
        String sql = "UPDATE EMPRESA SET DESCRICAO = ?, IDMUNICIPIO = ?, CEP = ?, CGC = ?, INSCRICAOESTADUAL = ?, TELEFONE = ?, FAX = ?, RAZAOSOCIAL = ?, ATIVA = ?, ENDERECO = ? WHERE ID = ?";
        executeCommand(sql, empresa.getDescricao(), empresa.getMunicipio().getId(), empresa.getCep(), empresa.getCgc(), empresa.getInscricaoEstadual(), empresa.getTelefone(), empresa.getFax(), empresa.getRazaoSocial(), empresa.isAtiva(), empresa.getEndereco(), empresa.getId());
    }
    
    public void deleteEmpresa(int id) throws SQLException {
        executeCommand("DELETE FROM EMPRESA WHERE ID = ?", id);
    }
    
    public List<Empresa> getAllEmpresa() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM EMPRESA ");
        List<Empresa> toReturn = new LinkedList<Empresa>();
        while(rs.next()) {
            toReturn.add(populateteEmpresaInfo(rs));
        }
        rs.close();
        return toReturn;
    }

}
