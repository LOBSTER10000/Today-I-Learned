package my01;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

public class LamdaExample2 {
	private static Student[] student = {
			new Student("È«±æµ¿", 95, 85),
			new Student("±èÀÚ¹Ù", 85, 65)
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
		System.out.println("¿µ¾î Æò±Õ Á¡¼ö " + englishAvg);
		
		double mathAvg = avg(Student::getMathScore);
		System.out.println("¼öÇÐ Æò±Õ Á¡¼ö" + mathAvg);
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

