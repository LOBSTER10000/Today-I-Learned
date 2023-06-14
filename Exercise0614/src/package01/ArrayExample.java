package package01;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayExample {

	public static void main(String[] args) {
		String[] array = {"È«","±è","¹Ú"};
		Stream<String> stream = Arrays.stream(array);
		stream.forEach(s->System.out.println(s));
		
		int[] array2 = {1,2,3,4,5,6};
		IntStream stream2 = Arrays.stream(array2);
		stream2.forEach(s->System.out.println(s));

	}

}
