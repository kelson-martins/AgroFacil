package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;
import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class UnidadeIndustrial {
    
    @SwingColumn(description = "Id",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "Descrição",colorOfBackgound="")
    private String descricao;
    @SwingColumn(description = "Município",colorOfBackgound="")
    private Municipio municipio;

    public UnidadeIndustrial() {
    }

    public UnidadeIndustrial(Integer id) {
        this.id = id;
    }

    public UnidadeIndustrial(Integer id, String descricao, Municipio municipio) {
        this.id = id;
        this.descricao = descricao;
        this.municipio = municipio;
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

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.id);
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
        final UnidadeIndustrial other = (UnidadeIndustrial) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }       

    @Override
    public String toString() {
        return  descricao;
    }
    
    
}
