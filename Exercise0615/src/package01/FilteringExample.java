package package01;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이천수");
		list.add("감바자");
		list.add("이동국");
		list.add("이동국");
		
		list.stream().distinct().forEach(s-> System.out.println(s));

		list.stream().filter(s->s.startsWith("이")).distinct().forEach(s-> System.out.println("저먼 : "+s));
		list.stream().filter(s->s.startsWith("이")).forEach(s->System.out.println(s));
		list.stream().sorted().forEach(s-> System.out.println(s));
	}

}
