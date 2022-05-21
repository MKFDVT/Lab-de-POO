/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana4;

/**
 *
 * @author 52812
 */
public class Television extends DispElec implements IMenuConf{

    @Override
    public String encender() {
        return "Television encendida";
    }
    
     public String CamCanal(String can){
        return "Television cambia al canal" + can;
    }
    
    public String Camvolumen(String vol){
        return "Television tiene el volumen de " + vol;
    }

    @Override
    public String resolConf(String reso) {
        return "Television esta en calidad" + reso;
    }

    @Override
    public String colorConf(String col) {
        return "Television es en color" + col;
    }

    @Override
    public String SonidoConf(String sonid) {
        return "Television reproduce audio en " + sonid;
    }
    
}
