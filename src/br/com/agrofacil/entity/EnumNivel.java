/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.entity;

/**
 *
 * @author Kelson
 */
public enum EnumNivel {
    Funcionario("Funcionario"),Cliente("Cliente"),Fornecedor("Fornecedor"),GerenteSistema("GerenteSistema"),Usuario("Usuario");
    private String nivel;

    private EnumNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getANivel() {
        return nivel;
    }
        
}
