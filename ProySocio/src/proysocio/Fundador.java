/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proysocio;


public class Fundador extends Socio {
    public int noacciones;
    private int maxinv;

public Fundador(){
this.noacciones=0;
this.maxinv=0;
}
public Fundador(String n,int nosocio,double cuota,int noacciones,int maxinv){
super(n,nosocio,cuota);
this.noacciones=noacciones;
}

public int getnoacc(){
return noacciones;
}
public int getmaxinv(){
return maxinv;
}
public void setnoacc(int noacc){
this.noacciones=noacc;
}
public void setmax(int max){
this.maxinv=max;
        }
    
}

