import java.util.*; 

public class Ex1 {
 public static void main(String a[]){      
        
        List<String> list = new ArrayList<String>();  
        list.add("José");  
        list.add("Maria");  
        list.add("Filipe");  
        System.out.println("Iniciando:"+list);  
        
        Collections.addAll(list, "Pedro","Henrique");  
        System.out.println("Atualizando:"+list);  
        
        String[] strArr = {"Carlos", "João"};  
        Collections.addAll(list, strArr);  
        System.out.println("Lista completa:"+list);  
    }  
} 
