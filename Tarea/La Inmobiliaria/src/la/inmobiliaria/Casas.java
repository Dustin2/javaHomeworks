package la.inmobiliaria;

public class Casas {
    
    /////////////////////////////////// Variables \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    private String direccion;
    private int habitaciones, plantas;
    private double precio, medidas;
    
    /////////////////////////////////// Constructores \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    //Constructor sin parametros
    public Casas (){}
    
    //Construtor con parametros
    public Casas (String direccion,int habitaciones,int plantas, double precio, double medidas){
        this.direccion = direccion;
        this.habitaciones = habitaciones;
        this.plantas = plantas;
        this.precio = precio;
        this.medidas = medidas;
    }
    
    ////////////////////////////////// Metos Setter y Getters \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getPlantas() {
        return plantas;
    }

    public void setPlantas(int plantas) {
        this.plantas = plantas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getMedidas() {
        return medidas;
    }

    public void setMedidas(double medidas) {
        this.medidas = medidas;
    }
    
}
