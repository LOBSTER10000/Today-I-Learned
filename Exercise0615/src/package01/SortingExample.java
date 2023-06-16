package package01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {

	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {5,4,3,2,1});
		
		intStream.sorted().forEach(s->System.out.println(s));
		
		List<Student> list = Arrays.asList(
				
				new Student("ȫ�浿", 30),
				new Student("�ſ��", 20),
				new Student("���̼�", 40)
				);
		
		list.stream().sorted().forEach(s->System.out.println(s.getAge()));
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s.getAge()));

	}

}
