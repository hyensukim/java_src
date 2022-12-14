package date_calendar;

import java.util.Calendar;
import static java.util.Calendar.*; // Calendar. 호출명을 생략하기 위함.

public class Calendar_Test_01 {
	//Calendar 클래스 get() 메서드(조회)
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		//날짜조회
		int y = today.get(YEAR);
		int m = today.get(MONTH);
		int d = today.get(DAY_OF_MONTH);
		System.out.println(y+"년 "+(1+m)+"월 "+d+"일");
		//0~11(1월~12월), 0이 1월. m+1을 해줘야 출력상 일치하는 달이 나온다.
		
		//시간조회
		int h = today.get(HOUR_OF_DAY);//HOUR : 0~11시, HOUR_OF_DAY : 0~23시
		int min = today.get(MINUTE);
		int s = today.get(SECOND);
		System.out.println(h+"시 "+min+"분 "+s+"초");
		
		int yoil = today.get(DAY_OF_WEEK);
		System.out.println("요일 = "+yoil);//1 - 일요일,...7 - 토요일
		String[] yoils = {"","일","월","화","수","목","금","토"};
		System.out.println("요일 = "+yoils[yoil]);
		
	}

}


