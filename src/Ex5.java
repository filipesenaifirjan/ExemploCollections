import java.util.*;

class Ex5 {
    public static void main(String args[]) {

            ArrayList<Integer> al = new ArrayList<Integer>();
            al.add(Integer.valueOf(701));
            al.add(Integer.valueOf(101));
            al.add(230); //vai imprimir os números em ordem crescente

      Collections.sort(al);

        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
} 
 