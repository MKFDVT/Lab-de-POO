/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muestra;

/**
 *
 * @author 52812
 */
public class calculadorabasica extends calculadora{
    
    private String color;
       
    public double mult(double a, double b){
        return a*b;
    }
    
    public double div(double a, double b){
        return a/b;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
}
