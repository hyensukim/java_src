package time_package_test;

import java.time.*;
public class Ex01 {
	//java.time 패키지 클래스
	public static void main(String[] args) {
		//java.time 패키지 - LocalDate 생성자는 월을 그대로 입력해도 
		//출력하고자 하는 월로 나온다.(Calendar 생성자와 차이점)
		//또한, Calendar 객체의 경우, set() 메서드로 일일이 바꿔줘야
		//하는 반면에, LocalDate 클래스는 생성 시 생성자 파라미터 값으로
		//값을 초기화한뒤 생성된다.
		
		//LocalDate class
		//of() 메서드 -> 생성자 파라미터값으로 초기화 후 날짜 객체생성.
		LocalDate date1 = LocalDate.of(2022, 11, 20);
		System.out.println(date1);
		
		//now() 메서드 -> 시스템 상 현재 시각에 맞는 날짜로 객체생성.
		LocalDate date2 = LocalDate.now();
		System.out.println(date2);
		
		//LocalTime class
		LocalTime time1 = LocalTime.of(20, 45, 30);
		System.out.println(time1);
		
		LocalTime time2 = LocalTime.now();
		System.out.println(time2);
		
		//LocalDateTime class
		//ISO 기준, 날짜와 시간 표준 표기법
		LocalDateTime ldt1 = LocalDateTime.now();
		System.out.println(ldt1);
		
		LocalDateTime ldt2 = date2.atTime(time2);
		System.out.println(ldt2);
		
		LocalDateTime ldt3 = time2.atDate(date2);
		System.out.println(ldt3);
		
		LocalDateTime ldt4 = LocalDateTime.of(date2,time2);
		System.out.println(ldt4);
		
	}
}
