package day26;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Ex05 {

	public static void main(String[] args) {
		Student[] students = {
			new Student("이름1",1,120),
			new Student("이름2",2,440),
			new Student("이름3",3,170),
			new Student("이름4",3,200),
			new Student("이름5",2,400),
			new Student("이름6",2,250),
			new Student("이름7",1,300),
			new Student("이름8",1,140),
			new Student("이름9",2,110),
			new Student("이름10",3,270),
		};
		
		ArrayList<String> names = Arrays.stream(students)
									.map(Student::getName)
									.collect(Collectors.toCollection(ArrayList<String>::new));
		System.out.println(names);
		
		Map<String,Student> names2 = Arrays.stream(students)
//											.map(Student::getName)
											.collect(Collectors.toMap(Student::getName,Function.identity()/*s->s*/));
		System.out.println(names2);
		
		
	}

}
