package package01;

import java.util.stream.IntStream;

public class IntStreamExample {
	public static int sum;
	public static void main(String[] args) {
		
		IntStream stream = IntStream.rangeClosed(1, 10);
		
		stream.forEach(a -> sum +=a);
	
		System.out.println(sum);

		IntStream stream2 = IntStream.rangeClosed(1, 10);
		double avg = stream2.average().getAsDouble();
		System.out.println(avg);
	}

}
