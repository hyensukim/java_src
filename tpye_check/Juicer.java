package tpye_check;

public class Juicer {
	
	//와일드 카드와 <T> 지네릭 클래스의 차이점
	// 1. 와일드 카드는 static에서 사용 가능.
	// 2. 와일드 카드는 <? super T> 하한 제한 가능, T 상위 클래스만 사용이 가능.
	static void make(Box<? extends Fruit> box) {
		for(int i = 0; i < box.size();i++)
			System.out.println(box.get(i) + "쥬스");
	}
	
	//지네릭 메서드 형식
	static <T extends Fruit,E extends Fruit> void makeJuice(Box<T> box, Box<E> box2) {
		for(int i = 0; i < box.size();i++)
			System.out.println(box.get(i) + "쥬스");
		
		for(int j = 0; j < box2.size();j++)
			System.out.println(box2.get(j) + "쥬스");
		
		make(box);
	}
}
