package miPrincipal;

public class Lista <T>{
    //atributos 
    //primer nodo de la lista
    private Nodo <T> cabeza;
    //total de elementos de la lista 
    private int size;
    //constructor por defecto 
    public Lista (){
        cabeza=null;
        size=0;
    }
    //devuelve el tamaño de la lista 
    public int getSize() {
        return size;
    }
    //consulta si la lista esta vacia
    public boolean esVacio(){
        if (cabeza==null){
            return true;
        }
        return false;
    }
    //agraga un nuevo nodo al final de la lista 
    public void agregar (T valor){
        Nodo <T> nuevo =new Nodo <T> ();
        nuevo.setValor(valor);
        if(esVacio())
        {
            cabeza=nuevo;
        }
        else
        {//agregar al final de la lista 
            Nodo <T> aux = cabeza;
            while (aux.getSiguiente()!=null) {
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);

        }
        size++;
    }
    public void insertar(T valor, int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<=size){
            Nodo<T> nuevo = new Nodo<T>();
            nuevo.setValor(valor);
            //el nuevo nodo se inserta al inicio de la lista
            if(pos==0){
                nuevo.setSiguiente(cabeza);
                cabeza = nuevo;
            }
            else{
                //el nuevo nodo se inserta al final de la lista
                if(pos==size){
                    Nodo<T> aux = cabeza;
                    while(aux.getSiguiente()!=null){
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo);
                }
                else{
                    //el nuevo nodo se inserta en cualquier posicion de la lista
                    Nodo<T> aux = cabeza;
                    for(int i=0; i<=pos-2; i++){
                        aux = aux.getSiguiente();
                    }
                    Nodo<T> siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
                
            }
            size++;

        }
        else{
            throw new PosicionIlegalException();
        }
        
            
    }
    //Devueve el valor de una determinada posicion
    public T getValor(int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<size)
        {
            T valor;
            if(pos ==0){
                valor = cabeza.getValor();
                return valor;
            }
            else{
                Nodo<T> aux = cabeza;
                for(int i=0; i<=pos-1; i++){
                    aux = aux.getSiguiente();
                }
                valor = aux.getValor();

            }
            return valor;

        }
        else{
            throw new PosicionIlegalException();
        }
    }
    public void remover (int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<size){
            if (pos==0){
                //el nodo a eliminar esta en la primera posicion
                cabeza= cabeza.getSiguiente();
                size--;
            }
            //se elimina en medio y al final
            else{
                Nodo<T> aux = cabeza;
                for(int i=0;i<=pos-2;i++){
                    aux = aux.getSiguiente();
                }
                Nodo<T> prox = aux.getSiguiente();
                aux.setSiguiente(prox.getSiguiente());
                size--;
            }

        }
        else{
            throw new PosicionIlegalException();
        }
    }
    //elimina toda la lista
    public void limpiar(){
        cabeza=null;
        size=0;

    }


}

    
    
    
    

