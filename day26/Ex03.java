package day26;

import java.util.*;
import java.util.stream.*;

public class Ex03 {

	public static void main(String[] args) {
		int[] scores = {90,80,67,88,91};
		OptionalDouble optional = Arrays.stream(scores).average();
		double avg = Arrays.stream(scores).average().getAsDouble();
		System.out.println(optional);
		
		IntSummaryStatistics stat = Arrays.stream(scores).summaryStatistics();
		System.out.println("평균 " + stat.getAverage());
		System.out.println("최대값 " + stat.getMax());
		System.out.println("최소값 " + stat.getMin());
		System.out.println("총합 " + stat.getSum());
		
		
		
	}

}
