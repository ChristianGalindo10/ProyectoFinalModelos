/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.prototype;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian Galindo
 */
public class OrdenPedido extends Documento{

    @Override
    public void imprime() {
        System.out.println("Imprime la orden de pedido: " +
            contenido); 
    }

    @Override
    public void visualiza(String descripcion, int precio) {
        try{
            FileWriter f = new FileWriter("ordenpedido.txt",true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter w = new PrintWriter(b);
            w.println("Orden de pedido ejecutada:");
            w.println("Del vehículo: "+descripcion);
            w.println("De precio: "+precio);
            w.println("La petición de "+contenido+" se ha realizado la operación con éxito");
            w.println("Gracias por utilizar el sistema...");
            w.close();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"El documento no pudo ser creado, F","Error",0);
        }
    }
    
}
