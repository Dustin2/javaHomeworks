/*
 * dustin israel
 */
package poryherencia;

/**
 *
 * 18460568
 */
public class PoryHerencia {

    public static void main(String[] args) {
        Gerente g1 = new Gerente("maria","cocina","soer",500,5);
       Empleado e1 = new Empleado("Jose Martinez",400,0);
        System.out.println("nombre"+e1.getName());
        System.out.println("sueldo diario"+e1.getSalary());
        System.out.println("dias laborados "+e1.getdayslab());
        System.out.println("pago quincenasl "+e1.calcularPago());
        System.out.println("");
        System.out.println("");
        System.out.println("nombre"+g1.getName());
        System.out.println("departamento"+g1.getdpto());
        System.out.println("assistente"+g1.getNAssistant());
        System.out.println("sueldo diario"+g1.getSalary());
        System.out.println("dias laborados "+g1.getdayslab());
        System.out.println("pago quincenasl "+g1.calcularPago());

    }
    
}
