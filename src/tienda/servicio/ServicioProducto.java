/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicio;

import java.util.Collection;
import tienda.entidades.Producto;
import tienda.persistencia.DAOproducto;

/**
 *
 * @author bmjwe
 */
public class ServicioProducto {

    /*private DAOproducto dao;

    public ServicioProducto() {
        this.dao = new DAOproducto();
    }*/
    
    DAOproducto daop = new DAOproducto();

    public void imprimirNombres() throws Exception {

        try {
            Collection<Producto> productos = daop.nombresProducto();

            if (productos.isEmpty()) {
                throw new Exception("No hay nombres de productos para imprimir");
            } else {
                for (Producto p : productos) {
                   
                    System.out.println(p.getNombre());
                }
            }

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
            throw e;
        }

    }   
    
    
    
    public void listaprecio() throws Exception {

        try {
            Collection<Producto> productos = daop.lista120y200();

            if (productos.isEmpty()) {
                throw new Exception("No hay  productos cargados para imprimir");
            } else {
                for (Producto p : productos) {
                   
                    System.out.println(p);
                }
            }

        } catch (Exception e) {
          
            throw e;
        }

    }   
    
    public void listaNombrePrecio() throws Exception {
        
        try {
            Collection<Producto> productos= daop.listaNombrePrecios();
            
            if(productos.isEmpty()){
                throw new Exception ("No hay  productos cargados para imprimir");
                
            }else{
                
                for (Producto p : productos) {
                   
                    System.out.println("nombre = "+ p.getNombre()+","+ "precio = "+p.getPrecio());
                }
            }
            
        }catch (Exception e){
            
        }
    }

}
