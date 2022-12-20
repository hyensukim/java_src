package lamda_test;
//Collection의 매개변수로 람다식이 들어간 경우

import java.util.*;

public class Lamda07 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<=10;i++) {
			list.add(i);
		}
		
		// list의 모든 요소를 출력
		list.forEach(x -> System.out.println(x));
		System.out.println("/");
		
		// list에서 2또는 3의 배수를 제거한다.
		list.removeIf(x-> x%2 == 0 || x%3 == 0);
		System.out.println(list);
		System.out.println("//");
		
		// list에 각 항에 10을 곱해준다.
		list.replaceAll(i->i*10);
		System.out.println(list);
		System.out.println("///");
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		//map의 모든 요소를 {k,v} 형식으로 출력
		map.forEach((k,v)->System.out.println("{"+k+","+v+"}"));
		System.out.println("////");
		
	}

}
