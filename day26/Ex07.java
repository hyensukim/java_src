package day26;

import java.util.*;
import java.util.stream.*;

public class Ex07 {

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
		
		//데이터를 정리
		Map<Boolean,List<Student>> result = Arrays.stream(students)
											.collect(Collectors.partitioningBy(s->s.getScore() >= 250));
		List<Student> studentsOver250 = result.get(true);
		List<Student> studentsBelow250 = result.get(false);
		System.out.println(studentsOver250);
		System.out.println();
		System.out.println(studentsBelow250);
	}

}
