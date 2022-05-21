/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana4;

import java.util.Scanner;

/**
 *
 * @author 52812
 */
public class RunSemana4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
       Scanner sm = new Scanner(System.in);
       Scanner smo = new Scanner(System.in);
       
       Calculadora calcu = new Calculadora();{
        
            calcu.encender();
            
            System.out.println("Calculadora");
            
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
       
       CalculadoraCientifica calcien = new CalculadoraCientifica();{
        
            calcien.encender();
            
            System.out.println("Calculadora Cientifica");
            
            System.out.println("Introduce la Marca");
            String mrc = sm.nextLine();
        
            System.out.println("Introduce el Modelo");
            String mode = smo.nextLine();
            
            calcien.setMarca(mrc);
            calcien.setModelo(mode);
            
            double rrc = calcien.raiz(2);
            double rp = calcien.porciento(100, 2);
            
            System.out.println("Marca: " + calcien.getMarca());
            System.out.println("Modelo: " + calcien.getModelo());
            System.out.println("Raiz: "+rrc);
            System.out.println("Porciento: "+rp);
            
            calcien.apagar();
       }
       
       Television tv = new Television();{
            
            Scanner cal = new Scanner(System.in);
            Scanner vol = new Scanner(System.in);
            Scanner res = new Scanner(System.in);
            Scanner col = new Scanner(System.in);
            Scanner son = new Scanner(System.in);
            
            tv.encender();
            
            System.out.println("Television");
            
            System.out.println("Introduce la Marca");
            String mrc = sm.nextLine();
        
            System.out.println("Introduce el Modelo");
            String mode = smo.nextLine();
            
            System.out.println("Introduce el canal");
            String canal = cal.nextLine();
            
            System.out.println("Introduce el volumen");
            String volu = vol.nextLine();
            
            System.out.println("Introduce la resolucion");
            String reso = res.nextLine();
            
            System.out.println("Introduce el color");
            String colo = col.nextLine();
            
            System.out.println("Introduce modo de sonido");
            String soni = son.nextLine();
            
            tv.setMarca(mrc);
            tv.setModelo(mode);
            
            System.out.println("marca: " + tv.getMarca());
            System.out.println("modelo: " + tv.getModelo());
            System.out.println(tv.CamCanal(canal));
            System.out.println(tv.Camvolumen(volu));
            System.out.println(tv.resolConf(reso));
            System.out.println(tv.colorConf(colo));
            System.out.println(tv.SonidoConf(soni));
            
            tv.apagar();
        }
    }
    
}
