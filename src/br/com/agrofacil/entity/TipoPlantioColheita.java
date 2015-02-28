/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.entity;

/**
 *
 * @author Kelson
 */
public enum TipoPlantioColheita {
    Manual("Manual"),Mecanizada("Mecanizada");
    
    private String tipoPlantioCOlheita;

    private TipoPlantioColheita(String tipoPlantioCOlheita) {
        this.tipoPlantioCOlheita = tipoPlantioCOlheita;
    }

    public String getTipoPlantioCOlheita() {
        return tipoPlantioCOlheita;
    }
    
    
}
