
package poryherencia ;


public class Comision extends Empleado  {
    private double cmercancia;
    private double comision;
    public Comision(){
        this.cmercancia=0;
       this.comision=0;
    }
     public Comision (String na,double salary){
    super(na,salary);
    this.cmercancia=cmercancia;
    this.comision=comision;
    }
     ///gets//
     public double setCmerca(){
     return cmercancia;
     }
     public double setComision(){
     return comision;
     }
     ///sets///
     public void getCmerca(double cmercancia){
         this.cmercancia=cmercancia;
     }
     public void getComision(double comision){
         this.comision=comision;
     }
}
