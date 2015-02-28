package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;
import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class Composicao implements java.io.Serializable{
    @SwingColumn(description = "ID",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "DESCRIÇÃO",colorOfBackgound="")
    private String descricao;
    @SwingColumn(description = "VOLUMES",colorOfBackgound="")
    private int volumesTotais;

    public Composicao() {
    }

    public Composicao(Integer id) {
        this.id = id;
    }

    public Composicao(Integer id, String descricao, int volumesTotais) {
        this.id = id;
        this.descricao = descricao;
        this.volumesTotais = volumesTotais;
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

    public int getVolumesTotais() {
        return volumesTotais;
    }

    public void setVolumesTotais(int volumesTotais) {
        this.volumesTotais = volumesTotais;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Composicao other = (Composicao) obj;
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
