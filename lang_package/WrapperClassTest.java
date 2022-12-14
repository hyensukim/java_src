package lang_package;

public class WrapperClassTest {
	//Wrapper 클래스의 대표 클래스 Integer class test
	public static void main(String[] args) {
		
		//언박싱 : Integer 객체가 int 기본자료형으로 자동 변환.(JDK 1.5 이후로 가능)
		Integer i1 = new Integer("100");
		int i2 = 200;
		int sum = i1 + i2; // i1.intValue(); 생략.
		System.out.println(sum);
		
		//오토박싱 : int 기본자료형이 Integer 클래스형으로 자동 변환.(JDK 1.5 이후로 가능)
		Integer i3 = sum; // Integer.valueOf(sum); 생략.
		System.out.println(i3);
	}

}
