package day26;

import java.util.*;
import java.util.stream.*;

public class Ex06 {

	public static void main(String[] args) {
		String[] fruits = {"Apple","Orange","Melon"};
		String str = Arrays.stream(fruits).collect(Collectors.joining(","));
		
		System.out.println(str);
	}

}
