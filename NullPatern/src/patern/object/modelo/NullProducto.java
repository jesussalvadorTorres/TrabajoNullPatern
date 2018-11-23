/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patern.object.modelo;

/**
 *
 * @author Jesus Torres
 */
public class NullProducto extends AbstractProducto {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getidProducto() {
         return "No existe un registro Valido en la base de datos";
    }

    @Override
    public String getNombre() {
     return "No existe un registro Valido en la base de datos";
    }
    //ProductosNulos
}
