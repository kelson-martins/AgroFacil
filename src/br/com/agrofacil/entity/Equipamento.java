package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;
import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class Equipamento implements java.io.Serializable{
    
    @SwingColumn(description = "ID",colorOfBackgound="")
    private Integer id;
    private int anoFabricacao;
    @SwingColumn(description = "Modelo",colorOfBackgound="")
    private String modelo;
    @SwingColumn(description = "Placa",colorOfBackgound="")
    private String placa;    
    @SwingColumn(description = "CC",colorOfBackgound="")
    private CentroCusto centroCusto;
    private boolean disponivel;

    private String chassi;
    private FrenteTransporte frenteTransporte;
    private Composicao composicao;
    private int anoModelo;
    private Date dataAquisicao;
    private UnidadeFederativa uf;

    
    public Equipamento() {
        
    }

    public Equipamento(Integer id) {
        this.id = id;
    }

    public Equipamento(Integer id, int anoFabricacao, CentroCusto centroCusto, boolean disponivel, String placa, String chassi, FrenteTransporte frenteTransporte, Composicao composicao, int anoModelo, Date dataAquisicao, UnidadeFederativa uf, String modelo) {
        this.id = id;
        this.anoFabricacao = anoFabricacao;
        this.centroCusto = centroCusto;
        this.disponivel = disponivel;
        this.placa = placa;
        this.chassi = chassi;
        this.frenteTransporte = frenteTransporte;
        this.composicao = composicao;
        this.anoModelo = anoModelo;
        this.dataAquisicao = dataAquisicao;
        this.uf = uf;
        this.modelo = modelo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public CentroCusto getCentroCusto() {
        return centroCusto;
    }

    public void setCentroCusto(CentroCusto centroCusto) {
        this.centroCusto = centroCusto;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public FrenteTransporte getFrenteTransporte() {
        return frenteTransporte;
    }

    public void setFrenteTransporte(FrenteTransporte frenteTransporte) {
        this.frenteTransporte = frenteTransporte;
    }

    public Composicao getComposicao() {
        return composicao;
    }

    public void setComposicao(Composicao composicao) {
        this.composicao = composicao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equipamento other = (Equipamento) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return modelo;
    }
    
    
}
