import java.util.*;  
public class Ex2 {  
    public static void main(String a[]){         
        
        List<Integer> list = new ArrayList<Integer>();  
        list.add(41);  
        list.add(97);  
        list.add(24);  
        list.add(16);  
        list.add(8);  
        list.add(12);  
        
        System.out.println("Vou imprimir o maior valor dos elementos da lista: "+Collections.max(list));  
    }  
}  