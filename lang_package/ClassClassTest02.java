package lang_package;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassClassTest02 {
	//Class 클래스 객체로 Person 클래스 정보 확인하기.
	public static void main(String[] args) {
		Class c1 = Person.class;
		
		Constructor[] cons = c1.getConstructors();
		System.out.println("--------생성자--------");
		for(Constructor con : cons) {
			System.out.println(con);
		}
		
		Field[] fds = c1.getFields();
		System.out.println("");
		for(Field fd : fds) {
			System.out.println(fd);
		}
		
		Method[] mds = c1.getMethods();
		System.out.println("--------메서드-----------");
		for(Method md : mds) {
			System.out.println(md);
		}
		
	}

}
