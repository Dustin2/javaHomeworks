package proyventapuerta;

public class Puerta {
    private int altura,anchura,grosor,tipo;
    private double precio;

    public  Puerta(){
        this.altura = 2030;
        this.anchura = 825;
        this.grosor = 45;
        this.tipo = 1;
        this.precio = 980;
    }
    
    public Puerta(int altura, int anchura, int tipo){
        this.altura = altura;
        this.anchura = anchura;
        this.grosor = 45;
        this.tipo = tipo;
        this.precio = 980;
    }
    
    public double calcularCosto(){
        return 0;
    }
    
    public int getAltura() {
        return altura;
    }
// actualizar informacion
    public void setAltura(int altura) {
        this.altura = altura;
    }
//traer informacion
    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getGrosor() {
        return grosor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //calcular costo puerta
    public double Costopuerta(){
        double CostoMadera=0,CostoMedida=0,CostoPuerta=0;
        if (this.tipo> 1 && this.tipo<4) {
    //cacular el porcentaje de incremento por tipo de madera
        switch(this.tipo){
            case 2 :
                CostoMadera=this.precio*0.07;
                break;
            case 3 :
                CostoMadera=this.precio*0.15;
        }
        }
        if (this.altura>2030 || this.anchura>825) {
            
        CostoMedida=this.precio*0.08;
        }
        CostoPuerta=this.precio+CostoMedida+CostoMadera;
        return CostoPuerta;
    
    }
   
}
