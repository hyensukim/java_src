package thread_package.sub01;

public class Thread06 {

	public static void main(String[] args) {
		Thread th1 = new Thread(new ThreadEx06_1());
		Thread th2 = new Thread(new ThreadEx06_2());
		
		th2.start();
		th1.start();
		//메인쓰레드를 일시정지함.
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		System.out.println("메인쓰레드 끝");
	}

}

class ThreadEx06_1 implements Runnable{
	public void run() {
		for(int i = 0; i <300; i++) {
			System.out.println(new String("-"));
		}
		System.out.println("th1 끝");
	}
}

class ThreadEx06_2 implements Runnable{
	public void run() {
		for(int i = 0; i <300; i++) {
			System.out.println(new String("|"));
		}
		System.out.println("th2 끝");
	}
}
