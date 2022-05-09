package job;

public class JobInfo {
	private static JobInfo instance = new JobInfo();
	private String jobInfo;

	public JobInfo() {
	}

	public static JobInfo getInstance() {
		if (instance == null)
			instance = new JobInfo();
		return instance;
	}

	public synchronized String getJobInfo() throws InterruptedException {
		String msg = null;
		if(jobInfo == null)
			wait(); //스레드를 대기상태로...
		//wait없으면 계속 스레드실행 (while 루프)
		msg = jobInfo;
		jobInfo=null;
		return msg;
	}
	
	public synchronized void writeJob(String job) {
		jobInfo = job ;
		notifyAll(); //대기중이던 스레드를 깨운다...
		
	}
	
	
}
