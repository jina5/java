package init;

public class ThreadMain {

	public static void main(String[] args) {

		ThreadRun run1 = new ThreadRun("스레드1");
		ThreadRun run2 = new ThreadRun("스레드2");
		ThreadRun run3 = new ThreadRun("스레드3");
		ThreadRun run4 = new ThreadRun("스레드4");
		ThreadRun run5 = new ThreadRun("스레드5");
	
//		run1.run(); // 직접 run을 호출하는것이기 때문에 자동으로 실행되는것이 아님
	
		run1.start(); //start 호출하면 자동으로 일을 시작
		run2.start();
		run3.start();
		run4.start();
		run5.start();
		
		
	}

}
