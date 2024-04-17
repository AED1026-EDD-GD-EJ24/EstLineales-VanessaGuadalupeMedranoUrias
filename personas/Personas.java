package personas;
public class Personas {

    private int idPersona;
    private String nombre;
    private int altura;

    public Personas (int id, String nombre, int altura){
        this.idPersona=id;
        this.nombre=nombre;
        this.altura=altura;
    }
    public int getAltura(){
        return altura;
    }
    //omitir metodos get y set para simplificar 
    public String toString(){
        return "Persona-> "+idPersona+", nombre= "+nombre+", altura= "+altura+" \n";
    }
}