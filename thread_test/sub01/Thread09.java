//학원에서 테스트
package thread_test.sub01;
//synchronized(동기화) 관련 예제
public class Thread09 {

	public static void main(String[] args) {
		Thread th1 = new Thread(new ThreadEx09());// 쓰레드1
		Thread th2 = new Thread(new ThreadEx09());// 쓰레드2
		//두 쓰레드가 account 내 balance라는 자원을 공유하여 작업하게되어 결과값이 이상해진다.
		th1.start();
		th2.start();
		
	}

}

class ThreadEx09 implements Runnable{
	Account account = new Account();
	
	public void run() {
		while(account.getBalance() > 0) {
			int money = (int)((Math.random()*3+1)*100);
			account.withdraw(money);
			System.out.println("잔고 : "+account.getBalance());
		}
	}
}
