package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;
import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class Safra implements java.io.Serializable{
    @SwingColumn(description = "ID",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "INICIOSAFRA",colorOfBackgound="")
    private Date dataInicioSafra;
    @SwingColumn(description = "FIM SAFRA",colorOfBackgound="")
    private Date dataFimSafra;
    @SwingColumn(description = "INICIO MOAGEM",colorOfBackgound="")
    private Date dataInicioMoagem;
    @SwingColumn(description = "FIM MOAGEM",colorOfBackgound="")
    private Date dataFimMoagem;

    public Safra() {
    }

    public Safra(Integer id) {
        this.id = id;
    }

    public Safra(Integer id, Date dataInicioSafra, Date dataFimSafra, Date dataInicioMoagem, Date dataFimMoagem) {
        this.id = id;
        this.dataInicioSafra = dataInicioSafra;
        this.dataFimSafra = dataFimSafra;
        this.dataInicioMoagem = dataInicioMoagem;
        this.dataFimMoagem = dataFimMoagem;
    }

       
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataInicioSafra() {
        return dataInicioSafra;
    }

    public void setDataInicioSafra(Date dataInicioSafra) {
        this.dataInicioSafra = dataInicioSafra;
    }

    public Date getDataFimSafra() {
        return dataFimSafra;
    }

    public void setDataFimSafra(Date dataFimSafra) {
        this.dataFimSafra = dataFimSafra;
    }

    public Date getDataInicioMoagem() {
        return dataInicioMoagem;
    }

    public void setDataInicioMoagem(Date dataInicioMoagem) {
        this.dataInicioMoagem = dataInicioMoagem;
    }

    public Date getDataFimMoagem() {
        return dataFimMoagem;
    }

    public void setDataFimMoagem(Date dataFimMoagem) {
        this.dataFimMoagem = dataFimMoagem;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final Safra other = (Safra) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
   
    
}
