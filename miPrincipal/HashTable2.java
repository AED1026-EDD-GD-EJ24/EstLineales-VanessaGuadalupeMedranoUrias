package miPrincipal;
import java.util.Collection;
import java.util.Vector;
import java.util.Hashtable;
import java.util.LinkedList;

public class HashTable2 <T> {
    private Hashtable<String , LinkedList <T> > tabla;
    private Vector <String> claves;

    public HashTable2 (){
        tabla = new Hashtable<String , LinkedList <T>>();
        claves = new Vector<String>();
    }
    public void put (String key, T elm){
        LinkedList<T> lst= tabla.get(key);

        if (lst==null)
        {
            lst=new LinkedList<T>();
           // lst.add(elm);
            tabla.put(key,lst);
            claves.add(key);
        }
            lst.addLast(elm);
    }
    public LinkedList<T> get(String key){

        return tabla.get(key);
    }
    public Collection<String> keys(){

        return claves;
    }
}