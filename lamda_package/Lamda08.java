package lamda_package;
// 기본형을 사용하는 함수형 인터페이스
// - 래퍼클래스와 기본형을 사용하게 되면, 언박식&오토박싱이 발생
//   하여 성능이 떨어져 비효율성을 띄게된다.
// - 이러한 것을 방지하기 위해 기본형을 사용하는 함수형 인터페이스를 제공한다.

import java.util.function.*;

public class Lamda08 {

	public static void main(String[] args) {
		// A/TO/B/Function은 읿력이 'A' 출력이 'B' 타입이다.
		DoubleToIntFunction atbf = x -> (int)(x+10);
		System.out.println(atbf.applyAsInt(10));
		
		// To/B/Function은 출력 타입이 B 타입이다, 입력은 지네릭.
		ToIntFunction<String> tbf = x -> x.hashCode();
		System.out.println(tbf.applyAsInt("A"));
		
		// A/Function은 입력이 A 타입이고 출력은 지네릭 타입이다.
		IntFunction<Integer> af = x -> x+100;
		Integer i = af.apply(20);
		System.out.println(i);
		
		//Obj/A/Function은 입력이 T,A 타입이고 출력은 없다.
		// 질문 -> Obj 타입이 Integer인 경우, 언박싱이 발생하는지..
		ObjIntConsumer<String> oic = (x,y) -> System.out.println(x+y);
		oic.accept("10", 10);
		
	}

}
