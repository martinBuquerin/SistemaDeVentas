package dominio;


import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class Orden {
    private int idOrden;
    ArrayList<Producto> productos= new ArrayList();
    private static int contadorOdenes=1;
    private static int MAX_PRODUCTOS= 10;
   

    
    public Orden() {
         this.idOrden = contadorOdenes++;
    }

    
    public void agregarProducto(Producto product){
        System.out.println("\n");
        System.out.println("Se estan agregando los productos....."); 
        
        int cantidad=1;
        if(productos.size()<MAX_PRODUCTOS || productos.contains(product)==true){
            
           
            if(productos.contains(product)==true){
                cantidad = product.getCantidadProductos();
                cantidad++;
                product.setCantidadProductos(cantidad);
                
            }
            productos.add(product);
            
//System.out.println("\n"+product.getIdProducto());
            System.out.println("¡Producuctos agregados correctamentes!");
        }
         else{
                System.out.println("\n");
                System.out.println("¡Ups limite máximo de productos alcanzado!\n");
            }

        
    }
    
    public double calcularTotal(){
        double cuenta=0;
        
        for(Producto p: productos){
           cuenta += p.getPrecio()*p.getCantidadProductos();

        }
        
        return cuenta;
    }

    public String  mostrarOrden(){
        double total = calcularTotal();
        System.out.println("\nOrden id: "+ idOrden);
        System.out.println("\n\tID"+"\tNOMBRE "+"\tCANTIDAD"+"\tPRECIO");       
        System.out.println("\t--"+"\t------"+"\t--------"+"\t------");
        for(Producto p: productos){
            System.out.print ("\t"+p.getIdProducto()+"\t"+p.getNombre()+"\t  "+p.getCantidadProductos()+"\t\t"+p.getPrecio()+ " €");
            System.out.println();
           
        }
       
        System.out.println("\nImporte total: " +total+ " €\n");
        return "";
    }
        
    public ArrayList<Producto> getProducto() {
        return productos;
    }

    public int getIdOrden() {
        return idOrden;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("idOrden: ").append(idOrden);
        
        return sb.toString();
    }

    
}
