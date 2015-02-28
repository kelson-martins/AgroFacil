/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;
import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class ObjetivoSafra implements java.io.Serializable {
    @SwingColumn(description = "ID",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "Historico",colorOfBackgound="")
    private HistoricoSafra historico;    
    private Safra safra;
    @SwingColumn(description = "Fazenda",colorOfBackgound="")
    private Fazenda fazenda;
    @SwingColumn(description = "Setor",colorOfBackgound="")
    private Setor setor;
    @SwingColumn(description = "Talhao",colorOfBackgound="")
    private Talhao talhao;
    @SwingColumn(description = "DataHistorico",colorOfBackgound="")
    private Date  dataHistorico;
    @SwingColumn(description = "TipoPropriedade",colorOfBackgound="")
    private TipoPropriedade tipropriedade;
    @SwingColumn(description = "FrenteTransporte",colorOfBackgound="")
    private FrenteTransporte frente;    
    private TipoPlantioColheita tipoColheita;
    @SwingColumn(description = "Variedade",colorOfBackgound="")
    private Variedade variedade;
    @SwingColumn(description = "Espacamento",colorOfBackgound="")
    private Espacamento espacamento;
    @SwingColumn(description = "TipoPlantio",colorOfBackgound="")
    private TipoPlantioColheita tipoPlantio;
    @SwingColumn(description = "Empresa",colorOfBackgound="")
    private Empresa empresa;
    @SwingColumn(description = "UnidadeInd",colorOfBackgound="")
    private UnidadeIndustrial unidadeIndustrial;
    @SwingColumn(description = "DistTerra",colorOfBackgound="")
    private float distTerra;
    @SwingColumn(description = "DistAsf",colorOfBackgound="")
    private float distAsfalto;
    @SwingColumn(description = "DistHid",colorOfBackgound="")
    private float distHidrovia;
    @SwingColumn(description = "Idade",colorOfBackgound="")
    private int idade;
    @SwingColumn(description = "AreaProd",colorOfBackgound="")
    private float areaProdutiva;
    @SwingColumn(description = "Thc",colorOfBackgound="")
    private float thc;

    public ObjetivoSafra() {
    }

    public ObjetivoSafra(Integer id) {
        this.id = id;
    }

    public ObjetivoSafra(Integer id, HistoricoSafra historico, Safra safra, Fazenda fazenda, Setor setor, Talhao talhao, Date dataHistorico, TipoPropriedade tipropriedade, FrenteTransporte frente, TipoPlantioColheita tipoColheita, Variedade variedade, Espacamento espacamento, TipoPlantioColheita tipoPlantio, Empresa empresa, UnidadeIndustrial unidadeIndustrial, float distTerra, float distAsfalto, float distHidrovia, int idade, float areaProdutiva, float thc) {
        this.id = id;
        this.historico = historico;
        this.safra = safra;
        this.fazenda = fazenda;
        this.setor = setor;
        this.talhao = talhao;
        this.dataHistorico = dataHistorico;
        this.tipropriedade = tipropriedade;
        this.frente = frente;
        this.tipoColheita = tipoColheita;
        this.variedade = variedade;
        this.espacamento = espacamento;
        this.tipoPlantio = tipoPlantio;
        this.empresa = empresa;
        this.unidadeIndustrial = unidadeIndustrial;
        this.distTerra = distTerra;
        this.distAsfalto = distAsfalto;
        this.distHidrovia = distHidrovia;
        this.idade = idade;
        this.areaProdutiva = areaProdutiva;
        this.thc = thc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HistoricoSafra getHistorico() {
        return historico;
    }

    public void setHistorico(HistoricoSafra historico) {
        this.historico = historico;
    }

    public Safra getSafra() {
        return safra;
    }

    public void setSafra(Safra safra) {
        this.safra = safra;
    }

    public Fazenda getFazenda() {
        return fazenda;
    }

    public void setFazenda(Fazenda fazenda) {
        this.fazenda = fazenda;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Talhao getTalhao() {
        return talhao;
    }

    public void setTalhao(Talhao talhao) {
        this.talhao = talhao;
    }

    public Date getDataHistorico() {
        return dataHistorico;
    }

    public void setDataHistorico(Date dataHistorico) {
        this.dataHistorico = dataHistorico;
    }

    public TipoPropriedade getTipropriedade() {
        return tipropriedade;
    }

    public void setTipropriedade(TipoPropriedade tipropriedade) {
        this.tipropriedade = tipropriedade;
    }

    public FrenteTransporte getFrente() {
        return frente;
    }

    public void setFrente(FrenteTransporte frente) {
        this.frente = frente;
    }

    public TipoPlantioColheita getTipoColheita() {
        return tipoColheita;
    }

    public void setTipoColheita(TipoPlantioColheita tipoColheita) {
        this.tipoColheita = tipoColheita;
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

    public TipoPlantioColheita getTipoPlantio() {
        return tipoPlantio;
    }

    public void setTipoPlantio(TipoPlantioColheita tipoPlantio) {
        this.tipoPlantio = tipoPlantio;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAreaProdutiva() {
        return areaProdutiva;
    }

    public void setAreaProdutiva(float areaProdutiva) {
        this.areaProdutiva = areaProdutiva;
    }

    public float getThc() {
        return thc;
    }

    public void setThc(float thc) {
        this.thc = thc;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.id);
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
        final ObjetivoSafra other = (ObjetivoSafra) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
    
    
}
