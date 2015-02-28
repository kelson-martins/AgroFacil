/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.entity;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class Talhao implements java.io.Serializable{

    private Integer id;
    private String descricao;
    private Fazenda fazenda;
    private Setor setor;
    private Safra safra;
    private FrenteTransporte frenteTransporte;
    private float distTerra;
    private float distAsfalto;
    private float distHidrovia;
    private Variedade variedade;
    private Espacamento espacamento;
    private float qtdAreaProd;
    private Empresa empresa;
    private UnidadeIndustrial unidadeIndustrial;
    private float qtdAreaMuda;
    private Date dataSituacao;
    private SituacaoLocalProducao situacao;
    
    public Talhao() {
        
    }

    public Talhao(Integer id, String descricao, Fazenda fazenda, Setor setor,Safra safra, FrenteTransporte frenteTransporte, float distTerra, float distAsfalto, float distHidrovia, Variedade variedade, Espacamento espacamento, float qtdAreaProd, Empresa empresa, UnidadeIndustrial unidadeIndustrial, float qtdAreaMuda, Date dataSituacao, SituacaoLocalProducao situacao) {
        this.id = id;
        this.descricao = descricao;
        this.fazenda = fazenda;
        this.setor = setor;
        this.safra = safra;
        this.frenteTransporte = frenteTransporte;
        this.distTerra = distTerra;
        this.distAsfalto = distAsfalto;
        this.distHidrovia = distHidrovia;
        this.variedade = variedade;
        this.espacamento = espacamento;
        this.qtdAreaProd = qtdAreaProd;
        this.empresa = empresa;
        this.unidadeIndustrial = unidadeIndustrial;
        this.qtdAreaMuda = qtdAreaMuda;
        this.dataSituacao = dataSituacao;
        this.situacao = situacao;
    }

    public Talhao(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Fazenda getFazenda() {
        return fazenda;
    }

    public void setFazenda(Fazenda fazenda) {
        this.fazenda = fazenda;
    }

    public Safra getSafra() {
        return safra;
    }

    public void setSafra(Safra safra) {
        this.safra = safra;
    }

    public FrenteTransporte getFrenteTransporte() {
        return frenteTransporte;
    }

    public void setFrenteTransporte(FrenteTransporte frenteTransporte) {
        this.frenteTransporte = frenteTransporte;
    }

    public float getDistTerra() {
        return distTerra;
    }

    public void setDistTerra(float distTerra) {
        this.distTerra = distTerra;
    }

    public float getDistAsfalto() {
        return distAsfalto;
    }

    public void setDistAsfalto(float distAsfalto) {
        this.distAsfalto = distAsfalto;
    }

    public float getDistHidrovia() {
        return distHidrovia;
    }

    public void setDistHidrovia(float distHidrovia) {
        this.distHidrovia = distHidrovia;
    }

    public Variedade getVariedade() {
        return variedade;
    }

    public void setVariedade(Variedade variedade) {
        this.variedade = variedade;
    }

    public Espacamento getEspacamento() {
        return espacamento;
    }

    public void setEspacamento(Espacamento espacamento) {
        this.espacamento = espacamento;
    }

    public float getQtdAreaProd() {
        return qtdAreaProd;
    }

    public void setQtdAreaProd(float qtdAreaProd) {
        this.qtdAreaProd = qtdAreaProd;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public UnidadeIndustrial getUnidadeIndustrial() {
        return unidadeIndustrial;
    }

    public void setUnidadeIndustrial(UnidadeIndustrial unidadeIndustrial) {
        this.unidadeIndustrial = unidadeIndustrial;
    }

    public float getQtdAreaMuda() {
        return qtdAreaMuda;
    }

    public void setQtdAreaMuda(float qtdAreaMuda) {
        this.qtdAreaMuda = qtdAreaMuda;
    }

    public Date getDataSituacao() {
        return dataSituacao;
    }

    public void setDataSituacao(Date dataSituacao) {
        this.dataSituacao = dataSituacao;
    }

    public SituacaoLocalProducao getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoLocalProducao situacao) {
        this.situacao = situacao;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Talhao other = (Talhao) obj;
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
