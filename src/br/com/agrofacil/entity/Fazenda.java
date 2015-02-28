/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.entity;

import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class Fazenda extends Area implements java.io.Serializable{
    private Integer id;
    private Municipio municipio;
    private String descricao;
    private String endereco;
    private String telefone;
    private String cpfcgc;
    private String inscricaoIncra;
    private String inscricaoProdutor;
    private String cep;
    private TipoPessoa tipoPessoa;
    private boolean funrual;
    private String razaoSocialFundo;
    private String imovelReceita;
    private float qtdAreaMat;
    private String cnpjPesFis;

    public Fazenda(Integer id, Municipio municipio, String descricao, String endereco, String telefone, String cpfcgc, String inscricaoIncra, String inscricaoProdutor, String cep, TipoPessoa tipoPessoa, boolean funrual, String razaoSocialFundo, String imovelReceita, float qtdAreaMat, String cnpjPesFis, float areaTotal, float areaProdutiva, float areaArrendamento) {
        super(areaTotal, areaProdutiva, areaArrendamento);
        this.id = id;
        this.municipio = municipio;
        this.descricao = descricao;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpfcgc = cpfcgc;
        this.inscricaoIncra = inscricaoIncra;
        this.inscricaoProdutor = inscricaoProdutor;
        this.cep = cep;
        this.tipoPessoa = tipoPessoa;
        this.funrual = funrual;
        this.razaoSocialFundo = razaoSocialFundo;
        this.imovelReceita = imovelReceita;
        this.qtdAreaMat = qtdAreaMat;
        this.cnpjPesFis = cnpjPesFis;
    }

    public Fazenda(float areaTotal, float areaProdutiva, float areaArrendamento) {
        super(areaTotal, areaProdutiva, areaArrendamento);
    }

    public Fazenda(Integer id, float areaTotal, float areaProdutiva, float areaArrendamento) {
        super(areaTotal, areaProdutiva, areaArrendamento);
        this.id = id;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpfcgc() {
        return cpfcgc;
    }

    public void setCpfcgc(String cpfcgc) {
        this.cpfcgc = cpfcgc;
    }

    public String getInscricaoIncra() {
        return inscricaoIncra;
    }

    public void setInscricaoIncra(String inscricaoIncra) {
        this.inscricaoIncra = inscricaoIncra;
    }

    public String getInscricaoProdutor() {
        return inscricaoProdutor;
    }

    public void setInscricaoProdutor(String inscricaoProdutor) {
        this.inscricaoProdutor = inscricaoProdutor;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public boolean isFunrual() {
        return funrual;
    }

    public void setFunrual(boolean funrual) {
        this.funrual = funrual;
    }

    public String getRazaoSocialFundo() {
        return razaoSocialFundo;
    }

    public void setRazaoSocialFundo(String razaoSocialFundo) {
        this.razaoSocialFundo = razaoSocialFundo;
    }

    public String getImovelReceita() {
        return imovelReceita;
    }

    public void setImovelReceita(String imovelReceita) {
        this.imovelReceita = imovelReceita;
    }

    public float getQtdAreaMat() {
        return qtdAreaMat;
    }

    public void setQtdAreaMat(float qtdAreaMat) {
        this.qtdAreaMat = qtdAreaMat;
    }

    public String getCnpjPesFis() {
        return cnpjPesFis;
    }

    public void setCnpjPesFis(String cnpjPesFis) {
        this.cnpjPesFis = cnpjPesFis;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.id);
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
        final Fazenda other = (Fazenda) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descricao;
    }
     
    
}
