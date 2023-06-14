package package01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("È«", 90),
				new Student("±è", 85),
				new Student("¹Ú", 95)
				);
		
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			 String name = s.getName();
			 int score = s.getScore();
			 System.out.println(name + " " + score);
		});

		double avg = list.stream().mapToInt(Student::getScore).average().getAsDouble();
		System.out.println(avg);
	}

}
