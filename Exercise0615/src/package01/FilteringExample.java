package package01;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("��õ��");
		list.add("������");
		list.add("�̵���");
		list.add("�̵���");
		
		list.stream().distinct().forEach(s-> System.out.println(s));

		list.stream().filter(s->s.startsWith("��")).distinct().forEach(s-> System.out.println("���� : "+s));
		list.stream().filter(s->s.startsWith("��")).forEach(s->System.out.println(s));
		list.stream().sorted().forEach(s-> System.out.println(s));
	}

}
