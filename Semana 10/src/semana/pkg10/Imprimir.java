/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg10;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author 52812
 */
public class Imprimir extends Leer{
    
    public Imprimir(String fileN) throws IOException {
        super(fileN);
    }
     private void rfiles(String fileN) throws IOException{
        
        try
        {
            FileReader fr = new FileReader(fileN);
            int valor = fr.read();
            while(valor!=1){
                System.out.println((char)valor);
                valor = fr.read();
                System.out.println(valor);
            }
            fr.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
