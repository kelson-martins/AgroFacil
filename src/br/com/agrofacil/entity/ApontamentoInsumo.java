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
public class ApontamentoInsumo {
    
    @SwingColumn(description = "Id",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "Data Operacao",colorOfBackgound="")
    private Date dataOperacao;
    @SwingColumn(description = "CentroCusto",colorOfBackgound="")
    private CentroCusto centro;
    @SwingColumn(description = "Operacao",colorOfBackgound="")
    private Operacao operacao;
    @SwingColumn(description = "TipoSistema",colorOfBackgound="")
    private TipoPlantioColheita tipoSistema;
    @SwingColumn(description = "Equipamento",colorOfBackgound="")
    private Equipamento equipamento;
    @SwingColumn(description = "QtdAplicada",colorOfBackgound="")
    private float qtdAplicada;
    @SwingColumn(description = "QtdAreaAplicada",colorOfBackgound="")
    private float qtdAreaAplicada;    
    @SwingColumn(description = "Frente",colorOfBackgound="")
    private FrenteTransporte frente;
    @SwingColumn(description = "Safra",colorOfBackgound="")
    private Safra safra;
    @SwingColumn(description = "Fazenda",colorOfBackgound="")
    private Fazenda fazenda;
    @SwingColumn(description = "Setor",colorOfBackgound="")
    private Setor setor;
    @SwingColumn(description = "Talhao",colorOfBackgound="")
    private Talhao talhao;
    @SwingColumn(description = "Concluido",colorOfBackgound="")
    private boolean concluido;
    @SwingColumn(description = "HoraIni",colorOfBackgound="")
    private String horaIni;
    @SwingColumn(description = "HoraFim",colorOfBackgound="")
    private String horaFim;
    private List<ApontamentoInsumoItem> itens = new LinkedList<ApontamentoInsumoItem>();

    public ApontamentoInsumo() {
    }

    public ApontamentoInsumo(Integer id) {
        this.id = id;
    }

    public ApontamentoInsumo(Integer id, Date dataOperacao, CentroCusto centro, Operacao operacao, TipoPlantioColheita tipoSistema, Equipamento equipamento, float qtdAplicada, FrenteTransporte frente, float qtdAreaAplicada, Safra safra, Fazenda fazenda, Setor setor, Talhao talhao, boolean concluido, String horaIni, String horaFim) {
        this.id = id;
        this.dataOperacao = dataOperacao;
        this.centro = centro;
        this.operacao = operacao;
        this.tipoSistema = tipoSistema;
        this.equipamento = equipamento;
        this.qtdAplicada = qtdAplicada;
        this.frente = frente;
        this.qtdAreaAplicada = qtdAreaAplicada;
        this.safra = safra;
        this.fazenda = fazenda;
        this.setor = setor;
        this.talhao = talhao;
        this.concluido = concluido;
        this.horaIni = horaIni;
        this.horaFim = horaFim;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(Date dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public CentroCusto getCentro() {
        return centro;
    }

    public void setCentro(CentroCusto centro) {
        this.centro = centro;
    }

    public Operacao getOperacao() {
        return operacao;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public TipoPlantioColheita getTipoSistema() {
        return tipoSistema;
    }

    public void setTipoSistema(TipoPlantioColheita tipoSistema) {
        this.tipoSistema = tipoSistema;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public float getQtdAplicada() {
        return qtdAplicada;
    }

    public void setQtdAplicada(float qtdAplicada) {
        this.qtdAplicada = qtdAplicada;
    }

    public FrenteTransporte getFrente() {
        return frente;
    }

    public void setFrente(FrenteTransporte frente) {
        this.frente = frente;
    }

    public float getQtdAreaAplicada() {
        return qtdAreaAplicada;
    }

    public void setQtdAreaAplicada(float qtdAreaAplicada) {
        this.qtdAreaAplicada = qtdAreaAplicada;
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

    public boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public String getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(String horaIni) {
        this.horaIni = horaIni;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public List<ApontamentoInsumoItem> getItens() {
        return itens;
    }

    public void setItens(List<ApontamentoInsumoItem> itens) {
        this.itens = itens;
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
        final ApontamentoInsumo other = (ApontamentoInsumo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
}
