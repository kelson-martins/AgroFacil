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
public class ApontamentoManual implements java.io.Serializable{
    @SwingColumn(description = "Id",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "DataOperacao",colorOfBackgound="")
    private Date dataOperacao;
    @SwingColumn(description = "Funcionario",colorOfBackgound="")
    private Funcionario funcionario;
    @SwingColumn(description = "CentroCusto",colorOfBackgound="")
    private CentroCusto centroCusto;
    @SwingColumn(description = "Operacao",colorOfBackgound="")
    private Operacao operacao;
    @SwingColumn(description = "Safra",colorOfBackgound="")
    private Safra safra;
    @SwingColumn(description = "Fazenda",colorOfBackgound="")
    private Fazenda fazenda;
    @SwingColumn(description = "Setor",colorOfBackgound="")
    private Setor setor;
    @SwingColumn(description = "Talhao",colorOfBackgound="")
    private Talhao talhao;
    @SwingColumn(description = "HoraInicial",colorOfBackgound="")
    private String horaInicial;
    @SwingColumn(description = "HoraFinal",colorOfBackgound="")
    private String horaFinal;
    @SwingColumn(description = "HorasTotais",colorOfBackgound="")
    private String horasTotais;
    @SwingColumn(description = "HorasExtras",colorOfBackgound="")
    private String horasExtras;
    @SwingColumn(description = "Frente",colorOfBackgound="")
    private FrenteTransporte frente;
    @SwingColumn(description = "QtdProd",colorOfBackgound="")
    private float qtdProducao;

    public ApontamentoManual() {
    }

    public ApontamentoManual(Integer id) {
        this.id = id;
    }

    public ApontamentoManual(Integer id, Date dataOperacao, Funcionario funcionario, CentroCusto centroCusto, Operacao operacao, Safra safra, Fazenda fazenda, Setor setor, Talhao talhao, String horaInicial, String horaFinal, String horasTotais, String horasExtras, FrenteTransporte frente, float qtdProducao) {
        this.id = id;
        this.dataOperacao = dataOperacao;
        this.funcionario = funcionario;
        this.centroCusto = centroCusto;
        this.operacao = operacao;
        this.safra = safra;
        this.fazenda = fazenda;
        this.setor = setor;
        this.talhao = talhao;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.horasTotais = horasTotais;
        this.horasExtras = horasExtras;
        this.frente = frente;
        this.qtdProducao = qtdProducao;
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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
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

    public String getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getHorasTotais() {
        return horasTotais;
    }

    public void setHorasTotais(String horasTotais) {
        this.horasTotais = horasTotais;
    }

    public String getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(String horasExtras) {
        this.horasExtras = horasExtras;
    }

    public FrenteTransporte getFrente() {
        return frente;
    }

    public void setFrente(FrenteTransporte frente) {
        this.frente = frente;
    }

    public float getQtdProducao() {
        return qtdProducao;
    }

    public void setQtdProducao(float qtdProducao) {
        this.qtdProducao = qtdProducao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final ApontamentoManual other = (ApontamentoManual) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
   
}
