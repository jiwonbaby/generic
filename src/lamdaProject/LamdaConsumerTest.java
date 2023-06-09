package lamdaProject;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class LamdaConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> c1 = (name) -> System.out.println(name);
		c1.accept("jennie");
		
		BiConsumer<String, String> c2 = (fname, lname) -> System.out.println(fname + lname);
		c2.accept("kim", "jennie");
	}

}
