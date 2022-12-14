package inner_class;

public class Outer3 {
	public NoName method() {
		int num2 = 30;//상수
		//익명 내부 클래스 -> 인터페이스 객체 생성 시 지역 내부 환경에서 메서드를 정의하여 객체를 생성해준다.
		return new NoName() {
			@Override
			public void no(int num1) {
//				num2 = 30;
				int result = num1 + num2;
				System.out.println(result);
			}
		};
	}
}
