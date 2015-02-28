package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;
import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class Funcionario implements java.io.Serializable {
    
    @SwingColumn(description = "Id",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "CentroCusto",colorOfBackgound="")
    private CentroCusto centroCusto;
    @SwingColumn(description = "Nome",colorOfBackgound="")
    private String nome;
    @SwingColumn(description = "Salario",colorOfBackgound="")
    private float salario;
    @SwingColumn(description = "Sexo",colorOfBackgound="")
    private Sexo sexo;
    @SwingColumn(description = "DataNascimento",colorOfBackgound="")
    private Date dataNascimento;
    @SwingColumn(description = "Endereco",colorOfBackgound="")
    private String endereco;
    @SwingColumn(description = "Municipio",colorOfBackgound="")
    private Municipio municipio;
    @SwingColumn(description = "Cep",colorOfBackgound="")
    private String cep;
    @SwingColumn(description = "Ctps",colorOfBackgound="")
    private String ctps;
    @SwingColumn(description = "Admissao",colorOfBackgound="")
    private Date dataAdmissao;
    @SwingColumn(description = "Rescisao",colorOfBackgound="")
    private Date dataRescisao;
    @SwingColumn(description = "TipoPessoa",colorOfBackgound="")
    private TipoPessoa tipoPessoa;
    @SwingColumn(description = "Cpf",colorOfBackgound="")
    private String cpf;
    @SwingColumn(description = "Rg",colorOfBackgound="")
    private String rg;
    @SwingColumn(description = "UfRg",colorOfBackgound="")
    private UnidadeFederativa ufRg;
    @SwingColumn(description = "Pis",colorOfBackgound="")
    private int pis;
    @SwingColumn(description = "Login",colorOfBackgound="")
    private String login;
    @SwingColumn(description = "Perfil",colorOfBackgound="")
    private Perfil perfil;
    @SwingColumn(description = "Senha",colorOfBackgound="")
    private String senha;
    @SwingColumn(description = "Ativo?",colorOfBackgound="")
    private boolean ativo;
    @SwingColumn(description = "ValidadeSenha",colorOfBackgound="")
    private Date dataValidadeSenha;

    public Funcionario() {
    }

    public Funcionario(Integer id) {
        this.id = id;
    }

    public Funcionario(Integer id, CentroCusto centroCusto, String nome, float salario, Sexo sexo, Date dataNascimento, String endereco, Municipio municipio, String cep, String ctps, Date dataAdmissao, Date dataRescisao, TipoPessoa tipoPessoa, String cpf, String rg, UnidadeFederativa ufRg, int pis, String login, Perfil perfil, String senha, boolean ativo, Date dataValidadeSenha) {
        this.id = id;
        this.centroCusto = centroCusto;
        this.nome = nome;
        this.salario = salario;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.municipio = municipio;
        this.cep = cep;
        this.ctps = ctps;
        this.dataAdmissao = dataAdmissao;
        this.dataRescisao = dataRescisao;
        this.tipoPessoa = tipoPessoa;
        this.cpf = cpf;
        this.rg = rg;
        this.ufRg = ufRg;
        this.pis = pis;
        this.login = login;
        this.perfil = perfil;
        this.senha = senha;
        this.ativo = ativo;
        this.dataValidadeSenha = dataValidadeSenha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CentroCusto getCentroCusto() {
        return centroCusto;
    }

    public void setCentroCusto(CentroCusto centroCusto) {
        this.centroCusto = centroCusto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Date getDataRescisao() {
        return dataRescisao;
    }

    public void setDataRescisao(Date dataRescisao) {
        this.dataRescisao = dataRescisao;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public UnidadeFederativa getUfRg() {
        return ufRg;
    }

    public void setUfRg(UnidadeFederativa ufRg) {
        this.ufRg = ufRg;
    }

    public int getPis() {
        return pis;
    }

    public void setPis(int pis) {
        this.pis = pis;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Date getDataValidadeSenha() {
        return dataValidadeSenha;
    }

    public void setDataValidadeSenha(Date dataValidadeSenha) {
        this.dataValidadeSenha = dataValidadeSenha;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
