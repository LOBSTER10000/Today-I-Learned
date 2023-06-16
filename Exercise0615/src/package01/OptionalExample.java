package package01;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
//		double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
//		System.out.println(avg);
//		
//		System.out.println("���ܹ߻�");
		
		OptionalDouble avg = list.stream().mapToInt(Integer::intValue)
				.average();
		if(avg.isPresent()) {
			System.out.println("��� : " + avg.getAsDouble());
		}
		else {
			System.out.println("��� : 0.0 ");
		}
		
		double avg2 = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(avg2);
		
		list.stream().mapToInt(Integer::intValue).average().ifPresent(s->System.out.println("������ 0.0"));
	}

}
