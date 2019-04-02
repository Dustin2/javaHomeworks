        /*
         * To change this license header, choose License Headers in Project Properties.
         * To change this template file, choose Tools | Templates
         * and open the template in the editor.
         */
        package soft.tech;

       
        public class Empleado {   
            
            public  String nom;
            public  String cedula;
            public  int edad;
            public  boolean casado;     
            public  double salario;      

        Empleado(){
        }
        Empleado(String nom,String cedula,int edad,boolean casado,double salario){
            this.nom=nom;
            this.cedula=cedula;
            this.edad=edad;
            this.casado=casado;
            this.salario=salario;
        }
        public String getnombre(){
        return nom;
        }
        public String getcedula(){
        return cedula;
        }
        public int getedad(){
        return edad;
        }
        public boolean getcasado(){
        return casado;
        }
        public double getsalario(){
        return salario;
        }
        public void setnom(String no){
        this.nom=no;
        }
        public void setcedula(String ce){
        this.cedula=ce;
        }
        public void setedad(int ed){
            this.edad=ed;
        }
        public void setcasado(boolean casa){
        this.casado=casa;
        }
        public void setsalario(double sa){
        this.salario=sa;
        }
        
        public String experiencia (){
        String tipotrabajador = null;
            if (edad<=21) {
                tipotrabajador="principiante";
              
            }
            if (edad>=22&& edad<=35) {
                tipotrabajador="intermedio";
            
            }
            if (edad>=35) {
                tipotrabajador="senior";
                
            }
             return tipotrabajador;
          
        }
   
}
        
