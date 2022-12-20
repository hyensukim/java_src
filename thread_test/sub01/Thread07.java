package thread_test.sub01;

public class Thread07 {

	public static void main(String[] args) {
		ThreadEx07 th1 = new ThreadEx07();
		th1.start();
//		try {
//			Thread.sleep(1000);
//		}catch(InterruptedException e) {}
		th1.interrupt();
		th1.isInterrupted();
	}

}

class ThreadEx07 extends Thread{
	public void run() {
		while(!interrupted()) {//interrupted()가 false이면, 무한루프
			System.out.println("interrupted() = " + Thread.interrupted());
		}
	}
}