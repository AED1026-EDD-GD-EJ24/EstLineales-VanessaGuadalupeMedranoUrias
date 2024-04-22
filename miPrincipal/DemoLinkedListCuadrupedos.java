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

        try{
            List<Cuadrupedo> cuadrupedos = new LinkedList<>();
            String [] tipos ={"León","Gato","Perro","Elefante"};
            Random random = new Random();
            for(int i=1;i<=10000;i++){
                String tipo = tipos[random.nextInt(tipos.length)];
                cuadrupedos.add(new Cuadrupedo(i, tipo));
            }
            
            int leonCount = 0, gatoCount =0, perroCount=0,elefanteCount=0;
            for(Cuadrupedo cuadrupedo:cuadrupedos){
                if(cuadrupedo.getIdCuadrupedo()%1000==0){
                    System.out.println("ID"+cuadrupedo.getIdCuadrupedo()+
                      ",tipo: "+cuadrupedo.getTipo());
                }
                switch (cuadrupedo.getTipo()) {
                    case "León":
                        leonCount++;
                        break;
                    case "Gato":
                        gatoCount++;
                        break;
                    case "Perro":
                        perroCount++;
                        break;
                    case "Elefante":
                       elefanteCount++;
                       break;
                       
                }

            }
            System.out.println("Resumen:");
            System.out.println("Leones:"+leonCount);
            System.out.println("Gatos:"+gatoCount);
            System.out.println("Perros:"+perroCount);
            System.out.println("Elefantes"+elefanteCount);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    
}
