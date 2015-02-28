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
public class ApontamentoPlantioItem2 implements java.io.Serializable{
    
    //@SwingColumn(description = "Id",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "Equipamento",colorOfBackgound="")
    private Equipamento equipamento;
    @SwingColumn(description = "Tipo",colorOfBackgound="")
    private String tipo;
    @SwingColumn(description = "Descricao",colorOfBackgound="")
    private String descricao;

    private ApontamentoPlantio apontamentoPlantio;

    public ApontamentoPlantioItem2() {
    }

    public ApontamentoPlantioItem2(Integer id) {
        this.id = id;
    }

    public ApontamentoPlantioItem2(Integer id, Equipamento equipamento, String tipo, String descricao, ApontamentoPlantio apontamentoPlantio) {
        this.id = id;
        this.equipamento = equipamento;
        this.tipo = tipo;
        this.descricao = descricao;
        this.apontamentoPlantio = apontamentoPlantio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ApontamentoPlantio getApontamentoPlantio() {
        return apontamentoPlantio;
    }

    public void setApontamentoPlantio(ApontamentoPlantio apontamentoPlantio) {
        this.apontamentoPlantio = apontamentoPlantio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
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
        final ApontamentoPlantioItem2 other = (ApontamentoPlantioItem2) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
