package miPrincipal;
public class Delimitadores {

    public boolean evaluar(String cadena){
        Pila <String> caracteres = new Pila <String> ();
        int i=0;
        char car=' ';
        String s="";
        boolean siLeer=true;

        while(i<cadena.length() && siLeer)
        {
            car = cadena.charAt(i);
            s= charToString(car);
            i++;
        }
        switch (car) {
            //en caso de apilar se da cuando el caracter sea un operador de apertura 
            //( [ { /* 
                case '(':
                caracteres.apilar(charToString(')'));
                break;

                case '[':
                caracteres.apilar(charToString(']'));
                break;

                case '{':
                caracteres.apilar(charToString('}'));
                break;

                case '/':
                //verifcar si el sig char es un *
                if (sigEsAsterisco(cadena, i))
                {
                    caracteres.apilar(charToString('/'));
                    i++;
                }
                break;

                //para desapilar uando el caracter leido sea ) ] } */
                case ')':
                case ']':
                case '}':
                {
                    //comprar que correspondan 
                    String aux =caracteres.cima();
                    if (aux != null)
                    {
                        if(s.compareTo(aux)==0)
                        {//hay correspondencia y por lo tanto lo elimino 
                            caracteres.retirar();
                        }else 
                        {//ya no tiene caso seguir leyendo caracteres 
                            //la expresion es incorrecta 
                            siLeer=false;
                        }
                        
                    }
                }
                case '*':
                //verificar si el sig es /
                if (sigDiagonal(cadena, i)){
                    caracteres.retirar();
                    i++;
                }else
                {
                    siLeer=false;
                }
                break;
        }//aqui termina while

        if (caracteres.esVacia() && siLeer){
            return true;
        }
        return false;
    }//termina metodo
    private static boolean sigEsAsterisco(String cadena, int pos){
        char car = cadena.charAt(pos);
        if (car=='*')
        {
            return true;
        }
        return false;
    }
    private static boolean sigDiagonal(String cadena, int pos){
        char car = cadena.charAt(pos);
        if (car=='/')
        {
            return true;
        }
        return false;
    }
    private static String charToString(char ch){
        return String.valueOf(ch);
    }

    
}