package package01;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(87);
		treeSet.add(98);
		treeSet.add(75);
		treeSet.add(95);
		treeSet.add(80);
		
		System.out.println(treeSet.isEmpty());
		System.out.println(treeSet.contains(95));
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		System.out.println(treeSet.lower(94));
		System.out.println(treeSet.size());
		
		
		
		Iterator<Integer> iterator = treeSet.descendingIterator();
		Iterator<Integer> iterator2 = treeSet.iterator();
		
		while(iterator2.hasNext()) {
			int b = iterator2.next();
			System.out.println("b " + b);
		}
		while(iterator.hasNext()) {
			int a = iterator.next();
			System.out.println("a " + a);
		}

		while(!treeSet.isEmpty()) {
			int a = treeSet.pollFirst();
			System.out.println(a + " "+ treeSet.size());
		}
	}

}
