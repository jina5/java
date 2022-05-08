package Priority;

public class ThreadPriority extends Thread {

	public ThreadPriority(String name) {
		super(name);
		System.out.println(name + " - 스레드 생성");
	}

	@Override
	public void run() {
		try {
			for(int i =0 ; i<10; i++)
			Thread.sleep(1000); //1000밀리초 (1초) 동안 잠시 멈춤
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName() + " - 스레드 종료");
	}

}
