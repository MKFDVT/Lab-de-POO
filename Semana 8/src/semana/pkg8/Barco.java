/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg8;

/**
 *
 * @author 52812
 */
public class Barco extends Transportes implements ISElectrico{

    public Barco(int velocidad, int gas) {
        super(velocidad, gas);
    }

    @Override
    public void encender(int gas) {
        System.out.println("EL nivel de gasolina es " + gas);
    }

    @Override
    public String Prenderluces() {
        return("Luces ensendidas");
    }

    @Override
    public String limpiarvidrios() {
        return("Limpiendo...");
    }

    @Override
    public String radio() {
        return("Radio encendidad");
    }
}
