package inner_class;

public class LocalInnerTest {

	public static void main(String[] args) {
		Outer2 out2 = new Outer2();
		Ai ai = out2.method();
		ai.LocalInnerMethod();
		
		Outer3 out3 = new Outer3();
		NoName no = out3.method();
		no.no(10);
	}

}
