package date_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Calendar_Test_03 {

	public static void main(String[] args) {
		//각 국가별 달력체계에 차이가 있어 이를 고려한 내부 메서드를 활용하여
		//객체 생성 시 내부적으로 해당 국가에 맞는 달력 체계로 객체가 생성하기 위함.
		Calendar cal = Calendar.getInstance();
//		System.out.println(cal);
		
		//보기편한 형식으로 출력하기 위해서 각 데이터 조회 및 대입.
		//get() 메서드 사용하여 날짜 데이터 조회
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY); //0~23
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		int yoil = cal.get(Calendar.DAY_OF_WEEK);// 1- 일요일... 7 - 토요일
		String yoils[] = new String[]{"","일","월","화","수","목","금","토"};
		
		System.out.println(year+"-"+(month+1)+"-"+day+" "+hour+":"+min+":"
		+sec+" "+yoils[yoil]+"요일");
		
		printDate(cal);
		
		//set() 메서드 사용하여 날짜 데이터 변경
		//set(int Field, int value)
		cal.set(2021,10,30);
		printDate(cal);
		
		//add() 메서드 사용하여 날짜 데이터 증감
		cal.add(Calendar.YEAR,1);
		printDate(cal);
		
		cal.add(Calendar.DAY_OF_MONTH, 4);
		printDate(cal);
		
		cal.add(Calendar.DAY_OF_MONTH,-1);
		printDate(cal);
		
		//roll() 메서드 사용하여 날짜 데이터 증감.
		//add()와 다른점 -> 특정항목만 증감되고 월에는 영향을 미치지 않음.
		//-3을 하였는데도 12월 31일 나옴
		//add()의 경우 11월 30일 나옴.
		cal.roll(Calendar.DAY_OF_MONTH,-3);
		printDate(cal);
	
	}
	
	//보기 편한 형식으로 출력하기 위해 SimpleDateFormat 객체 활용
	//SimpleDateFormat
	private static void printDate(Calendar cal) {
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E요일");
		System.out.println(sdf.format(date));
	}
	

}
