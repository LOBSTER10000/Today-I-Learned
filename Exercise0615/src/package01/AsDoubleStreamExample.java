package package01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamExample {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(array);
		intStream.asDoubleStream().forEach(s->System.out.println(s));
		
		intStream = Arrays.stream(array);
		intStream.boxed().forEach(s->System.out.println(s.intValue()));

	}

}
