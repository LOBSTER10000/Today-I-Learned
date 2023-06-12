package package06;

public class Test {
	private String name;
	private String as;
	private int score;
	
	public Test(String name, String as, int score) {
		super();
		this.name = name;
		this.as = as;
		this.score = score;
	}
	
	public Test() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAs() {
		return as;
	}

	public void setAs(String as) {
		this.as = as;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
