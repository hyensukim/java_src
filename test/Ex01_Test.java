package test;

public class Ex01_Test {
	int num = 10;
	
	public void method() {
		System.out.println("실행");
	}
	
	public static void main(String[] args) {
		String str = new String("abc");
		System.out.println(str);
		
		Object obj = str;
		System.out.println(obj);
		
		Object obj2 = new Object();
		System.out.println(obj2);
				
	}
	
}
