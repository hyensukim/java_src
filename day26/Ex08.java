package day26;

import java.util.*;
import java.util.stream.*;

public class Ex08 {

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
		
		//stream 쓰면 너무 행복해진다... ㅎㅎㅎㅎㅎㅎ -> 소싱도 짧아 지니깐 느무느무 좋아~
		Map<Integer,List<Student>> result = Arrays.stream(students)
													.collect(Collectors.groupingBy(Student::getGrade));
		
		List<Student> class1 = result.get(1);
		System.out.println(class1);

	}

}
