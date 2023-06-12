package package04;

public class Student {

	private String name;
	private int score;
	private int studentNum;
	
	
	public Student(String name, int score, int studentNum) {
		super();
		this.name = name;
		this.score = score;
		this.studentNum = studentNum;
	}


	public Student() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public int getStudentNum() {
		return studentNum;
	}


	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	
	
}
