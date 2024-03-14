package miPrincipal;
public class DemoPila{
    public static void menu(){
        System.out.println("~~~~~~~~PILA~~~~~~~~~~~");
        //crear una nueva pila de enteros
        Pila <Integer> pila=new Pila<Integer>();
        //apilar algunos datos enteros
        pila.apilar(3);
        pila.apilar(5);
        pila.apilar(8);
        System.out.println("El elemento 3 se encuentra en la posicion "+pila.buscar(3));
        System.out.println("El elemento 5 se encuentra en la posicion "+pila.buscar(5));
        System.out.println("El elemento 8 se encuentra en la posicion "+pila.buscar(8));
        //elemento que no esta 
        System.out.println("El elemento 2 se encuentra en la posicion "+pila.buscar(2));

        System.out.println("El tope de la pila es "+pila.cima());
        //System.out.println("Tamaño "+pila.getSize());
        //se desapila
        pila.retirar();
        System.out.println("El tope de la pila es "+pila.cima());
        pila.retirar();
        System.out.println("El tope de la pila es "+pila.cima());
        pila.retirar();
        System.out.println("El tope de la pila es "+pila.cima());
    }
}