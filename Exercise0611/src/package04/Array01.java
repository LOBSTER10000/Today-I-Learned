package package04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Array01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<String> list2 = Arrays.asList(
				   "À¯¹İÀå","Å¹ÀçÈÆ","Å©¶óÄË"
				);
		
		list.add("È«±æµ¿");
		list.add("È«Âù½Ä");
		list.add("È«¹ßÀå");

		for(String str : list) {
			System.out.println(str);
		}
		
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		list.clear();
		System.out.println(list.size());
		
		System.out.println(list2.isEmpty());
		
		System.out.println(list2.contains("À¯¹İÀå"));
		
		
		List<Integer> list3 = new Vector<Integer>();
		list3.add(5);
		list3.add(6);
		list3.add(19);
		
		for(int str : list3) {
			System.out.println(str);
		}
	}

}
