
package almacen;

/**
 *
 * gallardo galindo dustin israel
 */
public class Producto {
    private String nombre;
    private int cantidad;
    private double peso;
    
    //constructor con parametros
    public Producto (String nombre,int cantidad,double peso){
    this.nombre=nombre;
    this.cantidad=cantidad;
    this.peso=peso;
    }

   public  Producto() {
   }
    //metodos get
    public String getNombre(){
    return nombre;
    }
    public int getCantidad(){
    return this.cantidad;
    }
    public double getPeso(){
    return this.peso;
    }
   //metodos get
      public void setNombre(String nombre) {
        this.nombre=nombre;
    }
        public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
          public void setPeso(double peso) {
        this.peso = peso;
    }
}
