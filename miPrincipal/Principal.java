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
            System.out.println(" 1)  Pila");
            System.out.println(" 2)  Stack");
            System.out.println(" 0)  Salir");
            System.out.print("     Selecciona opcion:");
            opcion=sc.nextInt();

            switch (opcion) {
                case 1:
                    DemoPila.menu();
                    break;
                case 2:
                    DemoStack.menu();
                    break;
            
                default:
                    break;
            }

        }while(opcion!=0);
    }
    
}
