package Stream_immediateoperation_test;

import java.util.*;
import java.util.stream.*;

public class Stream02 {

	public static void main(String[] args) {
		
		//중간연산01 - 자르기
		//skip(long n) : n 이후의 요소부터 출력(n번째 이하 요소 건너뛰기)
		Stream<Integer> stream1 = Arrays.stream(new Integer[] {1,2,3,4,5});
		stream1.skip(4).forEach(System.out::println);
		System.out.println("/ ");
		
		//limit(long maxSize) : maxSize 이하의 요소 갯수까지만 출력.
		IntStream intStream = new Random().ints();
		intStream.limit(4).forEach(System.out::println);
		System.out.println("// ");
		
		//중간연산02 - 스트림요소 걸러내기
		//filter(Predicate<? super T> predicate) : 조건을 람다식으로 표현, 조건에 맞지 않는 요소는 걸러냄.
		Stream<Integer> stream2 = Arrays.stream(new Integer[] {2,4,6,8,10,9});
		stream2.filter(s -> s%2 == 1).forEach(System.out::println);//홀수가 아니면 걸러
		System.out.println("/// ");
		
		//distinct() : 중복된 요소 제거
		Stream<String> stream3 = Arrays.stream(new String[]{"김","김","현","수"});
		stream3.distinct().forEach(System.out::println);
		System.out.println("//// ");
		
		//중간연산03 - 변환
		// map() : 스트림의 요소에서 저장된 값 중 원하는 필드만 뽑아내거나 특정형태로 변환해야 하는 경우에 사용
//		Stream<Integer> stream4 = Arrays.stream(new Integer[] {1,2,3,4,5,6});
//		stream4.map((s,n)->)
	}

}
