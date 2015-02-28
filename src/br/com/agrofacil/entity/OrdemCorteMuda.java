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
public class OrdemCorteMuda implements java.io.Serializable {
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
    @SwingColumn(description = "TipoCorte",colorOfBackgound="")
    private TipoCorteQueima tipoCorte;
    @SwingColumn(description = "Variedade",colorOfBackgound="")
    private Variedade variedade;
    @SwingColumn(description = "TipoColheita",colorOfBackgound="")
    private TipoPlantioColheita tipoColheita;
    @SwingColumn(description = "DataOrdem",colorOfBackgound="")
    private Date dataOrdem;
    @SwingColumn(description = "HoraOrdem",colorOfBackgound="")
    private String horaOrdem;
    @SwingColumn(description = "AreaTotal",colorOfBackgound="")
    private float qtdAreaTotal;
    @SwingColumn(description = "EstimativaTotal",colorOfBackgound="")
    private float qtdEstTotal;

    public OrdemCorteMuda() {
    }

    public OrdemCorteMuda(Integer id) {
        this.id = id;
    }

    public OrdemCorteMuda(Integer id, Safra safra, Fazenda fazenda, Setor setor, Talhao talhao, TipoCorteQueima tipoCorte, Variedade variedade, TipoPlantioColheita tipoColheita, Date dataOrdem, String horaOrdem, float qtdAreaTotal, float qtdEstTotal) {
        this.id = id;
        this.safra = safra;
        this.fazenda = fazenda;
        this.setor = setor;
        this.talhao = talhao;
        this.tipoCorte = tipoCorte;
        this.variedade = variedade;
        this.tipoColheita = tipoColheita;
        this.dataOrdem = dataOrdem;
        this.horaOrdem = horaOrdem;
        this.qtdAreaTotal = qtdAreaTotal;
        this.qtdEstTotal = qtdEstTotal;
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

    public TipoCorteQueima getTipoCorte() {
        return tipoCorte;
    }

    public void setTipoCorte(TipoCorteQueima tipoCorte) {
        this.tipoCorte = tipoCorte;
    }

    public Variedade getVariedade() {
        return variedade;
    }

    public void setVariedade(Variedade variedade) {
        this.variedade = variedade;
    }

    public TipoPlantioColheita getTipoColheita() {
        return tipoColheita;
    }

    public void setTipoColheita(TipoPlantioColheita tipoColheita) {
        this.tipoColheita = tipoColheita;
    }

    public Date getDataOrdem() {
        return dataOrdem;
    }

    public void setDataOrdem(Date dataOrdem) {
        this.dataOrdem = dataOrdem;
    }

    public String getHoraOrdem() {
        return horaOrdem;
    }

    public void setHoraOrdem(String horaOrdem) {
        this.horaOrdem = horaOrdem;
    }

    public float getQtdAreaTotal() {
        return qtdAreaTotal;
    }

    public void setQtdAreaTotal(float qtdAreaTotal) {
        this.qtdAreaTotal = qtdAreaTotal;
    }

    public float getQtdEstTotal() {
        return qtdEstTotal;
    }

    public void setQtdEstTotal(float qtdEstTotal) {
        this.qtdEstTotal = qtdEstTotal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.id);
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
        final OrdemCorteMuda other = (OrdemCorteMuda) obj;
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
