package thread_package;
//쓰레드 우선순위 예제
public class Thread03 {

	public static void main(String[] args) {
		Thread th1 = new ThreadEx03_1();
		Thread th2 = new ThreadEx03_2();
		th1.setPriority(7);
		th2.setPriority(4);
		System.out.println("작업1 우선순위 : "+th1.getPriority());
		System.out.println("작업2 우선순위 : "+th2.getPriority());
		th1.start();
		th2.start();
	}
}

class ThreadEx03_1 extends Thread{
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print(new String("-"));
			for(int j=0;j<1000000;j++);
		}
		System.out.print("작업 끝1");
	}
}

class ThreadEx03_2 extends Thread{
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print(new String("|"));
			for(int j=0;j<1000000;j++);
		}
		System.out.print("작업 끝2");
	}
}