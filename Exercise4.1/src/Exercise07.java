import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
	   boolean run = true;
	   
	   int balance = 0;
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   while(run) {
		   System.out.println("--------------");
		   System.out.println("1. ���� | 2. ��� | 3. �ܰ�  | 4. ����");
		   System.out.println("--------------");
		   System.out.println("���� >");
		   int a = scanner.nextInt();
		   if(a == 1) {
			   int giveMoney = 0;
			   System.out.println("�Ա��� �ݾ��� �Է����ּ��� >");
			   giveMoney = scanner.nextInt();
			   balance += giveMoney;
			   System.out.println("�Ա��� �ݾ��� " + giveMoney +"���̸�, �� �ܾ���" + balance +"�Դϴ�.");
		   }
		  
		  if(a == 2) {
			  int deposit = 0;
			  System.out.println("����� �ݾ��� �������ּ��� >");
			  deposit = scanner.nextInt();
			  if(balance - deposit >= 0) {
				  balance -= deposit;
				  System.out.println("�Ա��� �ݾ��� " + deposit +"���̸�, �� �ܾ���" + balance +"�Դϴ�.");
			  } else {
				  System.out.println("��� �ݾ��� �ܾ׺��� �����ϴ�.");
			  }
		  }
		  
		  if(a == 3) {
			  System.out.println("���� ȸ������ �ܾ��� " + balance + "�� �Դϴ�.");
		  }
		  
		  if(a == 4) {
			  run = false;
		  }
		   
	   }
	    System.out.println("���α׷� ����");
	}

}
