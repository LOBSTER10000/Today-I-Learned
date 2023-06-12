package package05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("ȫ�浿");
		set.add("���걺");
		set.add("����");
		
		System.out.println(set.isEmpty());
		System.out.println(set.contains("����"));
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}

	}

}
