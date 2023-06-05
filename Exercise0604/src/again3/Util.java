package again3;
public class Util {
	
	public static <K, V> V getValue(Pair<K, V> pair1, K pair2) {
		if(pair1.getKey() == pair2) {
			return pair1.getValue();
		} else {
			return null;
		}
	}
}
