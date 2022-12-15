package day26;

import java.util.*;
import java.util.stream.*;

public class Ex02 {

	public static void main(String[] args) {
		
		String[] names = {};
		
		Optional<String> optional = Arrays.stream(names).findFirst();
		String name = optional.orElse("이름 없음");// runtime 오류가 발생하지 않도록 (null 값이 안나오도록) 하는 것.
		System.out.println(name);
		
	}

}
