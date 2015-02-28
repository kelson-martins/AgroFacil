package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;
import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class Espacamento implements java.io.Serializable{
    @SwingColumn(description = "ID",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "DESCRIÇÃO",colorOfBackgound="")
    private String descricao;
    @SwingColumn(description = "METROS",colorOfBackgound="")
    private float metros;
    @SwingColumn(description = "QTD RUAS CANA",colorOfBackgound="")
    private float qntRuasCana;

    public Espacamento() {
    }

    public Espacamento(Integer id) {
        this.id = id;
    }

    public Espacamento(Integer id, String descricao, float metros, float qntRuasCana) {
        this.id = id;
        this.descricao = descricao;
        this.metros = metros;
        this.qntRuasCana = qntRuasCana;
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

    public float getMetros() {
        return metros;
    }

    public void setMetrosEspacamento(float metros) {
        this.metros = metros;
    }

    public float getQntRuasCana() {
        return qntRuasCana;
    }

    public void setQntRuasCana(float qntRuasCana) {
        this.qntRuasCana = qntRuasCana;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Espacamento other = (Espacamento) obj;
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
