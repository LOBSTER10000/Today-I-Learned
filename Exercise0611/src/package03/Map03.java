package package03;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Map03 {

	public static void main(String[] args) {
//		Map<String, Integer> map = new Hashtable<String, Integer>();
//		
//		map.put("Spring", 12);
//		map.put("summer", 123);
//		map.put("fall", 1234);
//		map.put("winter", 12345);
//		
//		Scanner scan = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
//			System.out.println("id");
//			String id = scan.nextLine();
//			
//			System.out.println("password");
//			int pass = scan.nextInt();
//			System.out.println();
//			
//			if(map.containsKey(id)) {
//				if(map.get(id).equals(pass)) {
//					System.out.println("�α��� �Ǿ����ϴ�");
//					break;
//				} else {
//					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
//				}
//			} else {
//				System.out.println("���̵� �������� �ʽ��ϴ�");
//			}
//		}
//		
//		map.clear();
//		System.out.println(map.size());
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> map2 = new HashMap<String, Integer>();
//		map2.put("Spring", 12);
//		map2.put("summer", 123);
//		map2.put("fall", 1234);
//		map2.put("winter", 12345);
//		
//		while(true) {
//			System.out.println("���̵� ��й�ȣ�� �Է��ϼ���");
//			System.out.println("id");
//			String id2 = scan.nextLine();
//			
//			System.out.println("pass");
//			int pass2 = scan.nextInt();
//			
//			if(map2.containsKey(id2)) {
//				if(map2.get(id2).equals(pass2)) {
//					System.out.println("�α����� �Ǽ̽��ϴ�");
//					break;
//				} else  {
//					System.out.println("��й�ȣ�� �ٸ��ϴ�");
//				}
//			} else {
//				System.out.println("���̵� �ٸ��ϴ�");
//			}
//		}
		
		map2.clear();
		
		map2.put("ȫ�浿", 2);
		map2.put("������", 30);
		map2.put("ȫ�浿", 2);
		
		Set<String> keysets = map2.keySet();
		Iterator<String> iterator2 = keysets.iterator();
		while(iterator2.hasNext()) {
			String keys = iterator2.next();
			int vlaues = map2.get(keys);
			System.out.println(keys + vlaues);
		}
		
		
		Set<Map.Entry<String, Integer>> set = map2.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
		while(iterator.hasNext()) {
			Entry<String, Integer> str = iterator.next();
			String str1 = str.getKey();
			int str2 = str.getValue();
			System.out.println(str1 + " " + str2);
			
		}
		
		System.out.println(map2.size());
	}

}
