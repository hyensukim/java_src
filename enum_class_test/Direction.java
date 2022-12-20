package enum_class_test;

public enum Direction {// 추상 클래스
	
	//내부에 객체 생성(상수) -> 객체 내부에 값을 가지고 있음(int value, String symbol)
		EAST(0, "동"), SOUTH(1, "남"), WEST(2, "서"), NORTH(3, "북");
		
	//멤버 변수(상수)
	private static final Direction[] DIR_ARR = Direction.values();
	private final int value;
	private final String symbol;
	
	//생성자
	Direction(int value, String symbol) { // 접근 제어자 private이 생략됨
		this.value = value;
		this.symbol = symbol;
	}
	
	public int getValue() { return value; }
	public String getSymbol() { return symbol; }
	
	//int 값을 통해 방향을 찾는 메서드
	public static Direction of(int dir) {
		if (dir < 0 || dir > 3) {
			throw new IllegalArgumentException("Invalid value : " + dir);
		}
			
		return DIR_ARR[dir];
	}
		
	// 방향을 회전시키는 메서드. num의 값만큼 90도씩 시계방향으로 회전한다.
	public Direction rotate(int num) {
		//모든 수를 0~3 한정.
		System.out.println("방향은 1증감 마다 90도씩 바뀐다.");
		num = num % 4;
		
		//num이 음수 인 경우
		if (num < 0) num += 4; // num이 음수일 때는 시계반대 방향으로 회전
			
		//num이 양수 인 경우
		return DIR_ARR[(value + num) % 4];
	}
	
	// 객체(상수) 내부 값을 반환해주는 메서드
	public String toString() {
		return name() + getSymbol();
	}
}

//public class EnumEx2 {
//	public static void main(String[] args) {
//		for(Direction d : Direction.values()) {
//			System.out.printf("%s=%d%n", d.name(), d.getValue());
//		}
//		
//		Direction d1 = Direction.EAST;
//		Direction d2 = Direction.of(1);
//		
//		System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
//		System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
//		
//		System.out.println(Direction.EAST.rotate(1));
//		System.out.println(Direction.EAST.rotate(2));
//		System.out.println(Direction.EAST.rotate(-1));
//		System.out.println(Direction.EAST.rotate(-2));
//		
//	}
//}
//
//실행결과
//EAST=1
//SOUTH=2
//WEST=3
//NORTH=3
//d1=EAST, 1
//d2=EAST, 1
//SOUTHV
//WEST<
//NORTH^
//WEST<