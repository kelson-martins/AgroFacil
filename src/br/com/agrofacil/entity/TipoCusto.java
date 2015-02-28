package br.com.agrofacil.entity;

/**
 *
 * @author Kelson
 */
public enum TipoCusto implements java.io.Serializable{
    
    Produtivo("Produtivo"),Auxiliar("Auxiliar"),Administrativo("Administrativo"),Improdutivo("Improdutivo");
    
    private String descricaoCentroCusto;

    TipoCusto(String descricaoCentroCusto) {
        this.descricaoCentroCusto = descricaoCentroCusto;
    }

    public String getDescricaoCentroCusto() {
        return descricaoCentroCusto;
    }
        
}
