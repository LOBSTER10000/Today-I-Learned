package backjoon;

import java.util.*;

public class Main3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] score = new int[n];
		
		
		for(int i =0; i<score.length; i++) {
			score[i] = scan.nextInt();
		}

		double maxScore = Integer.MIN_VALUE;
		for(int i =0; i<score.length; i++) {
			if(score[i] > maxScore) {
				maxScore = score[i];
			}
		}
		
		double sumScore = 0;
		double avgScore = 0;
		double[] modify = new double[n];
		for(int i = 0; i<score.length; i++) {
			modify[i] = score[i]*100/maxScore;
			
		}
		
		for(int i = 0; i<score.length; i++) {
			sumScore += modify[i];
		}
		
		avgScore = sumScore/score.length;
		System.out.println(avgScore);
	}

}
