package package01;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class AggreExample {

	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1,2,3,4,5}).filter(s->s%2==0).count();
		System.out.println(count);

		long sum = Arrays.stream(new int[] {1,2,3,4,5}).sum();
		System.out.println(sum);
		
		OptionalDouble avg1 = Arrays.stream(new int[] {1,2,3,4,5}).filter(s->s%2==0).average();
		double avg = avg1.getAsDouble();
		System.out.println(avg);
		
		int max = Arrays.stream(new int[] {1,2,3,4,5}).filter(s->s%2==0).max().getAsInt();
		System.out.println(max);
		
		int min = Arrays.stream(new int[] {1,2,3,4,5}).min().getAsInt();
		System.out.println(min);
		
		List<Integer> first = Arrays.asList(1,2,3,4,5);
		int str = first.stream().filter(s->s%3==0).findFirst().get();
		System.out.println(str);
	}

}
