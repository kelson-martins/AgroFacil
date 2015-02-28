package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;
import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class Insumo implements java.io.Serializable{

    private Integer id;
    @SwingColumn(description = "UM",colorOfBackgound="")
    private UnidadeMedida unidadeMedida;
    @SwingColumn(description = "Descrição",colorOfBackgound="")
    private String descricao;
    @SwingColumn(description = "IS",colorOfBackgound="")
    private int intervaloSeguranca;
    private String obsIntegracao;
    //@SwingColumn(description = "Estocavel",colorOfBackgound="")
    private boolean estocavel;
    
    public Insumo(Integer id, UnidadeMedida unidadeMedida, String descricao, int intervaloSeguranca, String obsIntegracao, boolean estocavel) {
        this.id = id;
        this.unidadeMedida = unidadeMedida;
        this.descricao = descricao;
        this.intervaloSeguranca = intervaloSeguranca;
        this.obsIntegracao = obsIntegracao;
        this.estocavel = estocavel;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIntervaloSeguranca() {
        return intervaloSeguranca;
    }

    public void setIntervaloSeguranca(int intervaloSeguranca) {
        this.intervaloSeguranca = intervaloSeguranca;
    }

    public String getObsIntegracao() {
        return obsIntegracao;
    }

    public void setObsIntegracao(String obsIntegracao) {
        this.obsIntegracao = obsIntegracao;
    }

    public boolean isEstocavel() {
        return estocavel;
    }

    public void setEstocavel(boolean estocavel) {
        this.estocavel = estocavel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final Insumo other = (Insumo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public Insumo(Integer id) {
        this.id = id;
    }


    
    
    
    public Insumo() {
    }

    @Override
    public String toString() {
        return descricao;
    }
    
    
}
