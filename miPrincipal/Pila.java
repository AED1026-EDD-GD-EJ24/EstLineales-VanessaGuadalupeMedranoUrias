package miPrincipal;
public class Pila <T> {
    private Nodo <T> cabeza;//apunta al tope de la pila
    private int size;//almacena el total de elementos de la pila 

    //constructor por defecto
    public Pila(){
        cabeza=null;//null porque es generico 
        size=0;
    }
    //devuelve le total de elementos de la pila 
    public int getSize(){
        return size;
    }
    //verifica si la pila esta vacia 
    public boolean esVacia(){
        return(cabeza==null);
    }
    public void apilar(T valor){
        //crear un nuevo nodo
        Nodo<T> nuevo= new Nodo<T>();
        //fijar el valor dentro de nodo
        nuevo.setValor(valor);
        if(esVacia())
        {//cabeza apunta al nuevo nodo
            cabeza=nuevo;
        }
        else
        {
            //se enlaza el campo sig de nuevo con la cabeza
            nuevo.setSiguiente(cabeza);
            //la nueva cabeza de la pila pasa a ser nuevo
            cabeza = nuevo;
        }
        //incrementar size porque hay nuevo elemento en la pila
        size++;
    }
    //Eliminar un elemento de la pila 
    public void retirar(){
        if(!esVacia())
        {
            cabeza=cabeza.getSiguiente();
            size--;
        }
    }
    //devuelve el elemento almacenado en el tope de la cima 
    public T cima(){
        if(!esVacia())
        {
            return cabeza.getValor();
        }
        else
        {
            return null;
        }
    }
}