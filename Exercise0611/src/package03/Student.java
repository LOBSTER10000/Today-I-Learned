package package03;

public class Student {
	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	public Student() {
		super();
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno==student.sno) && (name.equals(student.name));
		} else {
			return false;
		} // 학번과 이름이 동일할 경우 true를 리턴
	}
	
	public int hashCode() {
		return sno + name.hashCode();
	}
}
