/*
 * Eduardo Serrano Jaime
 * No. Control 18460520
 * Banco
 */
package proybanco;

///////////////////////////////////// Impoertaciones \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
import java.util.Scanner;

public class ProyBanco {

    public static void main(String[] args) {

        //////////////////////////////// Variables y Objetos \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        //Variables
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        //Objetos
        Operaciones operaciones1 = new Operaciones();
        Operaciones operaciones2 = new Operaciones(10000, true);
        
        ////////////////////////////////////// "GUI" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ 
        do {
            System.out.println("------------------------------------");
            System.out.println("\tMenu Principal");
            System.out.println("1.- Consultar Saldo");
            System.out.println("2.- Depositos");
            System.out.println("3.- Retiros");
            System.out.println("4.- Salir");
            System.out.print("Ingrese una opcion: ");

            try {
                opcion = leer.nextInt();
            } catch (Exception e) {
                opcion = 6;
                leer.nextLine();
            }// Termina try catch

            switch (opcion) {
                case 1:
                    System.out.println("------------------------------------");
                    System.out.println("Saldo Actual: $" + operaciones1.getSaldo());
                    break;
                case 2:
                    System.out.println("------------------------------------");
                    System.out.println("\tDepositar");
                    operaciones1.validar(1);
                    break;
                case 3:
                    System.out.println("------------------------------------");
                    System.out.println("\tRetirar");
                    operaciones1.validar(2);
                    break;
                case 4:
                    System.out.println("------------------------------------");
                    System.out.println("Adios!, vuelva pronto");
                    break;
                default:
                    System.out.println("------------------------------------");
                    System.out.println("Opcion invalida. Ingrese una opcion correcta");
                    break;
            }//Termina switch
        } while (opcion != 4);//Termina do while
    }//Termina main
}//Termina clase