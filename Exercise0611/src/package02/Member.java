package package02;

public class Member {
	private String name;
	private int age;
	
	
	
	public Member() {
		super();
	}
	
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.contentEquals(name) && (member.age==age);
		} else {
			return false;
		} // name값과 age값이 같으면 true를 리턴
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	} //string의 hashCode() 이용



	
}
