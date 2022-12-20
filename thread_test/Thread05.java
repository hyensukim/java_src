package thread_test;
// 데몬 쓰레드 예제
public class Thread05 {

	public static void main(String[] args) {
		Thread th1 = new Thread(new ThreadEx05());
		th1.setDaemon(true);
		th1.start();
		
		for(int i = 1; i <=10; i++) {// 1~10 카운팅 후 main쓰레드 끝. -> th1은 다른 쓰레드이므로 프로그램 종료되지 않음.
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			System.out.println(i);
		}
		
	}

}

//데몬쓰레드가 생성한 쓰레드는 자동으로 데몬쓰레드가 된다.
class ThreadEx05_2 implements Runnable{
	public void run() {
		while(true) {
			try {
			Thread.sleep(5000);
			}catch(InterruptedException e) {}
			System.out.println("나도 데몬이 된다.");
		}
	}
}

class ThreadEx05 implements Runnable{
	Thread th1 = new Thread(new ThreadEx05_2());
	public void run() {
		th1.start();
		while(true) {
			try {
			Thread.sleep(3000);
			autoSave();
			}catch(InterruptedException e) {}
			
		}
	}
	
	private void autoSave() {
		System.out.println("내마음속에 저장~");
	}
	
}
