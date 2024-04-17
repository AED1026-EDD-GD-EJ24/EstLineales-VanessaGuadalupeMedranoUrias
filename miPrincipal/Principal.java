package miPrincipal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int opcion=0;
        do{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("      Estructuras lineales ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 1) Pila");
            System.out.println(" 2) Stack");
            System.out.println(" 3) Delimitadores");
            System.out.println(" 4) Expresion Infija-Prefija");
            System.out.println(" 5) Cola");
            System.out.println(" 6) Queue");
            System.out.println(" 7) Tablas de Dispersion");
            System.out.println(" 8) Estructura combinada");
            System.out.println(" 9) Lista simplemente enlazada ");
            System.out.println("10) ArrayList y LinkedList");
            System.out.println("11) ArrayList de personas ");
            System.out.println();

            System.out.println("0) SALIR");
            System.out.print("Selecciona opción:");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                   DemoPila.menu();
                   break;
                case 2:
                   DemoStack.menu();
                   break;
                case 3:
                   DemoDelimitadores.menu();
                   break;
                case 4:
                   //tarea
                case 5:
                   DemoCola.menu();
                   break;
                case 6:
                   DemoQueue.menu();
                   break;
                case 7:
                   DemoTablaDispersion.menu();
                   break;
                   case 8:
                   DemoEstructuraCombinada.menu();
                   break;
               case 9:
                  DemoListaSimple.menu();
                  break;
                  case 10:
                  DemoArrayListyLinkedList.menu();
                  break;
                  case 11:
                  DemoArrayListPersonas.menu();
                  break;
                case 0:
                    System.out.println("ADIOS!");
                    //consola.close();
                    break;
                default:
                    System.out.println("Valor incorrecto, intente de nuevo!");
            }

        }while(opcion!=0);
    }
    
}
