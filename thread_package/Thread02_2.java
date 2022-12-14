package thread_package;
//멀티 쓰레드 종료 시간
public class Thread02_2 {

	static long startTime = System.currentTimeMillis();
	
	public static void main(String[] args) {
		
		Thread th1 = new Thread(new ThreadEx02());
		th1.start();
		startTime = System.currentTimeMillis();
		for(int i= 0; i < 300; i++) {
			System.out.print(new String("|"));
		}
		System.out.print("메인쓰레드 소요시간 : "+(System.currentTimeMillis() - Thread02_2.startTime));
	}

}


class ThreadEx02 implements Runnable{
	public void run() {
		for(int i = 1; i < 300; i ++) {
			System.out.print(new String("-"));
		}
		System.out.print("쓰레드0 소요시간 : " + (System.currentTimeMillis() - Thread02_2.startTime));
	}
}