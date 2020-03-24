/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.abstractFactory;

import javax.swing.ImageIcon;

/**
 *
 * @author Christian Galindo
 */
public class FabricaVehiculoElectricidad implements FabricaVehiculo {

    @Override
    public Automovil creaAutomovil(String marca,String modelo, ImageIcon icon, int potencia, double espacio,int precio) {
        return new AutomovilElectricidad(marca,modelo,icon,potencia,espacio,precio);
    }

    @Override
    public Scooter creaScooter(String modelo, ImageIcon icon, int potencia, int precio) {
        return new ScooterElectricidad(modelo,icon,potencia, precio);
    }



    
}
