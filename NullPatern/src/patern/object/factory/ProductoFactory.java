/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patern.object.factory;

import Control.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import patern.object.modelo.AbstractProducto;
import patern.object.modelo.NullProducto;
import patern.object.modelo.dtoProductos;

/**
 *
 * @author Jesus Torres
 */
public class ProductoFactory {

    public Object busquedaNombreoId(int id, String nombre) {
        Conexion cone = new Conexion();
        Connection con = cone.obtenerConexion();
        ArrayList<dtoProductos> lista = new ArrayList<>();
        String query = "SELECT * FROM productos WHERE idProducto=" + '"' + id + '"' + "or" + "  " + "nombre=" + '"' + nombre + '"';

        try {

            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

//            if (rs.next()) {
                while (rs.next()) {
                    dtoProductos producto = new dtoProductos();
                    producto.setIdProducto(rs.getInt(1));
                    producto.setNombre(rs.getString(2));
                    producto.setPrecio(rs.getDouble(3));
                    producto.setDescripcion(rs.getString(4));
                    producto.setCategoria(rs.getString(5));
                    lista.add(producto);
                }
//            } else {
//                NullProducto n = new NullProducto();
//                JOptionPane.showMessageDialog(null, n.getidProducto());
//            }

        } catch (SQLException e) {
            NullProducto isNul = new NullProducto();
            JOptionPane.showMessageDialog(null, isNul.getidProducto() + isNul.getNombre());
            System.err.println(e.getMessage());
        }
        return lista;
    }

}
