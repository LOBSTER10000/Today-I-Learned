package package01;

import java.util.Arrays;

public class MatchExample {

	public static void main(String[] args) {
		int[] intArr = {2,4,6};
		
		boolean result = Arrays.stream(intArr).allMatch(s->s%2==0);
		System.out.println(result);
		
		boolean result2 = Arrays.stream(intArr).anyMatch(s->s%2==0);
		System.out.println(result2);
		
		boolean result3 = Arrays.stream(intArr).noneMatch(s->s%10==0);
		System.out.println(result3);

	}

}
