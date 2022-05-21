/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana6;

/**
 *
 * @author 52812
 */
public class Calculadora extends DispElec implements IOperacionestandar{

    @Override
    public String encender() {
        return "Calculadora encendida";
    }
    
    @Override
     public double suma(double a, double b){
        return a+b;
    }
    
    @Override
    public double resta(double a, double b){
        return a-b;
    }
    
    @Override
    public double mult(double a, double b){
        return a*b;
    }
    
    @Override
    public double div(double a, double b){
        return a/b;
    }
    
}
