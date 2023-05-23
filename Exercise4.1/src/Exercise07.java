import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
	   boolean run = true;
	   
	   int balance = 0;
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   while(run) {
		   System.out.println("--------------");
		   System.out.println("1. 예금 | 2. 출금 | 3. 잔고  | 4. 종료");
		   System.out.println("--------------");
		   System.out.println("선택 >");
		   int a = scanner.nextInt();
		   if(a == 1) {
			   int giveMoney = 0;
			   System.out.println("입급할 금액을 입력해주세요 >");
			   giveMoney = scanner.nextInt();
			   balance += giveMoney;
			   System.out.println("입금한 금액은 " + giveMoney +"원이며, 총 잔액은" + balance +"입니다.");
		   }
		  
		  if(a == 2) {
			  int deposit = 0;
			  System.out.println("출금할 금액을 선택해주세요 >");
			  deposit = scanner.nextInt();
			  if(balance - deposit >= 0) {
				  balance -= deposit;
				  System.out.println("입금한 금액은 " + deposit +"원이며, 총 잔액은" + balance +"입니다.");
			  } else {
				  System.out.println("출금 금액이 잔액보다 많습니다.");
			  }
		  }
		  
		  if(a == 3) {
			  System.out.println("현재 회원님의 잔액은 " + balance + "원 입니다.");
		  }
		  
		  if(a == 4) {
			  run = false;
		  }
		   
	   }
	    System.out.println("프로그램 종료");
	}

}
