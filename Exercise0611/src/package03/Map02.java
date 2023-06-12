package package03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map02 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(2, "ȫ�浿3"), 85);
		
		Set<Student> set = map.keySet();
		Iterator<Student> iterator = set.iterator();
		Student student = new Student();
		while(iterator.hasNext()) {
			Student key = iterator.next();
			Integer value = map.get(key);
			int key3 = key.getSno();
			String key2 = key.getName();
			System.out.println("�л���ȣ : " + key3 + " �̸� : " + key2 + " ���� :" + value);
		}
		System.out.println(map.size());
		
		map.clear();
		System.out.println(map.size());
		
		// entry set���� �غ���
		
		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(2, "ȫ�浿3"), 85);
		
		Set<Map.Entry<Student, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<Student, Integer>> iterator2 = entrySet.iterator();
		while(iterator2.hasNext()) {
			Map.Entry<Student, Integer> entry = iterator2.next();
			Student key = entry.getKey();
			String key1 = key.getName();
			int key2 = key.getSno();
			Integer value = entry.getValue();
			System.out.println("�̰� �³�?" + key1 + " " + key2);
			System.out.println("�̰� �³��ʹ� " + value);
		}

	}

}
