package classFormat_test;

import java.text.*;

public class Decimal {
	//Decimalformat을 이용하여 숫자를 특정형식으로 바꿔준다.(형식화)
	public static void main(String[] args)throws ParseException {
		
		//기본생성자 - 각 Locale(국가) 마다 다르게 표현
		DecimalFormat df = new DecimalFormat();
		long num1 = 1000000000L;
		String strNum1 = df.format(num1);
		System.out.println(strNum1);
		
		//pattern을 매개변수로 받는 생성자
		double num = 1234567.123;
		String pattern = "0,000.00000";
		String pattern2 = "#,###.#####";
		
		//format() 메서드
		//0으로 입력된 pattern은 소숫점 넷째자리에 값이 없어 0을 대입해준다.
		DecimalFormat dcf = new DecimalFormat(pattern); // 객체 및 형식 생성
		String strNum = dcf.format(num);
		System.out.println(strNum); // 객체의 format 메서드 호출, num 를 형식화.
		
		//parse() 메서드
		Number pNum = dcf.parse(strNum);
		System.out.println(pNum);
		
		//#으로 입력된 pattern2는 소숫점 넷째자리에 값이 없어 공백으로 놓는다.
		DecimalFormat dcf2 = new DecimalFormat(pattern2);
		String strNum2 = dcf2.format(num);
		System.out.println(strNum2);
		
		//parse() 메서드
		Number pNum2 = dcf2.parse(strNum2);
		System.out.println(pNum2);
	}

}
