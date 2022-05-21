/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana3;

import java.util.Scanner;

/**
 *
 * @author 52812
 */
public class Runsemana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner sm = new Scanner(System.in);
       Scanner smo = new Scanner(System.in);
       
       Calculadora calcu = new Calculadora();{
        
            calcu.encender();
            
            System.out.println("Introduce la Marca");
            String mrc = sm.nextLine();
        
            System.out.println("Introduce el Modelo");
            String mode = smo.nextLine();
            
            calcu.setMarca(mrc);
            calcu.setModelo(mode);
            double rs = calcu.suma(3.3, 3.6);
            double rr = calcu.resta(12, 4);
            double rm = calcu.mult(3, 5);
            double rd = calcu.div(30, 5);
            
            System.out.println("Marca: " + calcu.getMarca());
            System.out.println("Modelo: " + calcu.getModelo());
            System.out.println("suma: "+rs);
            System.out.println("resta: "+rr);
            System.out.println("multiplicacion: "+rm);
            System.out.println("division: "+rd);
            
            calcu.apagar();
       }
       
       Television tv = new Television();{
            
            Scanner cal = new Scanner(System.in);
            Scanner vol = new Scanner(System.in);
            
            tv.encender();
            
            System.out.println("Introduce la Marca");
            String mrc = sm.nextLine();
        
            System.out.println("Introduce el Modelo");
            String mode = smo.nextLine();
            
            System.out.println("Introduce el canal");
            String canal = cal.nextLine();
            
            System.out.println("Introduce el volumen");
            String volu = vol.nextLine();
            
            tv.setMarca(mrc);
            tv.setModelo(mode);
            
            System.out.println("marca: " + tv.getMarca());
            System.out.println("modelo: " + tv.getModelo());
            System.out.println(tv.CamCanal(canal));
            System.out.println(tv.Camvolumen(volu));
            
            tv.apagar();
        }
       
        
        
    }
    
}
