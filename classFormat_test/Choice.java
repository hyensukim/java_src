package classFormat_test;

import java.text.ChoiceFormat;

public class Choice {
	//ChoiceFormat test - 성적표 (switch-case)
	public static void main(String[] args) {
		double[] limits = {60,70,80,90};
		String[] patterns = {"D","C","B","A"};
		//~60:D, 61~70 : D, 71~80 : C, 81~90: B, 91~100 : A
		
		//ChoiceFormat(limits,patterns)
		ChoiceFormat cf = new ChoiceFormat(limits,patterns);  
		
		int[] scores = {50,65,-10,80,99,123};
		for(int score : scores) {
			if(score <= 100 && score >= 0) {
			String strcf = cf.format(score);
			System.out.println(score +" : "+strcf);
			}else {
				continue;
				}
		}
		//limits + patterns
		System.out.println();
		String patterns2 = "60#D|70#C|80<B|90#A";
		//ChoiceFormat(String newPatterns)
		ChoiceFormat cf2 = new ChoiceFormat(patterns2);
		
		for(int score : scores) {
			String strcf = cf2.format(score);
			System.out.println(score + " : "+strcf);
		}
		
		
	}
}
