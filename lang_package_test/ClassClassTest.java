package lang_package_test;

public class ClassClassTest {
	//Class 클래스 정보 가져오는 방법 3가지
	public static void main(String[] args)throws ClassNotFoundException {
		//방법1 - Object.getClass() 메서드 사용
		Person p1 = new Person("현수",27);
		//getClass() 메서드 반환형이 Class type이다.
		Class c1 = p1.getClass();
		System.out.println(c1.getName());// class의 full name : lang_package.Person(패키지명.클래스명)
		
		//방법2 - 클래스명으로 직접호출.
		Class c2 = Person.class;
		System.out.println(c2.getName());
		
		//방법3 - 동적로딩, forName() 메서드 사용
		Class c3 = Class.forName("lang_package.Person");
		System.out.println(c3.getName());
	}

}
