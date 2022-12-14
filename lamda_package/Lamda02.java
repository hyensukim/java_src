package lamda_package;
// 람다식 예제 - 함수형 인터페이스 타입을 매개변수로 받는 메서드 호출
public class Lamda02 {

	public static void main(String[] args) {
		add02((x,y) -> x+y);
		add02((x,y)->x-y);
	}
	// 여기서 Calculator cal을 매개변수로 받고 add() 메서드를 호출할 수 있는 이유?
	public static void add02(Calculator cal) {
		int result = cal.add(40, 30);
		System.out.println(result);
	}
	
	
}