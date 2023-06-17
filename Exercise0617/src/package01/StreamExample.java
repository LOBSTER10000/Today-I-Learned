package package01;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("this is a java book","Lambda Expressions", "Java8 supports lamda expressions");
		list.stream().filter(s->s.toLowerCase().contains("java")).forEach(s->System.out.println(s));

	}

}
