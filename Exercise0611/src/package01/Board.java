package package01;

public class Board {

	String string;
	String string2;
	String string3;

	public Board(String string, String string2, String string3) {
		this.string = string;
		this.string2 = string2;
		this.string3 = string3;
	}

	
	
	public Board() {
		super();
	}



	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public String getString2() {
		return string2;
	}

	public void setString2(String string2) {
		this.string2 = string2;
	}

	public String getString3() {
		return string3;
	}

	public void setString3(String string3) {
		this.string3 = string3;
	}
	
	
}
