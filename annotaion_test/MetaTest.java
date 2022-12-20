package annotaion_test;

@MyAnno(value = "값1")
public class MetaTest {
	
	@MyAnno("값2")
	int num;
	
	@MyAnno("값3")
	public static void main(@MyAnno("값4") String[] args) {
		
		
			
	}

}
