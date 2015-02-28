/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;

/**
 *
 * @author Kelson
 */
public class Area {
    @SwingColumn(description = "AreaTotal",colorOfBackgound="")
    private float areaTotal;
    @SwingColumn(description = "AreaProd",colorOfBackgound="")
    private float areaProdutiva;
    @SwingColumn(description = "AreaArrend",colorOfBackgound="")
    private float areaArrendamento;

    public Area(float areaTotal, float areaProdutiva, float areaArrendamento) {
        this.areaTotal = areaTotal;
        this.areaProdutiva = areaProdutiva;
        this.areaArrendamento = areaArrendamento;
    }

    public void setAreaTotal(float areaTotal) {
        this.areaTotal = areaTotal;
    }

    public void setAreaProdutiva(float areaProdutiva) {
        this.areaProdutiva = areaProdutiva;
    }

    public void setAreaArrendamento(float areaArrendamento) {
        this.areaArrendamento = areaArrendamento;
    }

    public float getAreaTotal() {
        return areaTotal;
    }

    public float getAreaProdutiva() {
        return areaProdutiva;
    }

    public float getAreaArrendamento() {
        return areaArrendamento;
    }
    
    
}
