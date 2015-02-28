package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;
import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class FrenteTransporte implements java.io.Serializable{
    @SwingColumn(description = "Id",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "Descrição",colorOfBackgound="")
    private String descricao;
    @SwingColumn(description = "Distancia Inicial",colorOfBackgound="")
    private float distanciaInicial;
    @SwingColumn(description = "Distância Final",colorOfBackgound="")
    private float distanciaFinal;

    public FrenteTransporte() {
    }

    public FrenteTransporte(Integer id) {
        this.id = id;
    }

    public FrenteTransporte(Integer id, String descricao, float distanciaInicial, float distanciaFinal) {
        this.id = id;
        this.descricao = descricao;
        this.distanciaInicial = distanciaInicial;
        this.distanciaFinal = distanciaFinal;
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

    public float getDistanciaInicial() {
        return distanciaInicial;
    }

    public void setDistanciaInicial(float distanciaInicial) {
        this.distanciaInicial = distanciaInicial;
    }

    public float getDistanciaFinal() {
        return distanciaFinal;
    }

    public void setDistanciaFinal(float distanciaFinal) {
        this.distanciaFinal = distanciaFinal;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final FrenteTransporte other = (FrenteTransporte) obj;
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
