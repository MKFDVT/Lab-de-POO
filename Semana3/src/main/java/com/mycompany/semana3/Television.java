/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;

/**
 *
 * @author 52812
 */
public class Television extends DispElec{

    @Override
    public void encender() {
        System.out.println("Television encendida");
    }
    
    public String CamCanal(String can){
        return "Television cambia al canal" + can;
    }
    
    public String Camvolumen(String vol){
        return "Television tiene el volumen de " + vol;
    }
}
