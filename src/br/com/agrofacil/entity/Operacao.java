package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;
import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class Operacao implements java.io.Serializable{
    
    @SwingColumn(description = "Id",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "Descricao",colorOfBackgound="")
    private String descricao;
    @SwingColumn(description = "UnidadeMedida",colorOfBackgound="")
    private UnidadeMedida unidadeMedida;

    public Operacao() {
    }

    public Operacao(Integer id) {
        this.id = id;
    }

    public Operacao(Integer id, String descricao, UnidadeMedida unidadeMedida) {
        this.id = id;
        this.descricao = descricao;
        this.unidadeMedida = unidadeMedida;
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

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.id);
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
        final Operacao other = (Operacao) obj;
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
