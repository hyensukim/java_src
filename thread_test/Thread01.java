package thread_test;

public class Thread01 {

	public static void main(String[] args) {
		Thread th1 = new ThreadEx01_1();
		Thread th2 = new Thread(new ThreadEx01_2());
		
		th1.start();
		th2.start();
		System.out.println("작업 끝");
	}

}

class ThreadEx01_1 extends Thread{
	
	public void run() {
		for(int i =0; i < 10; i++) {
			System.out.println(currentThread().getName()+" - "+ i);
		}
	}
}

class ThreadEx01_2 implements Runnable{
	public void run() {
		for(int i = 0; i <10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
