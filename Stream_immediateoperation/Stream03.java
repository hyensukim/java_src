package Stream_immediateoperation;
//스트림 중간연산 예제02

import java.util.*;
import java.util.stream.*;


public class Stream03 {

	public static void main(String[] args) {
		Student[] students = {
				new Student("학생1",1,100), 
				new Student("학생2",2,150), 
				new Student("학생3",2,120), 
				new Student("학생4",3,200), 
				new Student("학생5",1,190), 
				new Student("학생6",3,110), 
				new Student("학생7",1,300), 
				new Student("학생8",2,170), 
				new Student("학생9",3,230), 
				new Student("학생10",1,290), 
		};
		//중간연산03 -정렬
		//Stream<T> sorted(), Stream<T> sorted(Comparator<? super T> comparator)
		// - Comparator를 지정하지 않으면 스트림 요소의 기본 정렬 기준으로 정렬한다. 단, 스트림의 요소가
		//   Comparable 인터페이스를 구현하지 않은 클래스이면, 예외가 발생한다.
		// - Student가 Comparable을 구현해야 sorted() 사용이 가능하다.
		
		Stream<Student> stream1 = Arrays.stream(students).sorted();
		stream1.forEach(System.out::println);// compareTo() 를 오름차순으로 반환.
		
		//중간연산04 -변환
		//Stream<R> map(Function<? super T, ? extends R> mapper)
		// - 스트림 요소에서 저장된 값들 중에 원하는 멤버변수만 뽑아내거나 특정 형태로 변환해야 하는 경우사용.
		Stream<Student> stream2 = Arrays.stream(students);
								stream2.map(Student::getScore)
									.sorted()
									.forEach(x -> System.out.println(x));
		System.out.println();
		//중간연산05 -조회
		// Stream<T> peek​(Consumer<? super T> action)
		//forEach와는 다르게 Stream을 반환하고 스트림 내부요소들을 소모하지 않는다.
		Stream<Student> stream3 = Arrays.stream(students);
		stream3.peek(System.out::println);
		
		//중간연산06 - mapToInt(), mapToDouble, mapToLong : 스트림 -> 기본스트림
		//map()은 연산 결과로 Stream 타입을 반환하지만, 기본자료형인 int,double,long을 기본스트림으로 반환해준다.
		IntStream stream4 = Arrays.stream(students).mapToInt(Student::getScore);
		int allScore = stream4.sum();
		System.out.println(allScore);
		
		//기본 스트림 내 연산관련 편리한 메서드 제공
		// - int sum() : 스트림의 모든 요소의 총합
		// - OptionalDouble average() : 스트림 요소의 평균
		// - OptionalInt max() : 요소의 최대값.
		// - OptionalInt min() : 요소의 최소값.
		// - IntSummaryStatistics summaryStatistics() : 스트림의 통계 요약 정보1
		
		
		
		
		
		
		
	}

}
