import java.util.Scanner;

public class Solution05 {
		static Scanner scan = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int sum;
			if(a >= b) {
				System.out.println("a���� ū ���� �Է����ּ���");
				
			}
			else {
				sum = b -a ;
				System.out.println("b - a�� ���� " + sum + "�Դϴ�.");
				run = false;
			}
		}
		

	}

}
