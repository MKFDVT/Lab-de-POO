/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana6;

import java.util.Scanner;

/**
 *
 * 
 * @author 52812
 */
public class RunSemana6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
       Scanner sm = new Scanner(System.in);
       Scanner smo = new Scanner(System.in);
       
       Calculadora[] calcu = new Calculadora[5];
       
        for (int i = 0; i < 5; i++) {
            calcu[i] = new Calculadora();{
        
                System.out.println("Calculadora");
            
                System.out.println("Introduce la Marca");
                String mrc = sm.nextLine();
        
                System.out.println("Introduce el Modelo");
                String mode = smo.nextLine();
            
                calcu[i].setMarca(mrc);
                calcu[i].setModelo(mode);
            
            }
        }
        for(Calculadora cal : calcu){
            
            cal.encender();
            
            double rs = cal.suma(3.3, 3.6);
            double rr = cal.resta(12, 4);
            double rm = cal.mult(3, 5);
            double rd = cal.div(30, 5);
            
            System.out.println("Marca: " + cal.getMarca());
            System.out.println("Modelo: " + cal.getModelo());
            System.out.println("suma: "+rs);
            System.out.println("resta: "+rr);
            System.out.println("multiplicacion: "+rm);
            System.out.println("division: "+rd);
            
            cal.apagar();
        }
       
       CalculadoraCientifica[] calcien = new CalculadoraCientifica[5];
       
        for (int i = 0; i < 5; i++) {
            calcien[i] = new CalculadoraCientifica();{
        
                System.out.println("Calculadora Cientifica");
            
                System.out.println("Introduce la Marca");
                String mrc = sm.nextLine();
        
                System.out.println("Introduce el Modelo");
                String mode = smo.nextLine();
            
                calcien[i].setMarca(mrc);
                calcien[i].setModelo(mode);
            
            
            }
        }
        
        for(CalculadoraCientifica calc : calcien){
            
            calc.encender();
            
            double rrc = calc.raiz(2);
            double rp = calc.porciento(100, 2);
            
            System.out.println("Marca: " + calc.getMarca());
            System.out.println("Modelo: " + calc.getModelo());
            System.out.println("Raiz: "+rrc);
            System.out.println("Porciento: "+rp);
            
            calc.apagar();
        }
       
        Television[] tv = new Television[5];
        
        for (int i = 0; i < 5; i++) {
            tv[i] = new Television();{
            
            
                System.out.println("Television");
            
                System.out.println("Introduce la Marca");
                String mrc = sm.nextLine();
        
                System.out.println("Introduce el Modelo");
                String mode = smo.nextLine();
            
            
            
                tv[i].setMarca(mrc);
                tv[i].setModelo(mode);
            
            
            }
        }
        
        for(Television tel : tv){
            
            tel.encender();
            
            System.out.println("marca: " + tel.getMarca());
            System.out.println("modelo: " + tel.getModelo());
            System.out.println("Canal: 10");
            System.out.println("Volumen: 9");
            System.out.println("Resolucionde la pantalla: cine");
            System.out.println("color de la pantalla: Normal");
            System.out.println("Sonido: estereo");
            
            tel.apagar();
        }
       
       
    }
    
}
