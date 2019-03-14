
package poryherencia;

//  "extends" sirve para extender o tener datos de otra clase 
public class Gerente extends Empleado {
private String assistant;
private String dto;
//Dpto = departamento

public Gerente(){
this.dto=null;
this.assistant=null;
}

public Gerente(String n,double s,String dto,String assistant){
    //llamar al constructor padre de la clase empleado
super(n,s);
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
 

}
