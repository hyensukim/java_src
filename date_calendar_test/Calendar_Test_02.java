package date_calendar_test;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Calendar_Test_02 {
	//Calendar set(), add(), roll() 메서드
	public static void main(String[] args) {
		//객체 생성
		Calendar cal = Calendar.getInstance();
		printDate(cal);
		
		//설정하고자 하는 월의 -1값을 입력해야 원하는 값이 출력된다.
		cal.set(2022,8,30);
		printDate(cal);
		
		cal.set(Calendar.YEAR,2021);
		printDate(cal);
		
		cal.add(Calendar.MONTH,1);
		printDate(cal);
		
		cal.add(Calendar.MONTH, -9);
		printDate(cal);
		
	}
	
	//객체 출력 메서드 정의
	private static void printDate(Calendar cal) {
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
	}

}
