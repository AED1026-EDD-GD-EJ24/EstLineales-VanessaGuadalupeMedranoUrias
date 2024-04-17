package miPrincipal;
//PROPOSITO se generará una lista de 10mil cuadrupedos de forma 
//aleatoria entre 4 tipos despues se imprimira un resumen de 
// los cuadrupedos multiplos de mil y mostrar el acumulado de cada tipo
import java.util.List;
import java.util.LinkedList;
import java.util.Random;
import cuadrupedo.Cuadrupedo;
public class DemoLinkedListCuadrupedos {
    public static void menu(){
        System.out.println("~~~~~~~~ LinkedList de cuadrupedos~~~~~~~~~~~");

        try {
            List<Cuadrupedo> cuadrupedos= new LinkedList<>();

            String [] tipos= {"Leon", "Gato", "Perro","Cocodrilo"};

            Random random=new Random();

            for(int i=0; i<=10000; i++){
                String tipo= tipos[random.nextInt(tipos.length)];
                cuadrupedos.add(new Cuadrupedo(i, tipo));
            }
            int leonesCount=0, gatoCount=0, perroCount=0, cocoCount=0;
            for(Cuadrupedo cuadrupedo:cuadrupedos){
                if (cuadrupedo.getIdCuadrupedo()%1000==0){
                    System.out.println("ID"+cuadrupedo.getIdCuadrupedo()+", tipo: "+cuadrupedo.getTipo());
                }
                switch (cuadrupedo.getTipo()) {
                    case "Leon":
                        leonesCount++;
                        break;
                    case "Gato":
                         gatoCount++;
                        break;
                    case "Perro":
                    perroCount++;
                    break;
                    case "Cocodrilo":
                    cocoCount++;
                    break;
                
                    default:
                        break;
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
