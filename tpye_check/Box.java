package tpye_check;

import java.util.*;
public class Box<T extends Fruit> {
	ArrayList<T> list = new ArrayList<T>();
//	T[] ts = new T[10];
//	static T t;
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}
