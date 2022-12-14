package thread_package;
//쓰레드 그룹 예제
public class Thread04 {

	public static void main(String[] args) {
		//생성자 1 ThreadGroup("그룹명") -> 그룹명의 쓰레드 그룹 생성.
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		ThreadGroup grp3 = new ThreadGroup("Group3");
		ThreadGroup main = Thread.currentThread().getThreadGroup();//main
		
		//생성자 2 ThreadGroup(parent group, "그룹명") -> parent에 속한 하위 그룹 생성.
		ThreadGroup subGrp1 = new ThreadGroup(grp1,"SubGroup1");
		ThreadGroup subGrp2 = new ThreadGroup(grp2,"SubGroup2");
		ThreadGroup subGrp3 = new ThreadGroup(grp3,"SubGroup3");
		
		//인터페이스 구현(익명 클래스)
		Runnable r = new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {}
			}
		};
		
		// 그룹에 쓰레드 담기 Thread( ThreadGroup, Runnable, String name);
		// thread는 실행을 해야 생성.(호출스택 + run())
		new Thread(grp1,r,"th1").start();
		new Thread(grp2,r,"th2").start();
		new Thread(grp3,r,"th3").start();
		new Thread(subGrp1,r,"subth1").start();
		
		
		
		System.out.println("Groupconut -"+main.activeGroupCount());
		System.out.println("threadcount -"+grp1.activeCount());
		main.list();// 모든 쓰레드그룹은 main그룹 하위에 속한다.
		
	}

}
