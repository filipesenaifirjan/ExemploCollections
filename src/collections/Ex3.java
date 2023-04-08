package collections;
import java.util.*;  
public class Ex3 {  
    public static void main(String a[]){         
        
        List<Integer> list = new ArrayList<Integer>();  
        list.add(46);  
        list.add(87);  
        list.add(20);  
        list.add(164);  
        list.add(8);  
        list.add(32);  
        
        System.out.println("Nesse exemplo, vou imprimir o valor mínimo da lista: "+Collections.min(list));  
    }  
}  