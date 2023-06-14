package package01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("È«", 67));
		list.add(new Student("±è", 90));
		list.add(new Student("ÀÌ", 99));
		
		double avg = list.stream().mapToInt(Student::getScore).average().getAsDouble();
		System.out.println(avg);
		
		int sum = list.stream().mapToInt(Student::getScore).sum();
		System.out.println(sum);
		
		Stream<Student> stream = list.stream();
		stream.forEach(s->{
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + " " + score);
		});

	}

}
