package backjoon;

import java.util.*;

public class Main{
  public static void main(String[] args){
	  
     TreeSet<Integer> set = new TreeSet<Integer>();
     Scanner scan = new Scanner(System.in);
     int N = scan.nextInt();
     for(int i = 0; i< N; i++){
         set.add(scan.nextInt());
     }
     
     TreeSet<Integer> set2 = (TreeSet<Integer>) set.descendingSet();
     Iterator<Integer> iterator = set2.descendingIterator();
     while(iterator.hasNext()){
         int a = iterator.next();
         System.out.println(a);
     }
  }
}