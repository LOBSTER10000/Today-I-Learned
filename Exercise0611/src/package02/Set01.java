package package02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("Ibatis");
		
		int size = set.size();
		System.out.println(size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println("t : " + str);
		}
		
		set.remove("JDBC");
		set.remove("Ibatis");
		
		System.out.println(set.size());
		
	    iterator = set.iterator();
	    while(iterator.hasNext()) {
	    	String str2 = iterator.next();
	    	System.out.println("t2 :" + str2);
	    }
	    
	    set.clear();
	    System.out.println(set.isEmpty());
	}

}
