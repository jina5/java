package init;

public class RunnableMain {

	public static void main(String[] args) {

		Thread t1 = new Thread(new RunnableRun(), "스레드1");
		Thread t2 = new Thread(new RunnableRun(), "스레드2");
		Thread t3 = new Thread(new RunnableRun(), "스레드3");
		Thread t4 = new Thread(new RunnableRun(), "스레드4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
