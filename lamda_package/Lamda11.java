package lamda_package;
//메서드 및 생성자 참조

import java.util.function.*;

public class Lamda11 {

	public static void main(String[] args) {
		//메서드 참조
		Function<String,Integer> func = x -> Integer.parseInt(x);
		Function<String,Integer> func2 = Integer::parseInt;
		System.out.println(func.apply("1"));
		System.out.println(func2.apply("2"));
		
		//생성자 참조
		Supplier<Object> con = () -> new Object();
		Supplier<Object> con2 = Object::new;
		System.out.println(con.get());
		System.out.println(con2.get());
	}

}
