package package01;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream2Example {

	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("감자바", 26)
				);
		
		double avg = list.stream()
				.mapToInt(Member::getAge).average().getAsDouble();
		
				
	}
	
		static class Member{
			private String name;
			private int age;
			
			public Member(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}
			public String getName() {
				return name;
			}
			public int getAge() {
				return age;
			}
			 
			
		}

	}


