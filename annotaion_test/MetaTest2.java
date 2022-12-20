package annotaion_test;

import java.util.Arrays;

@MyAnno("값1") 
public class MetaTest2 {

	public static void main(String[] args) {
		Class<MetaTest2> cls = MetaTest2.class;
		System.out.println(cls);
		
		MyAnno ma = cls.getAnnotation(MyAnno.class);
		String[] values = ma.value2();
		System.out.println(Arrays.toString(values));
	}

}
