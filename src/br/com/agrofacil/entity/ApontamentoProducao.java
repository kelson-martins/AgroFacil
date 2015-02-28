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
public class ApontamentoProducao implements java.io.Serializable{
    @SwingColumn(description = "Id",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "TipoPlantioColheita",colorOfBackgound="")
    private TipoPlantioColheita tipoPlantioColheita;
    @SwingColumn(description = "CC",colorOfBackgound="")
    private CentroCusto centroCusto;
    @SwingColumn(description = "Operacao",colorOfBackgound="")
    private Operacao operacao;
    @SwingColumn(description = "Equipamento",colorOfBackgound="")
    private Equipamento equipamento;
    @SwingColumn(description = "Frente",colorOfBackgound="")
    private FrenteTransporte frenteTransporte;
    @SwingColumn(description = "Safra",colorOfBackgound="")
    private Safra safra;
    @SwingColumn(description = "Fazenda",colorOfBackgound="")
    private Fazenda fazenda;
    @SwingColumn(description = "Setor",colorOfBackgound="")
    private Setor setor;
    @SwingColumn(description = "Talhao",colorOfBackgound="")
    private Talhao talhao;
    @SwingColumn(description = "QtdKmIni",colorOfBackgound="")
    private int qtdKmIni;
    @SwingColumn(description = "QtdKmFim",colorOfBackgound="")
    private int qtdKmFim;
    @SwingColumn(description = "QtdTotalHoras",colorOfBackgound="")
    private float qtdTotalHoras;
    @SwingColumn(description = "QtdProducao",colorOfBackgound="")
    private float qtdProducao;
    @SwingColumn(description = "DataOperação",colorOfBackgound="")
    private Date dataOperacao;    

    public ApontamentoProducao(Integer id) {
        this.id = id;
    }

    public ApontamentoProducao() {
    }

    public ApontamentoProducao(Integer id, TipoPlantioColheita tipoPlantioColheita, CentroCusto centroCusto, Operacao operacao, Equipamento equipamento, FrenteTransporte frenteTransporte, Safra safra, Fazenda fazenda, Setor setor, Talhao talhao, int qtdKmIni, int qtdKmFim, float qtdTotalHoras, float qtdProducao, Date dataOperacao) {
        this.id = id;
        this.tipoPlantioColheita = tipoPlantioColheita;
        this.centroCusto = centroCusto;
        this.operacao = operacao;
        this.equipamento = equipamento;
        this.frenteTransporte = frenteTransporte;
        this.safra = safra;
        this.fazenda = fazenda;
        this.setor = setor;
        this.talhao = talhao;
        this.qtdKmIni = qtdKmIni;
        this.qtdKmFim = qtdKmFim;
        this.qtdTotalHoras = qtdTotalHoras;
        this.qtdProducao = qtdProducao;
        this.dataOperacao = dataOperacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoPlantioColheita getTipoPlantioColheita() {
        return tipoPlantioColheita;
    }

    public void setTipoPlantioColheita(TipoPlantioColheita tipoPlantioColheita) {
        this.tipoPlantioColheita = tipoPlantioColheita;
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

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public Date getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(Date dataOperacao) {
        this.dataOperacao = dataOperacao;
    }       

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public FrenteTransporte getFrenteTransporte() {
        return frenteTransporte;
    }

    public void setFrenteTransporte(FrenteTransporte frenteTransporte) {
        this.frenteTransporte = frenteTransporte;
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

    public int getQtdKmIni() {
        return qtdKmIni;
    }

    public void setQtdKmIni(int qtdKmIni) {
        this.qtdKmIni = qtdKmIni;
    }

    public int getQtdKmFim() {
        return qtdKmFim;
    }

    public void setQtdKmFim(int qtdKmFim) {
        this.qtdKmFim = qtdKmFim;
    }

    public float getQtdTotalHoras() {
        return qtdTotalHoras;
    }

    public void setQtdTotalHoras(float qtdTotalHoras) {
        this.qtdTotalHoras = qtdTotalHoras;
    }

    public float getQtdProducao() {
        return qtdProducao;
    }

    public void setQtdProducao(float qtdProducao) {
        this.qtdProducao = qtdProducao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final ApontamentoProducao other = (ApontamentoProducao) obj;
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
