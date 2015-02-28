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
public class Perfil implements java.io.Serializable{
    @SwingColumn(description = "ID",colorOfBackgound="")
    private Integer id;
    @SwingColumn(description = "Descricao",colorOfBackgound="")
    private String descricao;
    @SwingColumn(description = "CodigApp",colorOfBackgound="")
    private String codigoApp;
    @SwingColumn(description = "CodigoMenu",colorOfBackgound="")
    private String codigoMenu;
    @SwingColumn(description = "Nivel",colorOfBackgound="")
    private EnumNivel nivel;
    @SwingColumn(description = "Acao",colorOfBackgound="")
    private EnumAcao acao;

    public Perfil() {
    }

    public Perfil(Integer id) {
        this.id = id;
    }

    public Perfil(Integer id, String descricao, String codigoApp, String codigoMenu, EnumNivel nivel, EnumAcao acao) {
        this.id = id;
        this.descricao = descricao;
        this.codigoApp = codigoApp;
        this.codigoMenu = codigoMenu;
        this.nivel = nivel;
        this.acao = acao;
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

    public String getCodigoApp() {
        return codigoApp;
    }

    public void setCodigoApp(String codigoApp) {
        this.codigoApp = codigoApp;
    }

    public String getCodigoMenu() {
        return codigoMenu;
    }

    public void setCodigoMenu(String codigoMenu) {
        this.codigoMenu = codigoMenu;
    }

    public EnumNivel getNivel() {
        return nivel;
    }

    public void setNivel(EnumNivel nivel) {
        this.nivel = nivel;
    }

    public EnumAcao getAcao() {
        return acao;
    }

    public void setAcao(EnumAcao acao) {
        this.acao = acao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final Perfil other = (Perfil) obj;
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
