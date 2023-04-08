import java.util.*;  
class Ex4{  
public static void main(String args[]){  
  
ArrayList<String> al=new ArrayList<String>();  
al.add("Gabriela");  
al.add("Filipe");  
al.add("André");  
al.add("joão");  
  
Collections.sort(al);  
Iterator<String> itr = al.iterator(); 
while(itr.hasNext()){  
System.out.println(itr.next());  
 }  
}  
}  