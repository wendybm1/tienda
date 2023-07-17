/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import tienda.persistencia.DAOproducto;
import tienda.servicio.ServicioProducto;

/**
 *
 * @author bmjwe
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioProducto servPro = new ServicioProducto();
        
        try{
            System.out.println("===============lista de todos los productos de la tienda============================================");
            System.out.println(" ");
            servPro.imprimirNombres();
            System.out.println(" ");
            System.out.println("===============listado de productos con un rango de precios entre 120 y 200==================");
            System.out.println(" ");
            servPro.listaprecio();
            System.out.println(" ");
            System.out.println("===============listado de nombres de productos con sus precios =====================================");
            System.out.println(" ");
            servPro.listaNombrePrecio();
            
        }catch(Exception e){
            System.out.println(e.fillInStackTrace());
        }
        
        System.out.println("MENU\n"+"1. lista con todos los nombres de los productos que ofrece la tienda\n"
        +"2.listado de todos los nombres de productos con sus precios\n"
        + "3.listado de productos con un rango de precios entre 120 y 200\n"
        +"4.");
     
    }
    
}
