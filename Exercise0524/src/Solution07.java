import java.util.Scanner;

public class Solution07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		n = scan.nextInt();
		for(int i =0; i <n; i++) {
			if(i % 2 == 0) {
				System.out.print("+");
			}
			else {
				System.out.print("-");
			}
		}
	}
}
