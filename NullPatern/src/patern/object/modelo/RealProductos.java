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
public class RealProductos extends AbstractProducto{
   
    public RealProductos(String idPro,String name){
    this.idProducto=idPro;
      this.nombre=name;  
   }

    @Override
    public boolean isNil() {
            return false;
    }

    @Override
    public String getidProducto() {
        return idProducto;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

   


    
}
