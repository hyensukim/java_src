package day26;

import java.util.*;
import java.util.stream.*;

//reduce()
public class Ex04 {

	public static void main(String[] args) {
		
		int total = IntStream.rangeClosed(1,100).reduce(0, (a,b) ->{
			//합이 a에 계속 누적됨.
			System.out.println("a = "+a+", b = "+b);
			return a+b;
		});
		System.out.println(total);
		
		//count() 내부적으로 구현이 되어 있는 코드
		int[] nums = {0,1,2,3,4,5,6,7,8,9,10};
		int count = Arrays.stream(nums).reduce(0, (a,b) -> a+1);
		System.out.println(count);
		
		int min = Arrays.stream(nums).reduce(Integer.MAX_VALUE, (a,b)->a>b? b:a);
		System.out.println(min);
		int max = Arrays.stream(nums).reduce(Integer.MIN_VALUE, (a,b) -> a>b? a: b);
		
		int total2 = IntStream.rangeClosed(1, 100).reduce((a,b) -> a + b).getAsInt();
		System.out.println(total2);
	}

}
