/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.entity;

/**
 *
 * @author Kelson
 */
public enum TipoPropriedade {
    PROPRIO("Proprio"),TERCEIRO("Terceiro"),FORNECEDOR("Fornecedor"),ARRENDADO("Arrendado");
    private String tipoPropriedade;

    private TipoPropriedade(String tipoPropriedade) {
        this.tipoPropriedade = tipoPropriedade;
    }

    public String getTipoPropriedade() {
        return tipoPropriedade;
    }
        
}
