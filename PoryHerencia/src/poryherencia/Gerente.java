
package poryherencia;

//  "extends" sirve para extender o tener datos de otra clase 
public class Gerente extends Empleado {
private String assistant;
private String dto;
private double bono;
//Dpto = departamento

public Gerente(){
this.dto=null;
this.assistant=null;
}

public Gerente(String n,String dto,String assistant,double salaryday,int dayslab){
    //llamar al constructor padre de la clase empleado
super(n,salaryday,dayslab);
this.dto=dto;
this.assistant=assistant;

}
//get an set

public String getdpto(){
return dto;
}
public String getNAssistant(){
return assistant; 
}

///set//

public void setDpo(String dto){
    this.dto=dto;
}
public void setAssistant(String assistant){
    this.assistant=assistant;
}
 
   public double calcularBono(){
        double salary= this.salaryday*this.dayslab;
        salary=salary*0.20+salary;
      if (this.dayslab<=0) {
          System.out.println("no haz trabajado y tampoco tiene bono");
      }
return salary;
  }
   public double cal(){
    double n=0;
   n=this.calcularPago()*0.20;
       return n;
   }
   //////////////// metodo sobre escrito heredado de la clase empleado /////////////////
@Override
   public double calcularPago(){
   
       return 0;
   }
}
