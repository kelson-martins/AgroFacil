package br.com.agrofacil.entity;

/**
 *
 * @author Kelson
 */
public enum SituacaoLocalProducao implements java.io.Serializable{
    Fechado("Fechado"),Inativo("Inativo"),Queima("Queima"),Novo("Novo"),Plantio("Plantio"),Reforma("Reforma");
    
    private String situacaoLocal;

    SituacaoLocalProducao(String situacaoLocal) {
        this.situacaoLocal = situacaoLocal;
    }

    public String getSituacaoLocal() {
        return situacaoLocal;
    }
        
}
