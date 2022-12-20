package interface_test;

public class Calculator implements Calc{
	// Calc 인터페이스 구현 클래스
	
	@Override
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	@Override
	public int substract(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	@Override
	public int times(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			int result = num1 / num2;
			return result;
		}else {
			return ERROR;
		}
	}
	
	public void showInfo() {
		System.out.println("계산기 구현 완료");
	}
//	@Override
//	public String def() {
//		String def = "하위클래스에서 재정의한 기본 메서드";
//		return def;
//	}
	
}
