package package02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set02 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		Member member = new Member();
		member.setName("ȫ�浿");
		String str2 = member.getName();
		System.out.println(str2);
		member.setAge(30);
		int int1 = member.getAge();
		System.out.println(int1);
		
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿2", 35));
		
		Iterator<Member> iterator = set.iterator();
		while(iterator.hasNext()) {
			Member members = iterator.next();
			String str3 = members.toString();
			System.out.println(str3);
		}
		
		
		System.out.println("�� ��ü�� : " + set.size() );

	}

}
