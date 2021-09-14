/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.login;

/**
 *
 * @author Miguel Campos
 */
public class Producto {
    
    private double pUnitario;
    private String nombreProd;
    private String descProd; 
    private int Cantidad; 

    /**
     * @return the pUnitario
     */
    public double getpUnitario() {
        return pUnitario;
    }

    /**
     * @param pUnitario the pUnitario to set
     */
    public void setpUnitario(double pUnitario) {
        this.pUnitario = pUnitario;
    }

    /**
     * @return the nombreProd
     */
    public String getNombreProd() {
        return nombreProd;
    }

    /**
     * @param nombreProd the nombreProd to set
     */
    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    /**
     * @return the descProd
     */
    public String getDescProd() {
        return descProd;
    }

    /**
     * @param descProd the descProd to set
     */
    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }

    /**
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

}
 
