package join;

public class JoinThread extends Thread{ //join : 작업을 기다려줄때 사용

	public JoinThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {
			for(int i =0 ; i<10; i++)
			Thread.sleep(500); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName() + " - 스레드 종료");
	}
	
}
