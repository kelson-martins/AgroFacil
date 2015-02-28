package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;
import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class UnidadeMedida implements java.io.Serializable{
    @SwingColumn(description = "ID",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "DESCRIÇÃO",colorOfBackgound="")
    private String descricao;

    public UnidadeMedida() {
    }

    public UnidadeMedida(Integer id) {
        this.id = id;
    }

    public UnidadeMedida(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
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

    public void setDescricaoUnidade(String descricao) {
        this.descricao = descricao;
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
        final UnidadeMedida other = (UnidadeMedida) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getDescricao();
    }
    
    
}
