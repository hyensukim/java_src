package interface_test;

public class Calculator_Test {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(10, 10));
		System.out.println(cal.substract(20, 10));
		System.out.println(cal.times(10, 10));
		System.out.println(cal.divide(10, 10));
		cal.showInfo();
		
		// 하위클래스에서 별도 구현하지 않아도 기본제공되는 메서드
		String df = cal.def();
		System.out.println(df);
		
		//정적메서드 호출(객체 생성 없이 가능)
		String st = Calc.sta();
		System.out.println(st);
	}
}
