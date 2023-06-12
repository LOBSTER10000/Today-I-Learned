package package03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {
		//map컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 지정
		
		map.put("신용권", 85);
		map.put("김자바", 95);
		map.put("동장군", 80);
		map.put("홍길동", 90);
		System.out.println(map.size());
		
		//객체 찾기
		System.out.println(map.get("홍길동"));
		System.out.println();
		
		//객체를 하나씩 처리
		
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println("키 : " + key);
			System.out.println("밸류 : " + value);
		}
		
		//객체 삭제 
		map.remove("홍길동");
		System.out.println(map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryInterator = entrySet.iterator();
		while(entryInterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryInterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("k 값 " + key);
			System.out.println("v 값" + value);
		}
		System.out.println();
		
		//객체 전체 삭제
		
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
	}

}
