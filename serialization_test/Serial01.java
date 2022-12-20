package serialization_test;

import java.io.*;
import java.util.*;

public class Serial01 {

	public static void main(String[] args){
		
		Member member01 = new Member("Id01","1234");
		Member member02 = new Member("Id02","1234");
		
		ArrayList<Member> ar1 = new ArrayList<>();
		ar1.add(member01);
		ar1.add(member02);
		
		try(FileOutputStream fos = new FileOutputStream("data1.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos)){
			
			oos.writeObject(ar1);
			bos.close();
			System.out.println("직렬화 끝");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
