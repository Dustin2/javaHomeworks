/*
 *Gallardo Galindo Dustin Israel
 * No. Control 18460568
 */
package proyventapuerta;

import java.util.Scanner;

public class ProyVentaPuerta {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op;
        String nomMadera[]= {"null","pino","cedro","roble"};
        Puerta puerta = new Puerta();

        do {
            ////////////////////////   Menu Principal \\\\\\\\\\\\\\\\\\\\\\
            System.out.println("------------------------------------------------");
            System.out.println("\tMenu Principal");
            System.out.println("1.- Tipo de puerta");
            System.out.println("2.- Medidas");
            System.out.println("3.- Mostar Pedido y Calcular Precio");
            System.out.println("4.- calcular costo de una custom door");
            System.out.println("5.- Salir");
            System.out.println("6.- Salir");
            System.out.print("Seleciona una opcion: ");
            op = leer.nextInt();

            /////////////////////// Opciones \\\\\\\\\\\\\\\\\\\\\\\\\
            switch (op) {
                case 1:
                    ////////////// Menu de tipo de manera \\\\\\\\\\\\\\\
                    System.out.println("------------------------------------------------");
                    System.out.println("\tTipo de Madera");
                    System.out.println("1.- Pino");
                    System.out.println("2.- Cedro");
                    System.out.println("3.- Roble");
                    System.out.print("Seleciona la madera: ");
                    puerta.setTipo(leer.nextInt());
                    break;
                case 2:
                    System.out.println("------------------------------------------------");
                    System.out.println("\tMedidas");
                    System.out.println("1.- Altura");
                    System.out.println("2.- Anchura");
                    System.out.println("3.- Salir");
                    System.out.println("Selecione una opcion: ");
                    op = leer.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("------------------------------------------------");
                            System.out.println("\tAltura");
                            System.out.println("Ingrese la altura en milimetros: ");
                            puerta.setAltura(leer.nextInt());
                            break;
                        case 2:
                            System.out.println("------------------------------------------------");
                            System.out.println("\tAnchura");
                            System.out.println("Ingrese la anchura en milimetros: ");
                            puerta.setAnchura(leer.nextInt());
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                                        break;
                case 4:
                    System.out.println("Costo Puerta : $"+puerta.Costopuerta());
                    break;
                case 5 :
                     System.out.println("Adios, vuelva pronto!");
                default:
                    System.out.println("------------------------------------------------");
                    System.out.println("Opcion no valida porfavor ingrese una opcion valida");
                    break;
            }
        } while (op != 6);

    }//Termina el main

    
    
      public static void mostrarpedido(Puerta puerta, String nomMadera[]){
        System.out.println("------------------------------------------------");
                            System.out.println("\tFACTURA");
                            System.out.println("Madera: "+"......"+nomMadera[puerta.getTipo()]);
                            System.out.println("Altura: "+"......"+puerta.getAltura()+"mm");
                            System.out.println("Anchura: "+"......"+puerta.getAnchura()+"mm");
                            System.out.println("Grosor: "+"......"+puerta.getGrosor()+"mm");
                            System.out.println("\t------------");
                            System.out.println("......"+"$" + puerta.getPrecio());
                            System.out.println("------------------------------------------------");

    }
}//Termina clase ProyVentaPuerta
  
//static = esta contenteniodo en la clase modoficador que mantiene anclado