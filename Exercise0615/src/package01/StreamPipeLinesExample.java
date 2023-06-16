package package01;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLinesExample {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				
				new Member("ȫ�浿", Member.MALE, 30),
				new Member("�質��", Member.FEMALE, 32),
				new Member("����", Member.MALE, 45),
				new Member("�ڼ���", Member.FEMALE, 28)
				);
		
		Stream<Member> stream = list.stream();
		Stream<Member> maleStream = stream.filter(s-> s.getSex()==Member.FEMALE);
		IntStream ageStream = maleStream.mapToInt(Member::getAge);
		OptionalDouble optionalDouble = ageStream.average();
		double avg= optionalDouble.getAsDouble();
		
		System.out.println(avg);
		
		double avg2 = list.stream().filter(s->s.getSex()==Member.MALE)
				.mapToInt(Member::getAge).average().getAsDouble();
		System.out.println(avg2);
	}
}
