/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muestra;

/**
 *
 * @author 52812
 */
public class calculadora {
    
    private String marca;
    
    public double suma(double a, double b){
        return a+b;
    }
    
    public double resta(double a, double b){
        return a-b;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
