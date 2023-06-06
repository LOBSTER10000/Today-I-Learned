package my01;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample {
	private static List<Student> list = Arrays.asList(
			
				new Student("ȫ�浿", 92, 96),
				new Student("�鵿��", 84, 99)
			);
	
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	
	
	public static void main(String[] args) {
		double englishtAvg = avg(s->s.getEnglishScore());
		System.out.println("���� ��� ����" + englishtAvg);
		
		double mathAvg = avg(t->t.getMathScore());
		System.out.println("���� ��� ����" + mathAvg);
		
		
		

	}

}
