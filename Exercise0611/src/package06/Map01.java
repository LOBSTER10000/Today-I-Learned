package package06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("홍길동", 123);
		map.put("장발장", 1234);
		map.put("코제트", 12345);
		
		System.out.println(map.size());
		System.out.println(map.containsKey("홍길동"));
		System.out.println(map.get("장발장"));
		System.out.println(map.isEmpty());
		
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			int value = map.get(str);
			System.out.println(str + value);
		}

		Set<Map.Entry<String, Integer>> set2 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator2 = set2.iterator();
		while(iterator2.hasNext()) {
			Entry<String, Integer> values = iterator2.next();
			System.out.println(values.getKey());
			System.out.println(values.getValue());
		}
	}

}
