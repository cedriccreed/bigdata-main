/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.beam.examples;

/**
 *
 * @author leo
 */
public class Afp {
    
    private String afp;
    private String fecha;
    private String fondo;
    private String valor;
    private String valorUf;
    
    public Afp() {
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFondo() {
        return fondo;
    }

    public void setFondo(String fondo) {
        this.fondo = fondo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValorUf() {
        return valorUf;
    }

    public void setValorUf(String valorUf) {
        this.valorUf = valorUf;
    }

    @Override
    public String toString() {
        return "Afp{" + "afp=" + afp + ", fecha=" + fecha + ", fondo=" + fondo + ", valor=" + valor + ", valorUf=" + valorUf + " '}';
    }
    
    public String toCSV()
    {
        return "" + afp + "," + fecha + "," + fondo + "," + valor + "," + valorUf + "";
    }

}//Afp
