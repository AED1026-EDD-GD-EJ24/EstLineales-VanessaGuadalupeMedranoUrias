package miPrincipal;

public class DemoListaDeContactos {
    
    public static void menu()  {
        System.out.println("************************");
        System.out.println("   LISTA DE CONTACTOS   ");
        System.out.println("************************");
        System.err.println();
    }
    public Contacto buscarContacto (String nombres, String apellidos ){
        
    }

public boolean eliminarContacto(String nombres , String apellidos) throws PosicionIlegalException {
        Contacto con = buscarContacto(nombres,apellidos);
        if (con!=null){
            for (int i=0; i<this.contactos.getTamanio(); i++){
                Contacto contAux = contactos.getValor(i);
                if (contAux.getNombres().equals(nombres) &&
                    contAux.getApellidos().equals(apellidos))
                    {
                        contactos.remover(i);
                    }
            }
            return true;
        }
        return false;
}
    public boolean modificarContacto(String nombres, String apellidos,String direccion,
    String correo, String telefono,String celuar){
        //verificar si el contato existe 
        Contacto con = buscarContacto(nombres, apellidos)
        if (con==null){
            return false;
        }
        else{
            //modifica el contacto con los nuevos datos 
            con.setDireccion(direccion);
            con.setCorreo(correo);
            con.setTelefono(telefono);
            con.setCelular(celuar);
        }
        return true;
    }
}