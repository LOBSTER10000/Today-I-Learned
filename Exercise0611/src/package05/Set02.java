package package05;

import java.util.HashSet;
import java.util.Set;

public class Set02 {

	public static void main(String[] args) {
		Set<Sports> set = new HashSet<Sports>();
		
		set.add(new Sports("������", "����", 1));
		set.add(new Sports("����ȯ", "���", 2));
		set.add(new Sports("������", "�޽�", 3));
		
		for(Sports list : set) {
			String string2 = list.getSwimming();
			String string3 = list.getFootball();
			int int1 = list.getMedal();
			System.out.println(string2 + " " + string3 + " " + int1);
		}
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.clear();
		System.out.println(set.size());
	}

}
