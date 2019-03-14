//Class Empleado
package poryherencia;

public class Empleado {
  //sueldo=salsary
  private String name;
  private double salary;
  
  
  ///constructor 
  public Empleado(){
  name=null;
  salary=0;
  }
  ///constructor with paramets
  public Empleado(String name,double salary){
      this.name=name;
      this.salary=salary;
  }
  ///get and set
  public String getName(){
  return name;
  }
  public double getSalary(){
  return salary;
  }
  public void setName(String name){
      this.name=name;
  }
  public void steSalary(double salary){
      this.salary=salary;
  }
}
