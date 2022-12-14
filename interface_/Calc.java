package interface_;

public interface Calc {
	//계산기 설계 인터페이스
	
	// 인터페이스 내에서 선언한 변수는 컴파일 시 자동으로 상수로 바뀐다.
	double PI = 3.14;
	int ERROR = -9999999;
	
	// public abstract 구문 자동 입력
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// default 메서드
	default String def() {
		String def = "하위클래스에 제공되는 기본 메서드";
		System.out.println(pri());
		return def;
	}
	
	// static 메서드
	static String sta() {
		String sta = "정적 메서드";
		return sta;
	}
	
	private String pri() {
		String pri = "private 메서드";
		return pri;
	}
	
	
}
