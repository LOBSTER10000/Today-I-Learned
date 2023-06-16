package package01;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
				);
		
		list.stream().mapToInt(Student::getAge).forEach(s->System.out.println(s));
		int str = list.parallelStream().mapToInt(Student::getAge).sum();
		System.out.println(str);
		double avg = list.parallelStream().mapToInt(Student::getAge).average().getAsDouble();
		System.out.println(avg);

	}

}
