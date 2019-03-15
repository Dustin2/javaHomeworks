/*
 * Eduardo Serrano Jaime
 * No. Control 18460520
 * Inmobiliaria
 */
package la.inmobiliaria;

//////////////////////////////////// Importaciones \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
import java.util.Scanner;

public class LaInmobiliaria {

    public static void main(String[] args) {

        /////////////////////////////////////// Variables \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        int op = 0;

        ////////////////////////////////////// Objetos \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        Scanner leer = new Scanner(System.in);
        Casas casa = new Casas();
        Casas casa2 = new Casas("", 5, 2, 650000, 800);

        do {
            System.out.println("-------------------------------------------");
            System.out.println("\tMenu Principal");
            System.out.println("1.- Dar de alta un casa");
            System.out.println("2.- Ver casa");
            System.out.println("3.- Salir");
            System.out.print("Ingrese una opcion: ");
            try {
                op = leer.nextInt();
            } catch (Exception e) {
                leer.nextLine();
                op = 6;
            }

            switch (op) {
                case 1:
                    do {
                        System.out.println("-------------------------------------------");
                        System.out.println("\tNueva Casa");
                        System.out.println("1.- Ingresar Direccion");
                        System.out.println("2.- Ingresar Numero de habitaciones");
                        System.out.println("3.- Ingresar Numeor de plantas");
                        System.out.println("4.- Ingrese Precio de la propiedad");
                        System.out.println("5.- Ingrese Medidas de la propiedad");
                        System.out.println("6.- Regresar al Menu Principal");
                        System.out.print("Ingrese una opcion: ");

                        try {
                            op = leer.nextInt();
                        } catch (Exception e) {
                            leer.nextLine();
                            op = 7;
                        }

                        switch (op) {
                            case 1:
                                System.out.println("-------------------------------------------");
                                System.out.println("\tDireccion");
                                try {
                                    casa.setDireccion(leer.nextLine());
                                } catch (Exception e) {
                                    System.out.println("Operacion Fallida!!!");
                                }
                                break;
                            case 2:
                                System.out.println("-------------------------------------------");
                                System.out.println("\tNumero de Habitaciones");
                                try {
                                    casa.setHabitaciones(leer.nextInt());
                                } catch (Exception e) {
                                    System.out.println("Operacion Fallida!!!");
                                }
                                break;
                            case 3:
                                System.out.println("-------------------------------------------");
                                System.out.println("\tNumero de plantas");
                                try {
                                    casa.setPlantas(leer.nextInt());
                                } catch (Exception e) {
                                    System.out.println("Operacion Fallida!!!");
                                }
                                break;
                            case 4:
                                System.out.println("-------------------------------------------");
                                System.out.println("\tPrecio");
                                try {
                                    casa.setPrecio(leer.nextDouble());
                                } catch (Exception e) {
                                    System.out.println("Operacion Fallida!!!");
                                }
                                break;
                            case 5:
                                System.out.println("-------------------------------------------");
                                System.out.println("\tMedidas");
                                try {
                                    casa.setMedidas(leer.nextDouble());
                                } catch (Exception e) {
                                    System.out.println("Operacion Fallida!!!");
                                }
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("-------------------------------------------");
                                System.out.println("Ingrese una opcion valida!!");
                                break;
                        }

                    } while (op != 6);
                    break;
                case 2:
                    System.out.println("-------------------------------------------");
                    System.out.println("\tPropiedad");
                    System.out.println("Direccion: " + casa.getDireccion());
                    System.out.println("Habitaciones: " + casa.getHabitaciones());
                    System.out.println("Plantas: " + casa.getPlantas());
                    System.out.println("Precio: $" + casa.getPrecio());
                    System.out.println("Metros cuadrados: " + casa.getMedidas());
                    break;
                case 3:
                    System.out.println("-------------------------------------------");
                    System.out.println("Adios!, vuelva pronto");
                    break;
                default:
                    System.out.println("-------------------------------------------");
                    System.out.println("PorFavor Ingrese una opcion valida");
                    break;
            }
        } while (op != 3);

    }//Termina main()

}//Termina clase LaImbobiliaria()
