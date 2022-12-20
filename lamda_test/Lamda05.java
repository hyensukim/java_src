package lamda_test;

import java.util.function.*;

//매개변수가 두 개인 함수형 인터페이스
public class Lamda05 {

	public static void main(String[] args) {
		
		//BiConsumer<T,U> : 입력(매개변수) 2개, 출력(반환값) X
		//void accept(T t, U u) 메서드
		BiConsumer<Integer,Integer> bicon
		= (x,y) -> System.out.println(x+y);
		bicon.accept(10, 20);
		System.out.println();
		
		//BiFunction<T,U,R> : 입력(매개변수) 2개, 출력(반환값) O
		//R apply(T t, U u)
		BiFunction<Integer,Integer,Integer> bifunc
		= (x,y) -> x+y;
		int result1 = bifunc.apply(20, 30).intValue();
		System.out.println(result1);
		
		//*매개변수와 반환값이 같은 자료형인 경우, 사용하는 함수형 인터페이스
		// -> lamda_package.Lamda06 참조.
		
		//BiPredicate<T,U> : 입력(매개변수) 2개, 출력(반환값) boolean
		//boolean test(T t,U u)
		BiPredicate<String,String> bipre
		= (x,y) -> x == y;
		boolean result2 = bipre.test("감","김");
		System.out.println(result2);
		
	}

}
