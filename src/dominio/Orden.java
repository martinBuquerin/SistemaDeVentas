package dominio;


import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class Orden {
    private int idOrden;
    static ArrayList<Producto> productos= new ArrayList();
    private static int contadorOdenes=1;
    private static int MAX_PRODUCTOS= 10;

    
    public Orden() {
         this.idOrden = contadorOdenes++;
    }

    
    public static void agregarProducto(Producto product){
        System.out.println("\n");
        System.out.println("Se estan agregando los productos....."); 
        
     
        if(productos.size()<MAX_PRODUCTOS){
            productos.add(product);
            System.out.println("\n");
            System.out.println("¡Producuctos agregados correctamentes!");
        }
         else{
                System.out.println("\n");
                System.out.println("¡Ups limite máximo de productos alcanzado!");
            }

        
    }
    
    public double calcularTotal(){
        double cuenta=0;
        
        for(Producto p: productos){
           cuenta += p.getPrecio();

        }
        
        return cuenta;
    }

    public void mostrarOrden(){
        System.out.println("\nOrden id: "+ idOrden);
        
        for(Producto p: productos){
            System.out.print ("\t\t"+p.getNombre()+"   "+ p.getPrecio()+ " €");
            System.out.println();
        }
        System.out.println("\nImporte total: "+calcularTotal()+" €\n");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("idOrden: ").append(idOrden);
        
        return sb.toString();
    }

    
}