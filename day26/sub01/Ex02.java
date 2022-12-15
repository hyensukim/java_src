package day26.sub01;

import java.io.*;

public class Ex02 {
	public static void main(String[] args) {
		
		//try 구문이 종료 -> AutoCLoseable - close() 메서드가 자동 호출.
		try(FileInputStream fis = new FileInputStream("test.txt")){
			int i =0;
			while((i= fis.read()) != -1) {
				System.out.print((char)i);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
