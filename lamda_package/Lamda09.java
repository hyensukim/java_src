package lamda_package;
//Function의 합성
//두 람다식을 합성하여 새로운 람다식을 만들 수 있다.

import java.util.function.*;

public class Lamda09 {

	public static void main(String[] args) {
		//f.andthen(g) : 함수 f를 먼저 적용한 다음 g를 적용.
		// apply(x) -> f 함수의 입력값으로 들어감.
		//함수 f 반환값과 g 함수 입력 매개변수 자료형이 같아야 함.
		Function<String,String> f = x -> x+"하세요";// x하세요.
		Function<String,String> g = y -> y+" 만나서 반가워요	";// y 만나서 반가워요
		Function<String,String> fg = f.andThen(g);// x하세요 만나서 반가워요
		System.out.println(fg.apply("안녕"));//안녕하세요 만나서 반가워요
		
		//f.compose(g) : 함수 g를 먼저 적용하고 f를 적용한다.
		// apply(y) -> g 함수의 입력값으로 들어감.
		Function<String,String> gf = f.compose(g);
		System.out.println(gf.apply("**씨 "));
		
		//Function.identity() : 함수를 적용하기 이전과 동일한 항등함수
		// x -> x, 입력값 그대로 출력.
//		Function<String, String> hi = x -> x;
		Function<String, String> hi = Function.identity();
		System.out.println(hi.apply("안녕"));

	}

}
