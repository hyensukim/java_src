package thread_package.sub01;

public class Account {
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int money) {
		synchronized(this) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		balance -= money;
		}
	}
	
}
