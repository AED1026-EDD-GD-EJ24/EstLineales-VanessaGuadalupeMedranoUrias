package miPrincipal;

public class DemoListaDeContactos {
    
    public static void menu() throws PosicionIlegalException {
        System.out.println("************************");
        System.out.println("   LISTA DE CONTACTOS   ");
        System.out.println("************************");
        System.err.println();
        ListaDeContactos lcd = new ListaDeContactos();
        //agregamos algunos contactos
        lcd.agregarContactos("Vanessa", "Medrano", "Cruz Galvez 3390", "vane.medrano@gmail.com", "01800","6677809010");
        lcd.agregarContactos("Francisco", "Herrera", "Cruz Galvez 3392", "frank.herrera@gmail.com", "01802","6677809012");
        lcd.agregarContactos("Paulina", "Garcia", "Cruz Galvez 3394", "pau.garcia@gmail.com", "01804","6677809014");
        lcd.agregarContactos("Renata", "Gaxiola", "Cruz Galvez 3396", "Renata.gaxiola@gmail.com", "01806","6677809016");
        
        Lista<Contato> listado= ldc.mostrarTodosLosContactos();
        System.out.println("~Listado despues de la agregacion~");
        for (int i=0; i<listado.getTamanio(); i++){
            System.out.println(listado.getValor(i));
        }

    }
}