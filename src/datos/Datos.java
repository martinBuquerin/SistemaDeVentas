/*CRUD
 */
package datos;

import dominio.Orden;
import dominio.Producto;
import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public interface Datos{

    
    public void crear();
    public void leer();
    public void escribir(Orden o1, String nombre);

    
}
