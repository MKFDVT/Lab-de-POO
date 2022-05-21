/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;

/**
 *
 * @author 52812
 */
public class Calculadora extends DispElec{

    @Override
    public void encender() {
        System.out.println("Calculadora Enciende ");
    }
    
     public double suma(double a, double b){
        return a+b;
    }
    
    public double resta(double a, double b){
        return a-b;
    }
    
    public double mult(double a, double b){
        return a*b;
    }
    
    public double div(double a, double b){
        return a/b;
    }
}
