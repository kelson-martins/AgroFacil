package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;
import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class Variedade implements java.io.Serializable{
    @SwingColumn(description = "Id",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "Descrição",colorOfBackgound="")
    private String descricao;   
    private boolean maturada;
    @SwingColumn(description = "MesIni",colorOfBackgound="")
    private int mesIniColheita;
    @SwingColumn(description = "MesFin",colorOfBackgound="")
    private int mesFimColheita;
    
    public Variedade() {
    }

    public Variedade(Integer id) {
        this.id = id;
    }

    public Variedade(Integer id, String descricao, boolean maturada, int mesIniColheita, int mesFimColheita) {
        this.id = id;
        this.descricao = descricao;
        this.maturada = maturada;
        this.mesIniColheita = mesIniColheita;
        this.mesFimColheita = mesFimColheita;
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

    public boolean isMaturada() {
        return maturada;
    }

    public void setMaturada(boolean maturada) {
        this.maturada = maturada;
    }

    public int getMesIniColheita() {
        return mesIniColheita;
    }

    public void setMesIniColheita(int mesIniColheita) {
        this.mesIniColheita = mesIniColheita;
    }

    public int getMesFimColheita() {
        return mesFimColheita;
    }

    public void setMesFinColheita(int mesFimColheita) {
        this.mesFimColheita = mesFimColheita;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Variedade other = (Variedade) obj;
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