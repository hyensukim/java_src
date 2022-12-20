package lang_package_test;

public class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name, int age) {
//		super(); -> 컴파일러에 의해 자동 입력되므로 생략 가능
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
