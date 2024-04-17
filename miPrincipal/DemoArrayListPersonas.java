package miPrincipal;
//proposito crear un array list de objeto persona 
//crearemos 1000 personas de forma aleatoria considerando que sus alturas fluctuen entre 100-200cm
//finalmente mostrar por consola todos los objetos creados asi como la media de sus alturas 

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;
import personas.Personas;
public class DemoArrayListPersonas {

    public static void menu(){
        System.out.println("~~~~~ ArrayList de Personas ~~~~~~~~~~");

        try {
            List<Personas> lp = new ArrayList <Personas>();
            Random r = new Random();
            Personas temp=null;
            int sumaAlturas=0;
            for (int i=0; i<1000; i++){
                lp.add(new Personas(i,"Persona"+i,r.nextInt(100)+100));

            }
            Iterator <Personas> it = lp.iterator();
            while(it.hasNext()){
                temp=it.next();
                System.out.println(temp);
                sumaAlturas+=temp.getAltura();
            }
            System.out.println("La media del conjunto de personas = "+sumaAlturas/lp.size());
            
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}