/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muestra;

import java.util.Scanner;

/**
 *
 * @author 52812
 */
public class muestraclass {
    public static void main (String[] Args){
        
        Scanner sm = new Scanner(System.in);
        /*Scanner sc = new Scanner(System.in);*/
        
        System.out.println("Introduce la Marca");
        String mrc = sm.nextLine();
        
        /*System.out.println("Introduce el color");
         String colo = sc.nextLine();*/
        
        calculadorabasica casio = new  calculadorabasica();{
        
        casio.setMarca(mrc);
       /* casio.setColor(colo);*/
        double rs = casio.suma(3.3, 3.6);
        double rr = casio.resta(12, 4);
        double rm = casio.mult(3, 5);
        double rd = casio.div(30, 5);
        
        System.out.println("marca: "+casio.getMarca());
        /*System.out.println(casio.getColor());*/
        System.out.println("suma: "+rs);
        System.out.println("resta: "+rr);
        System.out.println("multiplicacion: "+rm);
        System.out.println("division: "+rd);
    
        }
        
        
    }
}
