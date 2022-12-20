package lang_package_test;

public class StringClassTest {
	// String class test - 문자열 불변 및 결합메서드 사용
	public static void main(String[] args) {
		String str = new String("java");
		String str2 = new String("android");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));
		
		str = str.concat(str2);
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		//모든 String 객체의 주소값이 다르다.
		
	}

}
