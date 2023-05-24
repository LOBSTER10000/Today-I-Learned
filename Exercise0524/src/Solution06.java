import java.util.Scanner;

public class Solution06 {

	public static void main(String[] args) {
		
	   Scanner scan = new Scanner(System.in);
	   
	   int no = 0;
	   no = scan.nextInt();
	       System.out.println(no);
	       int i;
		   for(i = 0; no > 0; i++) {
			   no = no/10;
			   
		
			   System.out.println("no값"+ no + " 자리값 : " + i);
		   }
		   System.out.println("자리수는 " + i);
	   
	
		
	}
}
