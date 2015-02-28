package br.com.agrofacil.entity;

/**
 *
 * @author Kelson
 */
public enum TipoAtividade implements java.io.Serializable{
    INSUMO("Insumo"),MECANIZADA("Mecanizada"),PRODUCAO("Produção"),MANUAL("Manual");
    
    private String descricaoAtividade;

    TipoAtividade(String descricaoAtividade) {
        this.descricaoAtividade = descricaoAtividade;
    }

    public String getDescricaoAtividade() {
        return descricaoAtividade;
    }
        
}
