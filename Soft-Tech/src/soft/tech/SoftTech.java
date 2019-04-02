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
public class SoftTech {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Programador pro = new Programador("jose","ffas12",26,true,23000.012,"javaScript",17560);
        System.out.println("nombre"+pro.getnombre());
        System.out.println("cedula"+pro.getcedula());
        System.out.println("edad"+pro.edad);
        System.out.println("casado?"+pro.getcasado());
        System.out.println("sueldo"+pro.getsalario());
        System.out.println("lenguaje dominado"+pro.getlenguaje());
        System.out.println("horas codificando"+pro.gethoras());
        System.out.println("experiencia:"+pro.experiencia());
    }
    
}
