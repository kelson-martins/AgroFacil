package br.com.agrofacil.dao;

import br.com.agrofacil.entity.Funcionario;
import br.com.agrofacil.entity.Sexo;
import br.com.agrofacil.entity.TipoPessoa;
import br.com.agrofacil.entity.UnidadeFederativa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelson
 */
public class FuncionarioDAO extends GenericDAO {

    public FuncionarioDAO() {
    }
    
    public int addFuncionario(Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO FUNCIONARIO VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        funcionario.setId(getNextId("FUNCIONARIO"));
        executeCommand(sql,
        funcionario.getId(),
        funcionario.getCentroCusto().getId(),
        funcionario.getNome(),
        funcionario.getSalario(),
        funcionario.getSexo().toString(),
        funcionario.getDataNascimento(),
        funcionario.getEndereco(),
        funcionario.getMunicipio().getId(),
        funcionario.getCep(),
        funcionario.getCtps(),
        funcionario.getDataAdmissao(),
        funcionario.getDataRescisao(),
        funcionario.getTipoPessoa().toString(),
        funcionario.getCpf(),
        funcionario.getRg(),
        funcionario.getUfRg().toString(),
        funcionario.getPis(),
        funcionario.getLogin(),
        funcionario.getPerfil().getId(),
        funcionario.getSenha(),
        funcionario.getAtivo(),
        funcionario.getDataValidadeSenha()
        
        );
        return funcionario.getId();
    }
    
    public void deleteFuncionario(int id) throws SQLException {
        executeCommand("DELETE FROM FUNCIONARIO WHERE ID = ?", id);
    }
    
    public Funcionario getFuncionario(int id) throws SQLException {
        Funcionario funcionario = new Funcionario();
        String sql = "SELECT * FROM FUNCIONARIO WHERE ID = ?";
        ResultSet rs = executeQuery(sql, id);
        if (rs.next()) {
            funcionario = populateFuncionarioInfo(rs);
        }
        
        return funcionario;
    }
    
    public List<Funcionario> getAllFuncionario() throws SQLException {
        List<Funcionario> funcionarios = new LinkedList<Funcionario>();
        ResultSet rs = executeQuery("SELECT * FROM FUNCIONARIO");
        while (rs.next()) {
            funcionarios.add(populateFuncionarioInfo(rs));
        }
        return funcionarios;
    }

    public Funcionario populateFuncionarioInfo(ResultSet rs) throws SQLException {
        Funcionario toReturn = new Funcionario();
        CentroCustoDAO centro = new CentroCustoDAO();
        MunicipioDAO municipio = new MunicipioDAO();
        PerfilDAO perfil = new PerfilDAO();
        
        toReturn.setId(rs.getInt("ID"));
        toReturn.setCentroCusto(centro.getCentroCusto(rs.getInt("IDCENTROCUSTO")));
        toReturn.setNome(rs.getString("NOME"));
        toReturn.setSalario(rs.getFloat("SALARIO"));
        toReturn.setSexo(Sexo.valueOf(rs.getString("SEXO")));
        toReturn.setDataNascimento(rs.getDate("DATANASCIMENTO"));
        toReturn.setEndereco(rs.getString("ENDERECO"));
        toReturn.setMunicipio(municipio.getMunicipio(rs.getInt("IDMUNICIPIO")));
        toReturn.setCep(rs.getString("CEP"));
        toReturn.setCtps(rs.getString("CTPS"));
        toReturn.setDataAdmissao(rs.getDate("DATAADMISSAO"));
        toReturn.setDataRescisao(rs.getDate("DATARESCISAO"));
        toReturn.setTipoPessoa(TipoPessoa.valueOf(rs.getString("TIPOPESSOA")));
        toReturn.setCpf(rs.getString("CPF"));
        toReturn.setRg(rs.getString("RG"));
        toReturn.setUfRg(UnidadeFederativa.valueOf(rs.getString("UFRG")));
        toReturn.setPis(rs.getInt("PIS"));
        toReturn.setLogin(rs.getString("LOGIN"));
        toReturn.setPerfil(perfil.getPerfil(rs.getInt("IDPERFIL")));
        toReturn.setSenha(rs.getString("SENHA"));
        toReturn.setAtivo(rs.getBoolean("ATIVO"));
        toReturn.setDataValidadeSenha(rs.getDate("DATAVALIDADESENHA"));
        
        return toReturn;
    }
    
    public Funcionario getUser(String username, String password) throws SQLException {
      
      Funcionario user = new Funcionario();
      String sql = "";
      ResultSet rs = executeQuery("SELECT * FROM FUNCIONARIO WHERE LOGIN = ? AND  SENHA = ?", username, password);
      if (rs.next()) {
          user = populateFuncionarioInfo(rs);
      }
      
      return user;
    } 
}
