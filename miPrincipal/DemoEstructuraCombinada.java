package miPrincipal;
import java.util.Collection;
import java.util.LinkedList;
public class DemoEstructuraCombinada {
    public static void menu(){

        System.out.println("~~~~ESTRUCTURA COMBINADA ~~~~ ");
        System.out.println("HashTable-LinkedList-Vector");
        System.out.println();
        HashTable2<Integer > ht=new HashTable2<Integer>();
      ht.put("par", 2);
      ht.put("par", 4);
      ht.put("par", 6);
      ht.put("impar", 1);
      ht.put("par", 8);
      ht.put("impar", 3);
      ht.put("impar", 5);
      ht.put("par", 10);
      ht.put("impar", 7);
      ht.put("impar", 9);
      LinkedList<Integer> pares=ht.get("par");
      for(Integer i:pares){
        System.out.println(i);
      }
      LinkedList<Integer> impares=ht.get("impar");
      for(Integer i:impares){
        System.out.println(i);
      }
      Collection<String> keys=ht.keys();
      for(String k:keys){
        System.out.println(k);
      }
    
    }
}