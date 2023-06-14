package backjoon;

import java.util.*;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];
		
		for(int i =0; i<array.length; i++) {
			array[i] = scan.nextInt();
		}
		
		for(int i =0; i< array.length - 1; i++) {
			for(int j= i+1; j<array.length; j++) {
				if(array[i] > array[j]) {
					int arr = array[i];
					array[i] = array[j];
					array[j] = arr;
				}
			}
		}
		
		for(int val : array) {
			System.out.println(val);
		}
		
	}

}
