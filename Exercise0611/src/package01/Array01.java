package package01;

import java.util.ArrayList;
import java.util.List;

public class Array01 {

	public static void main(String[] args) {
		//길이 10인 배열 생성
		List<String> list = new ArrayList<String>();
		
		list.add("홍길동");
		list.add(1, "감자바");
		String str = list.get(0);
		int size = list.size();
		System.out.println(str);
		System.out.println(size);
		
		for(int i = 0; i<list.size(); i++) {
			String str4 = list.get(i);
			System.out.print(str4);
		}
		
		for(String str5 : list) {
			System.out.println(str5);
		}
		
		list.remove(1);
		list.remove("홍길동");
		boolean str2 = list.isEmpty();
		boolean str3 = list.contains(1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
