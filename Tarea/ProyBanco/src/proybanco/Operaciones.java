package proybanco;

import java.util.Scanner;

public class Operaciones {

    ////////////////////////////////// Variables \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    private double saldo = 5000;
    private boolean salir;
    private Scanner leer = new Scanner(System.in);

    //////////////////////////////// Constructores \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    public Operaciones(){
        this.saldo = 5000;
        this.salir = true;
    }
    
    public Operaciones(double saldo, boolean salir){
        this.saldo = saldo;
        this.salir = salir;
    }
    
    /////////////////////////////////// Metodos \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    public void depositar(double transaccion) {
        this.saldo += transaccion;
    }

    public void retirar(double transaccion) {
        this.saldo -= transaccion;
    }

    public void validar(int operacion) {
        double transaccion = 0;
        do {
            salir = true;
            try {
                System.out.println("Ingrese la cantidad que desea retirar");
                System.out.print("$");
                transaccion = leer.nextDouble();
            } catch (Exception e) {
                leer.nextLine();
                System.out.println("------------------------------------");
                System.out.println("Por Favor Ingrese una cantidad Valida");
                salir = false;
            }
            if (salir == true) {
                switch (operacion) {
                    // 1 = Deposito
                    // 2 = Retiro
                    case 1:
                        if (transaccion <= 0) {
                            System.out.println("------------------------------------");
                            System.out.println("Por Favor Ingrese una cantidad valida");
                            salir = false;
                        } else {
                            System.out.println("------------------------------------");
                            asignarOperacion(operacion, transaccion);
                            System.out.println("Transaccion Realisada con exito!");
                            salir = true;
                        }
                        break;
                    case 2:
                        if (transaccion <= 0 || transaccion > saldo) {
                            System.out.println("------------------------------------");
                            System.out.println("Por Favor Ingrese una cantidad valida");
                            salir = false;
                        } else {
                            System.out.println("------------------------------------");
                            asignarOperacion(operacion, transaccion);
                            System.out.println("Transaccion Realisada con exito!");
                            salir = true;
                        }
                        break;
                }

            }
        } while (salir == false);
    }//Termina Validar

    public void asignarOperacion(int operacion, double transaccion) {
        switch (operacion) {
            // 1 = Deposito
            // 2 = Retiro
            case 1:
                this.depositar(transaccion);
                break;
            case 2:
                this.retirar(transaccion);
                break;
        }
    }//Termina asignarOperacion

    ////////////////////////// Metodos Getters y Setters \\\\\\\\\\\\\\\\\\\\\\\\\\\
    public double getSaldo() {
        return saldo;
    }//Termina getSaldo()

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }//Termina Saldo();

}//Termina Clase Operaciones