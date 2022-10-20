package main;


import datos.Datos;
import datos.implementacion;
import dominio.Producto;
import dominio.Orden;

/*

 */

/**
 *
 * @author Martin
 */
public class Principal {
    
    public static void main(String[] args) {
        Producto p1 = new Producto("Pan",2.0);
        Producto p2 = new Producto("Leche",5.50);
        Producto p3 = new Producto("Lechuga",4.50);
        Producto p4 = new Producto();
        Producto p5 = new Producto();
        Producto p6 = new Producto();
        Producto p7 = new Producto();
        Producto p8 = new Producto();
        Producto p9 = new Producto();
        Producto p10 = new Producto("Fresa",3.5);
        
        Orden or1 = new Orden();
        Orden or2 = new Orden();
        Orden or3 = new Orden();
     
        or1.agregarProducto(p2);
        or1.agregarProducto(p2);
        or1.agregarProducto(p10);
        or1.agregarProducto(p2);
        or1.agregarProducto(p10);
        or1.agregarProducto(p1);
        or1.agregarProducto(p3);
        or1.agregarProducto(p3);

    
    
    
    
    
        
      /*
        or1.agregarProducto(p1);
        or2.agregarProducto(p2);
        or2.agregarProducto(p3);
        or2.agregarProducto(p4);
        or2.agregarProducto(p5);
        or2.agregarProducto(p6);
        or2.agregarProducto(p7);
        or2.agregarProducto(p8);
        or2.agregarProducto(p9);
        or2.agregarProducto(p10);
        or2.agregarProducto(p10);
        or2.agregarProducto(p1);
        or2.agregarProducto(p1);
       */ 
       // or1.mostrarOrden();
        
        Datos dat =  new implementacion();
        
        dat.escribir(or1,"test.txt");
        
        dat.leer();
        //Datos data = new implementacion();
    
        
    }
}
