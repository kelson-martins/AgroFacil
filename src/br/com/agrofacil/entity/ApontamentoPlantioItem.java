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
public class ApontamentoPlantioItem implements java.io.Serializable{
    
    //@SwingColumn(description = "Id",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "Safra",colorOfBackgound="")
    private Safra safra;
    @SwingColumn(description = "Fazenda",colorOfBackgound="")
    private Fazenda fazenda;
    @SwingColumn(description = "Setor",colorOfBackgound="")
    private Setor setor;
    @SwingColumn(description = "Talhao",colorOfBackgound="")
    private Talhao talhao;
    private ApontamentoPlantio apontamentoPlantio;

    public ApontamentoPlantioItem() {
    }

    public ApontamentoPlantioItem(Integer id) {
        this.id = id;
    }

    public ApontamentoPlantioItem(Integer id, Safra safra, Fazenda fazenda, Setor setor, Talhao talhao, ApontamentoPlantio apontamentoPlantio) {
        this.id = id;
        this.safra = safra;
        this.fazenda = fazenda;
        this.setor = setor;
        this.talhao = talhao;
        this.apontamentoPlantio = apontamentoPlantio;
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

    public ApontamentoPlantio getApontamentoPlantio() {
        return apontamentoPlantio;
    }

    public void setApontamentoPlantio(ApontamentoPlantio apontamentoPlantio) {
        this.apontamentoPlantio = apontamentoPlantio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final ApontamentoPlantioItem other = (ApontamentoPlantioItem) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
