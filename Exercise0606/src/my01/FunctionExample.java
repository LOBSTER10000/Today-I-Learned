package my01;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample {
	private static List<Student> list = Arrays.asList(
			
				new Student("홍길동", 92, 96),
				new Student("백동수", 84, 99)
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
		System.out.println("영어 평균 점수" + englishtAvg);
		
		double mathAvg = avg(t->t.getMathScore());
		System.out.println("수학 평균 점수" + mathAvg);
		
		
		

	}

}
