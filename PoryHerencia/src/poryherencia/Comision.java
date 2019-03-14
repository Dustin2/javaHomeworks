
package poryherencia ;


public class Comision extends Gerente  {
    private double cmercancia;
    private double comision;
    public Comision(){
        this.cmercancia=0;
        this.comision=0;
    }
     public Comision (String na,double salary,String de,String ass){
    super(na,salary,de,ass);
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
