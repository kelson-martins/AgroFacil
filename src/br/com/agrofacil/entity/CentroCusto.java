package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;
import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class CentroCusto implements java.io.Serializable{
    @SwingColumn(description = "Id",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "Descrição",colorOfBackgound="")
    private String descricao;
    @SwingColumn(description = "Tipo Centor Custo",colorOfBackgound="")
    private TipoCusto tipoCentroCusto;
    @SwingColumn(description = "Codigo",colorOfBackgound="")
    private String idInterfaceErp;

    public CentroCusto() {
    }

    public CentroCusto(Integer id) {
        this.id = id;
    }

    public CentroCusto(Integer id, String descricao, TipoCusto tipoCentroCusto, String idInterfaceErp) {
        this.id = id;
        this.descricao = descricao;
        this.tipoCentroCusto = tipoCentroCusto;
        this.idInterfaceErp = idInterfaceErp;
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

    public TipoCusto getTipoCentroCusto() {
        return tipoCentroCusto;
    }

    public void setTipoCentroCusto(TipoCusto tipoCentroCusto) {
        this.tipoCentroCusto = tipoCentroCusto;
    }

    public String getIdInterfaceErp() {
        return idInterfaceErp;
    }

    public void setIdInterfaceErp(String idInterfaceErp) {
        this.idInterfaceErp = idInterfaceErp;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final CentroCusto other = (CentroCusto) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descricao ;
    }
    
    
}
