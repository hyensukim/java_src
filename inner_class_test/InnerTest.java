package inner_class_test;

public class InnerTest {

	public static void main(String[] args) {
		Outer ic = new Outer();
		Outer.InstanceInner in = ic.new InstanceInner();
		System.out.println(in);
		
		
	}

}
