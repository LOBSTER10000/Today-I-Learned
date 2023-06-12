package package06;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map02 {

	public static void main(String[] args) {
		Map<Test, String> map = new Hashtable<Test, String>();
		
		map.put(new Test("����Ÿ", "��", 95), "a����Դϴ�");
		map.put(new Test("ȫ�浿", "ȫ", 85), "b����Դϴ�");
		map.put(new Test("���걺", "��", 45), "f����Դϴ�");
		
		Set<Test> set = map.keySet();
		Iterator<Test> iterator = set.iterator();
		while(iterator.hasNext()) {
			Test test = iterator.next();
			String name = test.getName();
			String as = test.getAs();
			int score = test.getScore();
			String grade = map.get(test);
			System.out.println(name + " " + as + " " + score + " " + grade);
		}
		
		Set<Map.Entry<Test, String>> set2 = map.entrySet();
		Iterator<Map.Entry<Test, String>> iterator2 = set2.iterator();
		while(iterator2.hasNext()) {
			Entry<Test, String> entry = iterator2.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}

}
