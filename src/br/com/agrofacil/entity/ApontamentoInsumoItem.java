package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;

/**
 *
 * @author Kelson
 */
public class ApontamentoInsumoItem implements java.io.Serializable {
        
    private int id;
    //@SwingColumn(description = "Sequencia",colorOfBackgound="")
    private int sequencia;
    //@SwingColumn(description = "Equipamento",colorOfBackgound="")
    private Equipamento equipamento;
    @SwingColumn(description = "Insumo",colorOfBackgound="")
    private Insumo insumo;    
    @SwingColumn(description = "Dose",colorOfBackgound="")
    private float doseProgramada;    
    @SwingColumn(description = "Vazao",colorOfBackgound="")
    private float vazaoProgramada;
    @SwingColumn(description = "QtdTotal",colorOfBackgound="")
    private float qtdTotal;
    private ApontamentoInsumo apontamentoInsumo;

    public ApontamentoInsumoItem() {
    }

    public ApontamentoInsumoItem(int id) {
        this.id = id;
    }

    public ApontamentoInsumoItem(int id, int sequencia, float doseProgramada, Equipamento equipamento, float vazaoProgramada, float qtdTotal, ApontamentoInsumo apontamentoInsumo, Insumo insumo) {
        this.id = id;
        this.sequencia = sequencia;
        this.doseProgramada = doseProgramada;
        this.equipamento = equipamento;
        this.vazaoProgramada = vazaoProgramada;
        this.qtdTotal = qtdTotal;
        this.apontamentoInsumo = apontamentoInsumo;
        this.insumo = insumo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public float getDoseProgramada() {
        return doseProgramada;
    }

    public void setDoseProgramada(float doseProgramada) {
        this.doseProgramada = doseProgramada;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public float getVazaoProgramada() {
        return vazaoProgramada;
    }

    public void setVazaoProgramada(float vazaoProgramada) {
        this.vazaoProgramada = vazaoProgramada;
    }

    public float getQtdTotal() {
        return qtdTotal;
    }

    public void setQtdTotal(float qtdTotal) {
        this.qtdTotal = qtdTotal;
    }

    public ApontamentoInsumo getApontamentoInsumo() {
        return apontamentoInsumo;
    }

    public void setApontamentoInsumo(ApontamentoInsumo apontamentoInsumo) {
        this.apontamentoInsumo = apontamentoInsumo;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }        
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id;
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
        final ApontamentoInsumoItem other = (ApontamentoInsumoItem) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
