package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import patern.object.modelo.dtoProductos;

/**
 *
 * @author karlo
 */
public class operaciones {
    
     public boolean insertar(Object obj) {
         dtoProductos pro = (dtoProductos) (obj);
        String query = "INSERT INTO productos VALUES (?,?,?,?,?)";
        try {
            Conexion cone = new Conexion();
            Connection con = cone.obtenerConexion();
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, pro.getIdProducto());
            ps.setString(2, pro.getNombre());
            ps.setDouble(3, pro.getPrecio());
            ps.setString(4, pro.getDescripcion());
            ps.setString(5, pro.getCategoria());
         
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
      public Object consultar(){
        Conexion cone = new Conexion();
            Connection con = cone.obtenerConexion();
        ArrayList<dtoProductos> lista = new ArrayList<>();
        String query = "SELECT * FROM productos ";
        try {
            
            PreparedStatement ps= con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
             dtoProductos producto = new dtoProductos();
                producto.setIdProducto(rs.getInt(1));
                producto.setNombre(rs.getString(2));
               producto.setPrecio(rs.getDouble(3));
                producto.setDescripcion(rs.getString(4));
                producto.setCategoria(rs.getString(5));
                lista.add(producto);
            }
        }catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }
     
      public Object busquedaNombreoId(int id, String nombre){
        Conexion cone = new Conexion();
        Connection con = cone.obtenerConexion();
        ArrayList<dtoProductos> lista = new ArrayList<>();
        String query = "SELECT * FROM productos WHERE id="+ id +" or nombre= "+ nombre +" ";
        try {
            
            PreparedStatement ps= con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            
                
                
             dtoProductos producto = new dtoProductos();
                producto.setIdProducto(rs.getInt(1));
                producto.setNombre(rs.getString(2));
               producto.setPrecio(rs.getDouble(3));
                producto.setDescripcion(rs.getString(4));
                producto.setCategoria(rs.getString(5));
                lista.add(producto);
           
            }
        }catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }
    
}
