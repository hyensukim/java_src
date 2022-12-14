package abstract_class;

public class MyNotebook extends Notebook{
	// 추상메서드를 구현해야만 오류가 발생하지 않음.
	@Override
	public void typing() {
		System.out.println("고성능");
		
	}
}
