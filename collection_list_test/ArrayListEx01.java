package collection_list_test;

import java.util.*;
public class ArrayListEx01 {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>(10);
		al1.add(Integer.valueOf(5));
		al1.add(Integer.valueOf(4));
		al1.add(Integer.valueOf(2));
		al1.add(Integer.valueOf(0));
		al1.add(Integer.valueOf(1));
		al1.add(Integer.valueOf(3));
		System.out.println(al1);
		ArrayList<Integer> al2 = new ArrayList<Integer>(al1.subList(1, 4));
		System.out.println(al2);
		
		System.out.println();
		//Collections -> Collection 인터페이스 내 편의 기능을 추가해주는 클래스 -> static(객체 생성없이 호출)
		Collections.sort(al1);
		System.out.println(al1);
		Collections.sort(al2);
		System.out.println(al2);
		
		al1.retainAll(al2);
		System.out.println(al1);
		System.out.println(al1.containsAll(al2));
		
		al1.add(10);
		al1.add(90);
		al1.add(11);
		System.out.println(al1);
		
		System.out.println();
		//배열 특성상 index[0]이 지워지면 앞으로 한칸씩 앞으로 이동한 뒤 복사되어 새로운 배열이 
		//생성되고 그 배열의 index[1]은 이전 index[2]였던 객체이므로, 이전 index[1]이었던 
		//객체는ㄴ 살아남게 된다.
		for(int i = 0; i < al1.size();i++) {
			System.out.println(al1.size());
			al1.remove(i);
		}System.out.println(al1);
		
		
		
		//위와 같은 상황을 방지하기위해 배열은 뒤에서부터 역순으로 제거해줘야 모두 삭제된다.
//		System.out.println();
//		for(int i = al2.size()-1;i>=0;i-- ) {
//			if(al1.contains(al2.get(i))){
//				al1.remove(i);
//			}
//			System.out.println(al1);	
//		}
		
		
	}
}
