package package01;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap01 {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(87, "홍길동");
		treeMap.put(98, "이동수");
		treeMap.put(75, "박길순");
		treeMap.put(95, "신용권");
		treeMap.put(80, "김자바");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = treeMap.firstEntry();
		System.out.println(entry);
		entry = treeMap.lastEntry();
		System.out.println(entry);
		entry = treeMap.lowerEntry(95);
		System.out.println(entry);
		entry = treeMap.higherEntry(83);
		System.out.println(entry);
		entry = treeMap.floorEntry(95);
		System.out.println(entry);
		
		Set<Integer> set = treeMap.keySet();
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			int a = iterator.next();
			String b = treeMap.get(a);
			System.out.println(a + " " + b);
		}

		Set<Integer> set2 = treeMap.descendingKeySet();
		Iterator<Integer> iterator2 = set2.iterator();
		while(iterator2.hasNext()) {
			int a = iterator2.next();
			String b = treeMap.get(a);
			System.out.println(a + " " + b);
		}
		
		NavigableMap<Integer, String> navi = treeMap.descendingMap();
		Set<Map.Entry<Integer, String>> map = navi.entrySet();
		for(Map.Entry<Integer, String> maps : map) {
			System.out.println(maps.getKey());
			System.out.println(maps.getValue());
		}
		
		NavigableMap<Integer, String> navi2 = treeMap.subMap(8, true, 9, true);
		for(Map.Entry<Integer, String> navi3 : navi2.entrySet()) {
			System.out.println(navi3);
		}
	}

}
