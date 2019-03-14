
package proyalumnos;

/**
 *
 * Dustin israel gallardo galindo
 * no control 18460568
 */
import javax.swing.JOptionPane;
 
public class MainColaArray 
{
    public static ColaArray Cola;
     
    public static void main(String[] ARGUMENTOS)
    {    
        int MAX;
 
        MAX = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique el tamaño de la cola (cantidad de elementos): "));   
        Cola = new ColaArray(MAX);
         
        MenuCola();
    }
     
    public static void MenuCola()
    {
        int Opcion;
         
        do
        {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Introducir datos\n"+
                    "2. ELIMINAR DATOS\n"+
                    "3. OBSERVAR DATOS\n"+
                    "4. VACIAR COLA\n"+
                    "5. SALIR\n"+
                    "--------------------------------------------------------\n"+
                    "Seleciona una de las opcciones: ","MENU COLA",JOptionPane.QUESTION_MESSAGE));
             
            switch(Opcion)
            {
                case 1: Cola.InsertarCola();break;
                case 2: Cola.EliminarCola();break;
                case 3: Cola.MostrarCola();break;
                case 4: Cola.VaciarCola();break;
                case 5: System.exit(0);break;
                default: JOptionPane.showMessageDialog(null,"INGRESE UNA OPCION VALIDA \n","ERROR OPCION",JOptionPane.WARNING_MESSAGE);break;
            }
        }
        while(true); //-- SEGUIRA HASTA QUE OPCION SEA IGUAL A 5
    }
}
