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
public abstract class AbstractProducto {
    
  protected int idProducto;  
  protected String nombre;
  protected double precio;
  protected String descripcion;
  protected String categoria;
  public abstract boolean isNil();
  public abstract int getidProducto();
  public abstract String getNombre();
  public abstract double getPrecio();
  public abstract String getDescripcion();
  public abstract String getCategoria();
}
