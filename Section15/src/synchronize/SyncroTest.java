package synchronize;

public class SyncroTest {

	public static void main(String[] args) {

		Bank bank = Bank.getInstance(); //bank를 하나로 설정하기 위해서 싱글턴(getinstance) 사용
		Player p1 = new Player(bank);
		Player p2 = new Player(bank);
		Player p3 = new Player(bank);

		p1.start();
		p2.start(); 
		p3.start();
		
		// 동기화 안하면 (synchronized) 0,-1000,-1000 나올때있음.. 동시에 잔액 0원인 상태에서 접근
		// 완전히 동시라는건 없음.. 조금이라도 먼저 접근한게 있을것인데, 접근하고 나머지가 접근 못하게끔 하는것 : 동기화
		// 공통적인 데이터에 접근하는 경우에는 동시에 접근하면 데이터신뢰성에 문제가 생기기때문에 하나씩 처리하도록 동기화 처리해야한다.
		// 동기화 단점 : 작업이 몰리면 대기때문에 작업시간이 길어진다... 
	}

}
