package tpye_check;

public class test01 {

	public static void main(String[] args) {
		//Box 내 과일 담는 코딩
		Box<Fruit> fruitbox = new Box<>(); // Fruit 타입을 담는 Box
		Box<Apple> applebox = new Box<>();// Apple 타입을 담는 Box
		Box<Grape> grapebox = new Box<>();// Grape 타입을 담는 
		//Box<Object> obj = new Box<>(); // extends Fruit에 의해 오류 발생 -> Fruit 하위 클래스만 지정타입 가능
		
		applebox.add(new Apple());
		grapebox.add(new Grape());
		fruitbox.add(new Apple());
		fruitbox.add(new Grape());
		System.out.println(fruitbox);
		System.out.println(applebox);
		System.out.println(grapebox);
		
		System.out.println();
		//과일 담은 Box로 쥬스 만드는 코딩
		Juicer.make(fruitbox); // 와일드 카드 사용한 메서드
		System.out.println();
		Juicer.makeJuice(fruitbox,fruitbox); // 지네릭 메서드
	}

}
