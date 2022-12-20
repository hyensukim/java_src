package abstract_class_test;

public class Desktop extends Computer{

	@Override
	public void display() {
		System.out.println("최고 화질");
		
	}

	@Override
	public void typing() {
		System.out.println("최고 성능");
		
	}

}
