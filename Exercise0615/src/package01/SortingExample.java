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
				
				new Student("홍길동", 30),
				new Student("신용권", 20),
				new Student("유미선", 40)
				);
		
		list.stream().sorted().forEach(s->System.out.println(s.getAge()));
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s.getAge()));

	}

}
