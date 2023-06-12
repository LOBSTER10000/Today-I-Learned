package package05;

import java.util.HashSet;
import java.util.Set;

public class Set02 {

	public static void main(String[] args) {
		Set<Sports> set = new HashSet<Sports>();
		
		set.add(new Sports("펠프스", "베컴", 1));
		set.add(new Sports("박태환", "루니", 2));
		set.add(new Sports("조오련", "메시", 3));
		
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
