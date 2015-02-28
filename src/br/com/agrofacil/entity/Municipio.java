package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;
import java.io.Serializable;
import java.util.Objects;

public class Municipio implements Serializable{
    @SwingColumn(description = "Id",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "Nome",colorOfBackgound="")
    private String nome;
    @SwingColumn(description = "UF",colorOfBackgound="")
    private UnidadeFederativa uf;

    public Municipio() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final Municipio other = (Municipio) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public Municipio(Integer id) {
        this.id = id;
    }

    public Municipio(Integer id, String nome, UnidadeFederativa uf) {
        this.id = id;
        this.nome = nome;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return getNome();
    }
 
    
}
