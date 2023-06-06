package my01;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] score = {92, 85, 92};
	
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = score[0];
		for(int scores : score) {
			result = operator.applyAsInt(result, scores);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int max = maxOrMin(
				(a,b)-> {
					if(a>=b) return a;
					else return b;
				}
				);
		System.out.println("최대값" + max);
		
		int min = maxOrMin(
				(a,b)-> {
					if(a<=b) return a;
					else return b;
				}
				);
		
		System.out.println("최소값" + min);
				

	}

}
