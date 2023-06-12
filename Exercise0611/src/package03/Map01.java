package package03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {
		//map�÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//��ü ����
		
		map.put("�ſ��", 85);
		map.put("���ڹ�", 95);
		map.put("���屺", 80);
		map.put("ȫ�浿", 90);
		System.out.println(map.size());
		
		//��ü ã��
		System.out.println(map.get("ȫ�浿"));
		System.out.println();
		
		//��ü�� �ϳ��� ó��
		
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println("Ű : " + key);
			System.out.println("��� : " + value);
		}
		
		//��ü ���� 
		map.remove("ȫ�浿");
		System.out.println(map.size());
		
		//��ü�� �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryInterator = entrySet.iterator();
		while(entryInterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryInterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("k �� " + key);
			System.out.println("v ��" + value);
		}
		System.out.println();
		
		//��ü ��ü ����
		
		map.clear();
		System.out.println("�� Entry ��: " + map.size());
	}

}
