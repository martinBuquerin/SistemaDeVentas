/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
package dominio.orden;
import dominio.Orden;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Martin
 */
public class implementacion implements Datos{
    
    
    @Override
    public void crear(){
            File baseDatos = new File("baseDatos"); //crea el fichero
        try {
            PrintWriter salida = new PrintWriter(baseDatos);//iniciando puntero para poder escribir en un fichero
            salida.close();//muy importante salir d la clase impresion
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
    
    }
            
            
    @Override        
    public void leer(){
    
    
    }
    
    
    
    @Override
    public void escribir(Orden o1){
        crear();
        PrintWriter salida = null;
        File baseDatos = new File("baseDatos"); //crea el fichero
        try {
            salida = new PrintWriter(baseDatos);
            salida.print(o1.mostrarOrden());
            System.out.print("Se ha creado el archivo!");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }finally{
            salida.close();
        }
    }
    
}
