package classFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
	//SimpleDateFormat test
	public static void main(String[] args)throws ParseException {
		//Date 객체 생성
		Date today = new Date();
		String pattern = "yyyy년 MM월 dd일 a hh시 mm분 ss초	";
		//SimpleDateFormat 객체 및 형식 생성
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		//format() 메서드
		String strDate = sdf.format(today);
		//출력
		System.out.println(strDate);
		
		//parse
		String pattern2 = "yyyy-MM-dd HH:mm:ss";
		String strDate2 = "2022-12-01 17:30:00";
		SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
		Date date = sdf2.parse(strDate2);// String형 -> Date형
		System.out.println(date);
		
	}

}
