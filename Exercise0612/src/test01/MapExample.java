package test01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = Integer.MIN_VALUE ;
		int totalScore = 0;
		int minScore = Integer.MAX_VALUE;
		
		
		
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		for(int i = 0; i < map.size(); i++) {
			String str = iterator.next();
			int value = map.get(str);
			totalScore += value;
			if(value > maxScore) {
				maxScore = value;
				name = str;
			}
			if(value < minScore) {
				minScore = value;
				
			}
		}
		int avgScore = totalScore/map.size();
		System.out.println("평균점수 : " + avgScore);
		System.out.println("가장 높은 점수 :" + maxScore);
		System.out.println("가장 높은 키값 :" + name);
		System.out.println("가장 작은 점수 :" + minScore);
	}

}
