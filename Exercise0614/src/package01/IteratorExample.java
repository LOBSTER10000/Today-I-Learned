package package01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;



public class IteratorExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("È«","½Å","±è");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}

		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
	}

}
