package lamda_package;

import java.util.function.*;

// java.util.function package
public class Lamda04 {

	public static void main(String[] args) {
		
		//Supplier : 입력(매개변수) X, 출력(반환값) O
		// T get() 메서드
		//Supplier 객체 생성, 내부 메서드 구현.
		Supplier<String> sup = () -> "hi";
		//메서드를 호출해야 반환값 호출 가능.
		System.out.println(sup.get());
		//==
		Supplier<String> sup2 = new Supplier<>() {
			public String get() {
				return "hi";
			}
		};
		System.out.println(sup2.get());
		System.out.println();
		
		//Consumer : 입력(매개변수) O, 출력(반환값) X
		//매개변수 입력하자마자 소모해야 한다.(return이 안되므로)
		//accept(T t) 메서드
		Consumer<Integer> con 
		= (Integer a) -> System.out.println(a);
		con.accept(10);
		con.accept(100);
		System.out.println();
		
		//Function : 입력(매개변수) O, 출력(반환값) O
		//R apply(T t) 메서드
		//Function<입력 자료형, 반환형 자료형> 참조 변수
		// = 입력값 -> 반환값;
		Function<Integer,String> func2
		= x -> String.valueOf(x);
		String result2 = func2.apply(65);
		System.out.println(result2);
		
		Function<Integer,Integer> func 
		=x -> x+10;
		int result = func.apply(100);
		System.out.println(result);
		System.out.println();
		
		//Predicate : 입력(매개변수) O, 출력(반환값) boolean
		//boolean test(T t) 메서드
		Predicate<Integer> predicate = x -> x>100;
		boolean result3 = predicate.test(200);
		System.out.println(result3);
		
		Predicate<String> predicate2 = x -> x=="사과";
		boolean result4 = predicate2.test("배");
		if(!result4) {
			System.out.println("논리값은? " + result4);
		}

	}

}
