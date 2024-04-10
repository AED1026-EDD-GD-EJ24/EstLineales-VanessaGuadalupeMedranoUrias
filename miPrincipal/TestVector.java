package miPrincipal;
import java.util.Collection;
import java.util.Vector;
public class TestVector {
    public static void main(String[] args) {
        //invocar al metodo obtenerLista de la clase UNombre
        Collection <String> lista = UNombre.obtenerLista();
        //ITERAR LA COLLECTION DE NOMBRES Y MOSTRAR CADA ELEMENTO 
        for(String nombre:lista){
            System.out.println(nombre);
        }
   
    }
    

}