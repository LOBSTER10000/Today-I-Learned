import java.util.Scanner;

public class Solution14 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum =0 ;
		int[] scores = null;
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		while(run) {
			System.out.println("-----------");
			System.out.println("1. �л���, 2.�����Է�, 3.��������Ʈ, 4.�м�, 5.����");
			System.out.println("-----------");
			System.out.println("�Է�>");
			
			int selectNum = scan.nextInt();
			if(selectNum == 1) {
				System.out.println("�л����� �Է��ϼ���");
				studentNum = scan.nextInt();
				scores = new int[studentNum];
			}
			if(selectNum ==2) {
				for(int i = 0; i < studentNum; i++) {
					System.out.println(i+1 +"��° �л��� ������ �Է��ϼ���");
					scores[i] = scan.nextInt();
				}
				
			}
			if(selectNum == 3) {
				for(int i = 0; i < studentNum; i++) {
					System.out.println(i+1 +"��° �л��� ���� : " + scores[i] +"��");
				}
			}
			if(selectNum == 4) {
				for(int i = 0; i < studentNum; i++) {
					sum += scores[i];
				}
				System.out.println("�հ� : " + sum);
				avg = (double) sum/studentNum;
				System.out.println("��հ� : " + avg);
			}
			if(selectNum == 5) {
				System.out.println("����˴ϴ�.");
				run = false;
			}
		}

	}

}
