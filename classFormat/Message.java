package classFormat;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Message {

	public static void main(String[] args)throws FileNotFoundException,ParseException {
		
		//{0~...(동적가변변수)} -> 이것은 치환되는 순서를 의미.
		//String 배열 -> String
		String pattern = "이름 : {0}, 번호 : {1}";
		String[] names = {"이름1","이름2","이름3"};
		String[] tels = {"0000","0001","0002"};
		
		for(int i=0; i < names.length; i++) {
			String name = names[i];
			String tel = tels[i];
			String info = MessageFormat.format(pattern, name,tel);
			System.out.println(info);
		}
		
		//parse
		//String -> Object 배열 -(명시적형변형)- > String 배열
		String pattern2 = "이름 : {0}, 번호 : {1}";
		
		MessageFormat mf = new MessageFormat(pattern2);
		Scanner sc = new Scanner(new File("person.txt"));
		
		while(sc.hasNext()) {
			String str = sc.nextLine();
			Object[] data = mf.parse(str);
			System.out.println(Arrays.toString(data));
		}
	}

}
