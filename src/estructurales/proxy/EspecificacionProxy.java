/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurales.proxy;

/**
 *
 * @author Christian Galindo
 */
public class EspecificacionProxy implements Especificacion{

    protected RealEspecificacion especificacion = null;

    @Override
    public void click() {
        if (especificacion == null) {
            especificacion = new RealEspecificacion();
            especificacion.carga();
        }
    }

    @Override
    public void dibuja() {
        if (especificacion != null){
            especificacion.dibuja();
        }
    }
}
