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
    
  protected String idProducto;  
  protected String nombre;

  public abstract boolean isNil();
  public abstract String getidProducto();
  public abstract String getNombre();

}
