package br.com.agrofacil.entity;

import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class Empresa implements java.io.Serializable {
    
    private Integer id;
    private Municipio municipio;
    private String descricao;
    private String endereco;
    private String cep;
    private String cgc;
    private String inscricaoEstadual;
    private String telefone;
    private String fax;
    private String razaoSocial;
    private boolean ativa;

    public Empresa() {
    }

    public Empresa(Integer id) {
        this.id = id;
    }

    public Empresa(Integer id, Municipio municipio, String descricao, String endereco, String cep, String cgc, String inscricaoEstadual, String telefone, String fax, String razaoSocial, boolean ativa) {
        this.id = id;
        this.municipio = municipio;
        this.descricao = descricao;
        this.endereco = endereco;
        this.cep = cep;
        this.cgc = cgc;
        this.inscricaoEstadual = inscricaoEstadual;
        this.telefone = telefone;
        this.fax = fax;
        this.razaoSocial = razaoSocial;
        this.ativa = ativa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCgc() {
        return cgc;
    }

    public void setCgc(String cgc) {
        this.cgc = cgc;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }       

    @Override
    public String toString() {
        return getDescricao();
    }
    
    
}
