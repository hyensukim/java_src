package lamda_package;
//Predicate의 결합

import java.util.function.*;

public class Lamda10 {

	public static void main(String[] args) {
		//조건식을 합지는 것과 같다고 생각.
		//&&(and),||(or),!(not)과 같음.
		//p.negate() = !p와 같음.
		Predicate<Integer> p = x -> x < 100;
		Predicate<Integer> q = y -> y < 200;
		Predicate<Integer> r = z -> z%2 == 0;
		Predicate<Integer> notP = p.negate();// notP >= 100 : true
		
		Predicate<Integer> all = notP.and(q.or(p));
		boolean answer = all.test(190);
		System.out.println(answer);
		
		//isEqual():두 대상을 비교하는 Predicate를 만들때 사용
		String str1 = "ABC";
		String str2 = "ABC";
		
		Predicate<String> isequal = Predicate.isEqual(str1);
		boolean result = isequal.test(str2);
		System.out.println(result);
		
		
	}

}
