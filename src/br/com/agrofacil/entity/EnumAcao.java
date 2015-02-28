/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.entity;

/**
 *
 * @author Kelson
 */
public enum EnumAcao {
    Total("AcessoTotal"),Visualizacao("Visualizacao"),Nenhum("NenhumAcesso");
    private String acao;

    private EnumAcao(String acao) {
        this.acao = acao;
    }

    public String getAcao() {
        return acao;
    }
        
}
