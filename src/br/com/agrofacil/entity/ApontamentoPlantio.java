/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class ApontamentoPlantio implements java.io.Serializable {
    
    @SwingColumn(description = "Id",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "Safra",colorOfBackgound="")
    private Safra safra;
    @SwingColumn(description = "Fazenda",colorOfBackgound="")
    private Fazenda fazenda;
    @SwingColumn(description = "Setor",colorOfBackgound="")
    private Setor setor;
    @SwingColumn(description = "Talhao",colorOfBackgound="")
    private Talhao talhao;
    @SwingColumn(description = "DataPlantio",colorOfBackgound="")
    private Date dataPlantio;
    @SwingColumn(description = "DataFechamento",colorOfBackgound="")
    private Date dataFechamento;
    @SwingColumn(description = "TipoPlantio",colorOfBackgound="")
    private TipoPlantioColheita tipoPlantio;
    @SwingColumn(description = "Variedade",colorOfBackgound="")
    private Variedade variedade;
    @SwingColumn(description = "Espacamento",colorOfBackgound="")
    private Espacamento espacamento;
    @SwingColumn(description = "AreaPlantada",colorOfBackgound="")
    private float qtdAreaPlantada;
    @SwingColumn(description = "QtdProducao",colorOfBackgound="")
    private float qtdProducao;
    @SwingColumn(description = "Plantio",colorOfBackgound="")
    private boolean plantio;
    @SwingColumn(description = "Concluido",colorOfBackgound="")
    private boolean concluido;
    @SwingColumn(description = "CentroCusto",colorOfBackgound="")
    private CentroCusto centroCusto;
    @SwingColumn(description = "Operacao",colorOfBackgound="")
    private Operacao operacao;
    @SwingColumn(description = "TonEstimada",colorOfBackgound="")    
    private float tonEstimada;
    //@SwingColumn(description = "NumOrdem",colorOfBackgound="")
    private int numeroOrdem;
    @SwingColumn(description = "Ordem",colorOfBackgound="")
    private OrdemCorteMuda ordemCorteMuda;
    
    private List<ApontamentoPlantioItem> itens = new LinkedList<>();
    private List<ApontamentoPlantioItem2> equipamentos = new LinkedList<>();

    public ApontamentoPlantio() {
    }

    public ApontamentoPlantio(Integer id) {
        this.id = id;
    }

    public ApontamentoPlantio(Integer id, Safra safra, Fazenda fazenda, Setor setor, Talhao talhao, Date dataPlantio, Date dataFechamento, TipoPlantioColheita tipoPlantio, Variedade variedade, Espacamento espacamento, float qtdAreaPlantada, float qtdProducao, boolean plantio, boolean concluido, CentroCusto centroCusto, Operacao operacao, float tonEstimada, int numeroOrdem, OrdemCorteMuda ordemCorteMuda) {
        this.id = id;
        this.safra = safra;
        this.fazenda = fazenda;
        this.setor = setor;
        this.talhao = talhao;
        this.dataPlantio = dataPlantio;
        this.dataFechamento = dataFechamento;
        this.tipoPlantio = tipoPlantio;
        this.variedade = variedade;
        this.espacamento = espacamento;
        this.qtdAreaPlantada = qtdAreaPlantada;
        this.qtdProducao = qtdProducao;
        this.plantio = plantio;
        this.concluido = concluido;
        this.centroCusto = centroCusto;
        this.operacao = operacao;
        this.tonEstimada = tonEstimada;
        this.numeroOrdem = numeroOrdem;
        this.ordemCorteMuda = ordemCorteMuda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getDataPlantio() {
        return dataPlantio;
    }

    public void setDataPlantio(Date dataPlantio) {
        this.dataPlantio = dataPlantio;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public TipoPlantioColheita getTipoPlantio() {
        return tipoPlantio;
    }

    public void setTipoPlantio(TipoPlantioColheita tipoPlantio) {
        this.tipoPlantio = tipoPlantio;
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

    public float getQtdAreaPlantada() {
        return qtdAreaPlantada;
    }

    public void setQtdAreaPlantada(float qtdAreaPlantada) {
        this.qtdAreaPlantada = qtdAreaPlantada;
    }

    public float getQtdProducao() {
        return qtdProducao;
    }

    public void setQtdProducao(float qtdProducao) {
        this.qtdProducao = qtdProducao;
    }

    public boolean getPlantio() {
        return plantio;
    }

    public void setPlantio(boolean plantio) {
        this.plantio = plantio;
    }

    public boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public CentroCusto getCentroCusto() {
        return centroCusto;
    }

    public void setCentroCusto(CentroCusto centroCusto) {
        this.centroCusto = centroCusto;
    }

    public Operacao getOperacao() {
        return operacao;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public float getTonEstimada() {
        return tonEstimada;
    }

    public void setTonEstimada(float tonEstimada) {
        this.tonEstimada = tonEstimada;
    }

    public int getNumeroOrdem() {
        return numeroOrdem;
    }

    public void setNumeroOrdem(int numeroOrdem) {
        this.numeroOrdem = numeroOrdem;
    }

    public OrdemCorteMuda getOrdemCorteMuda() {
        return ordemCorteMuda;
    }

    public void setOrdemCorteMuda(OrdemCorteMuda ordemCorteMuda) {
        this.ordemCorteMuda = ordemCorteMuda;
    }
    

    public List<ApontamentoPlantioItem> getItens() {
        return itens;
    }

    public void setItens(List<ApontamentoPlantioItem> itens) {
        this.itens = itens;
    }

    public List<ApontamentoPlantioItem2> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<ApontamentoPlantioItem2> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final ApontamentoPlantio other = (ApontamentoPlantio) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
        
}
