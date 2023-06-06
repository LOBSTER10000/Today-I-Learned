package my01;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			for(int i =0; i<10; i++) {
				System.out.println(i);
			}
		};

		Thread thread = new Thread(runnable);
		thread.start();
	

	Consumer<String> consumer = (t) -> {System.out.println(t + "8");};
		consumer.accept("t-zone");
	
	BiConsumer<Integer, String> biConsumer = (t, u) -> System.out.println(t + u);
		biConsumer.accept(30, "meka");
		
	DoubleConsumer doubleConsumer = (t)	-> {System.out.println(t);};
		doubleConsumer.accept(8.5);
	
	ObjIntConsumer<String> objIntConsumer = (t, i) -> {System.out.println(t + i);};
		objIntConsumer.accept("¼±»ý", 50);
		
	
	}
}
