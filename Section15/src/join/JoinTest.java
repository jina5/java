package join;

public class JoinTest {

	public static void main(String[] args) {
		JoinThread j = new JoinThread("Join");
		j.start();
		
		try {
			j.join(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} //join():현재 스레드가 j 스레드 끝날때까지 대기.. j 스레드 끝나야 메인이 끝난다
		//join(1000): 밀리초 들어가면 해당시간까지만 대기, 1초만 기다려주고 작업 시작한다
		System.out.println("main thread exit");
		
		// join 안할때 : main thread exit -> Join 스레드 종료
		// join 했을때 : Join 스레드 종료 -> main thread exit
	}

}
