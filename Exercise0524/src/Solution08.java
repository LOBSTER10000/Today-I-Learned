import java.util.Scanner;

public class Solution08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int w = scan.nextInt();
		for(int i =0; i < n; i++) {
			System.out.print("*");
			if(i % w == w - 1) {
				System.out.println("");
			}
			if(n % w !=0) {
				System.out.println("");
			}
		}
	}

}
