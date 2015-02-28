/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.entity;

/**
 *
 * @author Kelson
 */
public enum HistoricoSafra {
    OBJETIVOSAFRA("Objetivo de Safra"),PRIMEIRAREESTIMATIVA("Primeira Reestimativa"),SEGUNDAREESTIMATIVA("Segunda Reestimativa"),TERCEIRAREESTIMATIVA("Terceira Reestimativa"),OBJETIVOSAFRAMUDA("Objetivo de Safra Muda");
    
    private String historicoSafra;

    private HistoricoSafra(String historicoSafra) {
        this.historicoSafra = historicoSafra;
    }

    public String getHistoricoSafra() {
        return historicoSafra;
    }
       
}
