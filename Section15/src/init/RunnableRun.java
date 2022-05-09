package init;

public class RunnableRun implements Runnable { //스레드 클래스 아님. Runnable 인터페이스 사용.
	//상속보다 인터페이스를 쓰는게 더 낫다.. 상속은 꼭 필요할수도있으니까..
	//기본적으로 제공되는 기능을 쓰기는 어려움
	//run 메서드 오버라이딩해서 사용해야한다

	@Override
	public void run() {
		for (int i = 0; i < 1000000; i++);
			System.out.println(Thread.currentThread().getName() + " - 종료"); //실행되고 있는 쓰레드 이름 
		//그냥 getname은 Thread 클래스에 있던것이기 때문에 여기서는 사용못함
		//Thread.currentThread() : 현재 실행중인 쓰레드
		
		
		
	}

}
