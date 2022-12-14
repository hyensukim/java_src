package lamda_package;

public class Lamda01 {
	public static void main(String[] args) {
		//함수형 인터페이스 내 미구현 메서드를 람다식으로 구현하여 객체 생성
		Calculator cal = (x,y) -> x+y;
		
		//객체 메서드 사용
		int result = cal.add(10,20);
		System.out.println(result);
		
		Naming name = str -> System.out.println(str);
		name.getName("나는 몽구야 하이루");
		
	}
	
	
}
