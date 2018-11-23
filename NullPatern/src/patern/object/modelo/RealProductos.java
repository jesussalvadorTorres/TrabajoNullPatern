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
   
    public RealProductos(int idPro,String name,double precio,String desc,String catego){
    this.idProducto=idPro;
    this.nombre=name;
    this.precio=precio;
    this.descripcion=desc;
    this.categoria=catego;
       }

    @Override
    public boolean isNil() {
    return true;
    }

    @Override
    public int getidProducto() {
    return idProducto;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getDescripcion() {
    return descripcion;
    }

    @Override
    public String getCategoria() {
    return categoria;
    }
    
}
