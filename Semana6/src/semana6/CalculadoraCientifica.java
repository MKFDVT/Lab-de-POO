/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana6;

/**
 *
 * @author 52812
 */
public class CalculadoraCientifica extends DispElec implements IOperacionavanzadas{

    @Override
    public String encender() {
        return "Calculadora encendida";
    }

    @Override
    public double raiz(double a) {
        return a/(a/2);
    }

    @Override
    public double porciento(double a,double b) {
        return a*(b/10);
    }
}
