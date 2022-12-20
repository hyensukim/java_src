package lang_package_test;

public class StringBuilderClassTest {
	//StringBuilder 클래스 테스트
	public static void main(String[] args) {
		String str1 = new String("나는");
		System.out.println(System.identityHashCode(str1));
		
		//String 객체를 StringBuilder 객체로 변환하는 생성자메서드.
		StringBuilder sb = new StringBuilder(str1);
		// capacity 100byte인 문자열 객체 생성. -> capacity : 버퍼메모리 용량
		StringBuilder sb2 = new StringBuilder(100); 
		System.out.println(System.identityHashCode(sb));
		
		//StringBuilder.append() 메서드 : 문자열을 기존문자열 뒤에 추가해준다.
		sb.append("배를");
		sb.append("타기 싫다");
		
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));// 연산후에도 주소값은 그대로이다.
	}

}
