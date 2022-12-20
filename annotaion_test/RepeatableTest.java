package annotaion_test;

import java.util.Arrays;

@ToDo("자바 공부")
@ToDo("공부 하자")
@ToDo("공부를 하자자하")
public class RepeatableTest {

	public static void main(String[] args) {
		Class<RepeatableTest> cls = RepeatableTest.class;
		ToDos ds = cls.getAnnotation(ToDos.class);
		for(ToDo d : ds.value()) {
			System.out.println(d.value());
		}
	}

}
