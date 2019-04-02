/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.tech;

/**
 *
 * @author PROGRAMAR
 */
public class Programador extends Empleado{
    private int lineascodhora;
    private String lenguajedom;
    
    Programador(){
    }
    Programador(String name,String cedula,int edad,boolean casado,double sueldo,String lenguajedom,int lineascod){
        super(name,cedula,edad,casado,sueldo);
        this.lenguajedom=lenguajedom;
        this.lineascodhora=lineascod;
    }
    
    public String  getlenguaje(){
    return lenguajedom;
    }
    public int gethoras(){
    return lineascodhora;
    }
    public void setlengu(String len){
    this.lenguajedom=len;
    }
    public void sethoras(int lineas){
    this.lineascodhora=lineas;
    }
    
}
