package package04;

import java.util.ArrayList;
import java.util.List;

public class Array02 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		for(int i =0; i<10; i++) {
			Student student = new Student();
			student.setName("ȫ�浿"+i);
			student.setScore(85+i);
			student.setStudentNum(i);
			list.add(student);
		}
		
		for(Student str : list) {

		  String name = str.getName();
		  int score = str.getScore();
		  int SNum = str.getStudentNum();
		  System.out.println(name + " " + score + " " + SNum);
		}

	}

}
