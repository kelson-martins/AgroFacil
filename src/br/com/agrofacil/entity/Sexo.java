/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.entity;

/**
 *
 * @author Kelson
 */
public enum Sexo implements java.io.Serializable{
    MASCULINO("Masculino"), FEMININO("Feminino");
    
    private String sexo;
    
    Sexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getSexo() {
        return sexo;
    }
    
}
