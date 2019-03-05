/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import java.util.Scanner;

/**
 *
 * @author PROGRAMAR
 */
public class ProyAlmacen {

    public static void main(String[] args) {
     Scanner teclado= new Scanner(System.in);
     Producto Producto = new Producto();
    int op = 0 ;
        do {
            System.out.println("1.- op");
            System.out.println("2.- op");
            System.out.println("3.- op");
           try{ op=teclado.nextInt();
           }catch(Exception e){
           //controlar la excepcion
               System.out.println("Ingresa un caracter valido");
               break;
           }
            switch(op) {
                case 1:
                    System.out.println("ddsadas");
                    break;
                default:
                    break;
        }
        } while (op!=3);
        

    }  
}
