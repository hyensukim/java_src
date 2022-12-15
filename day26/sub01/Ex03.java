package day26.sub01;

import java.io.*;

public class Ex03 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("test2.txt")){
			
			char ch = 'A';
			for(int i =0; i <=26;i++) {
				fos.write(ch);
				ch++;
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
