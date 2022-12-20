package serialization_test;

import java.io.*;
import java.util.*;

public class Serial02 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("data1.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis)){
			
			@SuppressWarnings("unchecked")// 지네릭스 타입을 지정하지 않은 경우 발생하는 경고 메세지 억제
			ArrayList<Member> user01 = (ArrayList<Member>)ois.readObject(); // Object -> Member
			System.out.println(user01);// Member.toString()
			
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
