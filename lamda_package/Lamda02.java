package lamda_package;
// 람다식 예제 - 함수형 인터페이스 타입을 매개변수로 받는 메서드 호출
public class Lamda02 {

	public static void main(String[] args) {
		add02((x,y) -> x+y);
		add02((x,y) -> x-y);
		
		int result = add03((x,y)->x+y);
		System.out.println(result);
	}
	// 여기서 Calculator cal을 매개변수로 받고 add() 메서드를 호출할 수 있는 이유?
	//위에서 함수형 인터페이스를 람다식으로 구현할 것을 감지하여 호출이 가능한 것이다.
	public static void add02(Calculator cal) {
		int result = cal.add(40, 30);
		System.out.println(result);
	}
	
	
	public static int add03(Calculator cal) {
		return cal.add(20, 30);
		}
	
}
