/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurales.proxy;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian Galindo
 */
public class RealEspecificacion implements Especificacion {

    @Override
    public void dibuja() {
        JOptionPane.showMessageDialog(null, null, "Previsualizacion", 
                JOptionPane.INFORMATION_MESSAGE,carga());
    }

    @Override
    public void click() {
    }

    public ImageIcon carga() {
        ImageIcon icono = new ImageIcon(getClass().getResource("/img/toyotaCorolla.gif"));
        return icono;
    }

}
