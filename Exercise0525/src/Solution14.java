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
			System.out.println("1. 학생수, 2.점수입력, 3.점수리스트, 4.분석, 5.종료");
			System.out.println("-----------");
			System.out.println("입력>");
			
			int selectNum = scan.nextInt();
			if(selectNum == 1) {
				System.out.println("학생수를 입력하세요");
				studentNum = scan.nextInt();
				scores = new int[studentNum];
			}
			if(selectNum ==2) {
				for(int i = 0; i < studentNum; i++) {
					System.out.println(i+1 +"번째 학생의 점수를 입력하세요");
					scores[i] = scan.nextInt();
				}
				
			}
			if(selectNum == 3) {
				for(int i = 0; i < studentNum; i++) {
					System.out.println(i+1 +"번째 학생의 점수 : " + scores[i] +"점");
				}
			}
			if(selectNum == 4) {
				for(int i = 0; i < studentNum; i++) {
					sum += scores[i];
				}
				System.out.println("합계 : " + sum);
				avg = (double) sum/studentNum;
				System.out.println("평균값 : " + avg);
			}
			if(selectNum == 5) {
				System.out.println("종료됩니다.");
				run = false;
			}
		}

	}

}
