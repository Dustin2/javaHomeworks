//Class Empleado
package poryherencia;

public class Empleado {
  //sueldo=salsary
  private String name;
  private double salaryday;
  private int dayslab;
  
  
  ///constructor 
  public Empleado(){
  name=null;
  salaryday=0;
  dayslab=0;
  }
  ///constructor with paramets
  public Empleado(String name,double salaryday,int dayslab){
      this.name=name;
      this.salaryday=salaryday;
      this.dayslab=dayslab;
  }
  ///get and set
  public String getName(){
  return name;
  }
  public double getSalary(){
  return salaryday;
  }
  public int getdayslab(){
  return dayslab;
  }
  public void setName(String name){
      this.name=name;
  }
  public void getSalary(double salary){
      this.salaryday=salary;
  }
  public void setDayslab(int dayslab){
  this.dayslab=dayslab;
  }
  public double calcularPago(){
        double salary= this.salaryday*this.dayslab;
      if (this.dayslab<=0) {
          System.out.println("no haz trabajado");
      }
return salary;
  }
}
