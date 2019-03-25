
package proysocio;

public class Socio {
    
    private String nombre;
    private int nosocio;
    private double cuota;
    
    
    public Socio(){
    this.nombre=null;
    this.nosocio=0;
    this.cuota=0;
    
    }
    public Socio(String n,int nosocio,double cuota){
    this.nombre=n;
    this.nosocio=nosocio;
    this.cuota=cuota;
    }
    
    public String getname(){
    return nombre;
    }
    public int getnosocio(){
    return nosocio;
    }
    public double getcuota(){
    return cuota;
    }
    
    public void setname(String na){
    this.nombre=na;
    }
    public void setnosocio(int n){
    this.nosocio=n;
    }
    public void setcuota(double c){
        this.cuota=c;
    }
}
