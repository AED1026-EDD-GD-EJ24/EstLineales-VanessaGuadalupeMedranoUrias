package miPrincipal;
public class DemoDelimitadores {

    public static void menu(){
        System.out.println("~~~~~~DELIMITADORES~~~~~~~");
        Delimitadores objDelimitador = new Delimitadores();
        String expresion = "(a+b)/2";
        if (objDelimitador.evaluar(expresion))
        {
            System.out.println("Expresion correcta ");
        }
        else{
            System.out.println("Expresion incorrecta");
        }
    }
}