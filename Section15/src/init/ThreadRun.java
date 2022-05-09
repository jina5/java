package init;

public class ThreadRun extends Thread { // Thread 클래스 상속 받으면 된다
	// 동시에 일하는 부분을 메서드로 만들어야한다

	//생성자 - 스레드 이름을 받음
	public ThreadRun(String name) {
		super(name);
		System.out.println(name + " - 스레드 생성");
	}

	// 자동으로 수행할 메서드
	@Override
	public void run() {
		for (int i = 0; i < 100; i++);

		System.out.println(getName() + " " + "스레드 종료"); // getname:쓰레드가 설정된 이름을 확인

	}

}
