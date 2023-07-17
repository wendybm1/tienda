/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;
import tienda.servicio.ServicioProducto;
public final class DAOproducto extends DAO {
  
    
    
    public Collection<Producto> nombresProducto() throws Exception{
        
        try{
            
            String sql = "SELECT NOMBRE FROM PRODUCTO";
            consultarBase(sql);
            
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while(resultado.next()){
               producto = new Producto();
               producto.setNombre(resultado.getString("NOMBRE"));
               productos.add(producto);
            }
            desconectarBase();
            return productos;
        }catch (Exception e){
            
            desconectarBase();
            System.out.println(e.fillInStackTrace());
            throw new Exception("Error de sistema");
            
        }
    }
    
    public Collection<Producto> listaNombrePrecios() throws Exception{
        
        try{
            
            String sql = "SELECT NOMBRE, PRECIO FROM PRODUCTO";
            consultarBase(sql);
            
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while(resultado.next()){
               producto = new Producto();
               producto.setNombre(resultado.getString("NOMBRE"));
               producto.setPrecio(resultado.getDouble("precio"));
               
               productos.add(producto);
            }
            desconectarBase();
            
            return productos;
            
        }catch (Exception e){
            
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
    public Collection<Producto> lista120y200()throws Exception{
        
        try{
            
            String sql ="SElECT * FROM PRODUCTO WHERE PRECIO >= 120 AND PRECIO <= 200";
            consultarBase(sql);
            
            Producto producto = null;
             Collection<Producto> productos = new ArrayList();
            while(resultado.next()){
               producto = new Producto();
               producto.setCodigo(resultado.getInt(1));
               producto.setNombre(resultado.getString(2));
               producto.setPrecio(resultado.getDouble(3));
               producto.setCodigoFabricante(resultado.getByte(4));
               productos.add(producto);
            }
            desconectarBase();
            return productos;
        }catch(Exception e ){
            desconectarBase();
            System.out.println(e.fillInStackTrace());
            throw new Exception("Error");
        }
    }
   
}
