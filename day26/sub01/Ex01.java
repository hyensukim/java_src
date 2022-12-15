package day26.sub01;

import java.io.*;
import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		byte[] nums = {1,2,3,4,5,6,7};
		byte[] nums2 = null;
		ByteArrayInputStream bis = new ByteArrayInputStream(nums);//1바이트
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		//read
		//7이 넘어가면 데이터가 없다 -> 다 읽게 되면 -1값을 반환하게 된다.
		int i = 0;
		while((i=bis.read()) != -1) {
			bos.write(i);
		}
		nums2 = bos.toByteArray();
		System.out.println(Arrays.toString(nums2));
		
	}

}
