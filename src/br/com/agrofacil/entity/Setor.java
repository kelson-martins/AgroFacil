/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;
import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class Setor extends Area implements java.io.Serializable {

    public Setor(float areaTotal, float areaProdutiva, float areaArrendamento) {
        super(areaTotal, areaProdutiva, areaArrendamento);
    }
    
    @SwingColumn(description = "ID",colorOfBackgound="")    
    private Integer id;    
    @SwingColumn(description = "Fazenda",colorOfBackgound="")
    private Fazenda fazenda;
    @SwingColumn(description = "Descricao",colorOfBackgound="")
    private String descricao;
    @SwingColumn(description = "CEP",colorOfBackgound="")
    private String cep;

    public Setor(Integer id, Fazenda fazenda, String descricao, String cep, float areaTotal, float areaProdutiva, float areaArrendamento) {
        super(areaTotal, areaProdutiva, areaArrendamento);
        this.id = id;
        this.fazenda = fazenda;
        this.descricao = descricao;
        this.cep = cep;
    }

    public Setor(Integer id, float areaTotal, float areaProdutiva, float areaArrendamento) {
        super(areaTotal, areaProdutiva, areaArrendamento);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Fazenda getFazenda() {
        return fazenda;
    }

    public void setFazenda(Fazenda fazenda) {
        this.fazenda = fazenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final Setor other = (Setor) obj;
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
