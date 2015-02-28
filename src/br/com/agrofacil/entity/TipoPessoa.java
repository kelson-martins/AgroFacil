package br.com.agrofacil.entity;

/**
 *
 * @author Kelson
 */
public enum TipoPessoa implements java.io.Serializable{
    Fisica("Fisica"),Juridica("Juridica");
    private String tipoPessoa;

    private TipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }
 
}
