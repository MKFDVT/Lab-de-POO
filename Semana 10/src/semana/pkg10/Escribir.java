/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg10;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author 52812
 */
public class Escribir {
    
    public Escribir(String fileN) throws IOException{
        this.wfiles(fileN);
    }
    private void wfiles(String fileN) throws IOException{
        
        try
        {
            FileWriter fw = new FileWriter(fileN);
            fw.write("Esto es una prueb");
            fw.write(97);
            fw.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
