package package01;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("ȫ�浿", 10),
				new Student("�ſ��", 20),
				new Student("���̼�", 30)
				);
		
		list.stream().mapToInt(Student::getAge).forEach(s->System.out.println(s));
		int str = list.parallelStream().mapToInt(Student::getAge).sum();
		System.out.println(str);
		double avg = list.parallelStream().mapToInt(Student::getAge).average().getAsDouble();
		System.out.println(avg);

	}

}
