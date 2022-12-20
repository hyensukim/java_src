package lamda_test;
//Function이 변형된 함수형 인터페이스
import java.util.function.*;

public class Lamda06 {

	public static void main(String[] args) {
		
		//UnaryOperator - 입력매개변수와 반환값이 같은 자료형.
		//Function<Integer> T apply(T t)
		UnaryOperator<Integer> uor = x -> x*100;
		int a = uor.apply(10);
		System.out.println(a);
		System.out.println("/");
		
		//BinaryOperator - 입력매개변수2개와 반환값이 같은 자료형.
		//Function<Integer> T apply(T t1, T t2)
		BinaryOperator<String> bor = (x,y) -> x+y;
		String str = bor.apply("안녕", "하세요");
		System.out.println(str);
		System.out.println("//");
		
	}

}
