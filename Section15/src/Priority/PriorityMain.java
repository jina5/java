package Priority;

public class PriorityMain {

	public static void main(String[] args) {

		ThreadPriority t1 = new ThreadPriority("T1");
		ThreadPriority t2 = new ThreadPriority("T2");
		ThreadPriority t3 = new ThreadPriority("T3");
		ThreadPriority t4 = new ThreadPriority("T4");
		ThreadPriority t5 = new ThreadPriority("T5");
		ThreadPriority t6 = new ThreadPriority("T6");
		
		
		t1.setPriority(Thread.MAX_PRIORITY); //우선순위 값 1~10, 10으로갈수록 우선순위 높음
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		t5.setPriority(Thread.MIN_PRIORITY);
		t6.setPriority(Thread.MIN_PRIORITY);
		//우선순위가 높으면 가중치가 더 있는거뿐이지 무조건 먼저 끝나는것이 아니다 (작업의 양이 작을때는 티가 안난다..)
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		System.out.println("main 종료"); 
		//스레드가 종료되기전에 main이 먼저 종료된다
		//main이 끝나더라도 프로그램이 끝나느 것은 아니다. 모든 스레드가 끝나야 프로그램 종료!
	
	}

}
