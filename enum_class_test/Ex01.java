package enum_class_test;

public class Ex01 {

	public static void main(String[] args) {
		Direction[] dir = Direction.values();
		
		for(Direction d : dir ) {
			System.out.println("명칭 : "+d.getSymbol()+", 값 = "+d.getValue());
		}
		
		System.out.println();
		for(int i = 0; i < dir.length; i++) {
		Direction dir2 = Direction.of(i);
		System.out.println(dir2);
		}
		
		System.out.println();
		Direction dir3 = Direction.EAST.rotate(2);
		System.out.println(dir3);
		
		
	}

}
