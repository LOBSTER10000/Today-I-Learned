package package01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet02 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("decription");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("bass");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		System.out.println("사이의 단어 찾기");
		NavigableSet<String> navi = treeSet.subSet("a", true, "d", true);
		for(String str : navi) {
			System.out.println(str);
		}

	}

}
