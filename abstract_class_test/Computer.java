package abstract_class_test;

public abstract class Computer {
	//앞에서 구현한 Computer 클래스에서 turnOn()과 turnOff()의 구현은 하위 클래스에서 공유할 수 있지만
	//display()와 typing()의 구현 내용은 NoteBook인지 DeskTop인지에 따라 달라지므로 Computer 
	//클래스에서는 구현하지 않은 것입니다.
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("켜다");
	}
	
	public void turnOff() {
		System.out.println("끄다");
	}
}
