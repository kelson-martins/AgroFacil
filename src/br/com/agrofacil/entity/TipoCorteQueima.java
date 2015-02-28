/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.entity;

/**
 *
 * @author Kelson
 */
public enum TipoCorteQueima {
    Total("Total"),Parcial("Parcial");
    
    private String tipoCorteQueima;

    private TipoCorteQueima(String tipoCorteQueima) {
        this.tipoCorteQueima = tipoCorteQueima;
    }

    public String getTipoCorteQueima() {
        return tipoCorteQueima;
    }
    
    
}
