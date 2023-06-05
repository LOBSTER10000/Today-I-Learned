package again3;

public class ChildPair<K, V> extends Pair<K, V>{
	private K key;
	private V value;
	
	public ChildPair(K key, V value) {
		super(key, value);
		
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}
