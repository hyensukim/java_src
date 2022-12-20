package inner_class_test;

public class Outer2 {
	//외부클래스 변수
	int num1 = 10;
	static int num2 = 20;
	
	//외부클래스 메서드
	public Ai method() {
		int num3 = 30; // 지역 변수 -> 상수
		
		//LocalInner
		class LocalInner implements Ai{
			int num4 = 40;
			// 상속받은 인터페이스 내 추상메서드를 정의한다.
			public void LocalInnerMethod() {
				num4 =50;
				int result = num3 + num4;
				System.out.println(result);
			}
		}
		
		return new LocalInner();
	}
}
