package lang_package_test;

import java.util.Random;

public class UsefulClassTest {
	//lang 패키지 내 유용한 클래스들 test
	public static void main(String[] args) {
		//Math
		//Math 클래스 멤버변수 PI값 출력
		double pi = Math.PI;//static이라 객체생성없이 사용.
		System.out.println(pi);
		
		//Math 메서드 - ceil() 올림, floor() 내림,
		//round() 반올림
		double d1 = 4.5;
		
		System.out.println(Math.ceil(d1));
		System.out.println(Math.floor(d1));
		System.out.println(Math.round(d1));//정수형 반환
		
		d1 = -1.4;
		// abs() 절대값
		System.out.println(Math.abs(d1));
		
		// random() 난수(0~1 사이의 double 범위 내 무작위 실수)
		d1 = Math.random();
		System.out.println(d1);
		//0~9 사이 정수 출력
		System.out.println((int)(d1*10));
		
		//int 범위 내 무작위 수(난수)
		int randNum = new Random().nextInt();
		System.out.println(randNum);
		
	}

}
