package my01;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

public class LamdaExample2 {
	private static Student[] student = {
			new Student("ȫ�浿", 95, 85),
			new Student("���ڹ�", 85, 65)
	};
	
	public static double avg(ToIntFunction<Student> function) {
		double sum = 0;
		for(Student students : student) {
			sum += function.applyAsInt(students);
		}
		
		double avg = sum/ student.length;
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg( Student::getEnglishScore);
		System.out.println("���� ��� ���� " + englishAvg);
		
		double mathAvg = avg(Student::getMathScore);
		System.out.println("���� ��� ����" + mathAvg);
	}
		
		public static class Student{
			private String name;
			private int englishScore;
			private int mathScore;
			
			public Student(String name, int englishScore, int mathScore) {
				super();
				this.name = name;
				this.englishScore = englishScore;
				this.mathScore = mathScore;
			}

			public String getName() {
				return name;
			}

			public int getEnglishScore() {
				return englishScore;
			}

			public int getMathScore() {
				return mathScore;
			}
			
			
			
		}

	}

