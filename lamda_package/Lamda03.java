package lamda_package;
//람다식 예제03 - 함수형 인터페이스 타입을 반환형으로 갖는 메서드 호출.
public class Lamda03 {

	public static void main(String[] args) {
		System.out.println(add03().add(10, 20));
		System.out.println(subtract().add(40, 30));
	}
	
	public static Calculator add03() {
		return (x,y) -> x+y;
	}
	
	public static Calculator subtract() {
		return (x,y) -> x-y;
	}
	
}
