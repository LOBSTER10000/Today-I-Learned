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
				System.out.println("a보다 큰 값을 입력해주세요");
				
			}
			else {
				sum = b -a ;
				System.out.println("b - a의 값은 " + sum + "입니다.");
				run = false;
			}
		}
		

	}

}
