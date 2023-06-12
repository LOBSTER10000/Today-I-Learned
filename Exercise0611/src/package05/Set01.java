package package05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("홍길동");
		set.add("연산군");
		set.add("세종");
		
		System.out.println(set.isEmpty());
		System.out.println(set.contains("세종"));
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}

	}

}
