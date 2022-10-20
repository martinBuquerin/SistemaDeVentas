/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
package dominio.orden;
import dominio.Orden;
import dominio.Producto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class implementacion implements Datos{
    
    
    @Override
    public void crear(){
            File baseDatos = new File("baseDatos.txt"); //crea el fichero
        try {
            PrintWriter salida = new PrintWriter(baseDatos);//iniciando puntero para poder escribir en un fichero
            salida.close();//muy importante salir d la clase impresion
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
    
    }
            
            
    @Override        
    public void leer(){
      FileReader lector = null;
  
        try {
            lector = new FileReader("C:/Users//Martin/Documents/NetBeansProjects/SistemaDeVentas/test.txt");
            BufferedReader entrada = new BufferedReader(lector);
            String lineas = entrada.readLine();    //se lee la primera línea del fichero
            while (lineas != null) {               //mientras no se llegue al final del fichero                   
                System.out.println(lineas);        //se nuestra por pantalla
                lineas = entrada.readLine();       //se lee la siguiente línea del fichero                        
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
            
    
    }
    
    
    
    @Override
    public void escribir(Orden o1, String nombre){
        ArrayList<Producto> prodArray = (ArrayList<Producto>)o1.getProducto().clone();// creo un array de tipo producto y clono la generada por el usuario para imprimirla
        
        PrintWriter salida = null;
        File archivo= new File(nombre);
        
        try {//obtengo el Orden id
            salida = new PrintWriter(archivo);
            salida.print("\nOrden id: "+ o1.getIdOrden()+"\n");
            salida.print("\n\tID"+"\tNOMBRE"+"\tPRECIO\n");       
            salida.print("\t--"+"\t------"+"\t------\n");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }finally{
            salida.close();
        }
        

        for(int i=0; i<prodArray.size(); i++){//recorro el array clonada para insertar en el documento cada producto
            try {
                salida = new PrintWriter(new FileWriter(nombre, true));
                salida.print("\t"+prodArray.get(i).getIdProducto()+"\t"+prodArray.get(i).getNombre()+"\t"+prodArray.get(i).getPrecio()+" €"+"\n");
   

            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }finally{
                salida.close();
            }
        }
        
        try {//Agrego el total de la compra
            salida = new PrintWriter(new FileWriter(nombre, true));
            salida.print("\nTotal: " + o1.calcularTotal()+" €" +"\n");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }finally{
            salida.close();
        }
        
        
        
    }
    
}
