package package01;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		System.out.println("peek를 마지막에 호출");
		
	   Arrays.stream(intArr).filter(s->s%2==0).forEach(s->System.out.println(s));
	   
//	   Arrays.stream(intArr).filter(s->s%2==0).peek(s->System.out.println(s));
	   
	   int total = Arrays.stream(intArr).filter(s->s%2==0).peek(s->System.out.println()).sum();
	   System.out.println(total);
	   
	   

	}

}
