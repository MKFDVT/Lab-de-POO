/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana.pkg8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 52812
 */
public class RunSemana8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner vm = new Scanner(System.in);
        Scanner vmd = new Scanner(System.in);
        
        ArrayList<Transportes> tra = new ArrayList<Transportes>();{
            tra.add(new Automovil(100,50));
            tra.add(new Avion(600,200));
            tra.add(new Barco(300,300));
            tra.add(new helicoptero(600,100));
        }
        
        for(Transportes tr : tra){
            tr.encender(1000);
            
            System.out.println("Introdusca marca del vehiculo: ");
            String mrc = vm.nextLine();
            tr.setMarca(mrc);
            
            System.out.println("Introdusca marca del vehiculo: ");
            String md = vmd.nextLine();
            tr.setModelo(md);
            
            tr.getMarca();
            tr.getModelo();
            tr.acelerar();
            tr.apagar();
            
        }
    }
    
}
