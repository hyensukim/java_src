package thread_package.sub01;
// join() 예제
public class Thread08 {

	public static void main(String[] args) {
		ThreadEx08_1 th1 = new ThreadEx08_1();
		ThreadEx08_2 th2 = new ThreadEx08_2();
		th1.start();
		th2.start();
		long startTime = System.currentTimeMillis();
		try {
			th1.join();//메인쓰레드가 th1이 끝날 때까지 기다린다.
			th2.join();
		}catch(InterruptedException e) {}
		System.out.println("메인 끝");
		System.out.println("소요시간 : " + (System.currentTimeMillis()-startTime));
	}

}


class ThreadEx08_1 extends Thread{
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print(new String("|"));
		}
		System.out.println("th1 끝");
	}
}

class ThreadEx08_2 extends Thread{
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print(new String("-"));
		}
		System.out.println("th2 끝");
	}
}