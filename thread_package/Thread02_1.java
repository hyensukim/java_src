package thread_package;
//싱글 쓰레드 종료 시간
public class Thread02_1 {
	static long startTime = System.currentTimeMillis();
	
	public static void main(String[] args) {
		
		startTime = System.currentTimeMillis();
		for(int i= 0; i < 300; i++) {
			System.out.print(new String("|"));
		}
		System.out.print("메인쓰레드 소요시간1 : "+(System.currentTimeMillis() - startTime));
		for(int i = 1; i < 300; i ++) {
			System.out.print(new String("-"));
		}
		System.out.print("메인쓰레드 소요시간2 : " + (System.currentTimeMillis() - startTime));
	}

}
