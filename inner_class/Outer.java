package inner_class;

public class Outer {
	
	int num1 = 10;
	static int num2 = 40;
	
	public Outer() {
		System.out.println("Outer 객체 생성");
	}
	
	//Instance Inner
	class InstanceInner{
		int num3 = 20;
		static int num4 = 30;
		
		public InstanceInner(){
			System.out.println("InstanceInner 객체 생성");
		}
		
		static void method() {
			//정적 변수만 사용 가능
			num2 = 10;
//			num3 =20;
			num4 = 30;
		}
		
		void method2() {
			//모든 변수 사용 가능
			num1 = 0;
			num2 = 10;
			num3 = 20;
			num4 = 30;
		}		
	}
	
	//Static Inner
	static class StaticInner{
		int num5 = 50;
		static int num6 = 60;
		
		void method() {
//			num1 = 10; -> Outerclass의 인스턴스 변수는 StaticInner에서 사용 불가.
			num2 = 20;
			num5 = 50;
			num6 = 60;
		}
		
		static void method2() {
			//정적요소만 사용 가능
			num2 = 20;
			num6 =30;
		}
		
		
	}
	
}
