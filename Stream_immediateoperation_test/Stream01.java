package Stream_immediateoperation_test;

import java.util.*;
import java.util.stream.*;

public class Stream01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("김");
		list.add("현");
		list.add("수");
		
		String[] arr = {"추","유","신"};
		
		//스트림 만들기
		//1. Collection -> Stream : Collection.stream()
		Stream<String> stream = list.stream();
		
		//2. Array -> Stream : Stream.of(T t)
		Stream<String> stream2 = Stream.of(arr);
		
		//3. Array -> Stream : Arrays.stream(T t)
		Stream<String> stream3 = Arrays.stream(arr);
		
		//기본형 스트림 만들기
//		IntStream intStream = Arrays.asList(int[]).stream(); -> 1번 방식으로는 못만듦
		int num = 1000;
		int[] intArr = {1,2,3};
		
		//1. IntStream.of(int[])
		IntStream.of(num).forEach(System.out::println);
		IntStream.of(intArr).forEach(System.out::println);
		System.out.println();
		
		//2. Arrays.stream(int[]) & Arrays.stream(int[], int incl, int Exclu)
		Arrays.stream(intArr).forEach(System.out::println);
		Arrays.stream(new int[] {1,2,2,3,4,5},0,3).forEach(System.out::println); // 지정범위의 스트림 생성
		System.out.println();

		//임의의 수 스트림 만들기
		new Random().ints(4).forEach(System.out::println);;
		
	}

}
