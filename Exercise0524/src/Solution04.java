import java.util.Scanner;

public class Solution04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min=0;
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		min = a;
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}

		System.out.println(min);
	}

}
