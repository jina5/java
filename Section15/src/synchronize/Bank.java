package synchronize;
/*
 * bank 클래스 - 싱글톤
 * 잔액을 가지고있음
 * 생성시 잔액을 1000원으로 초기화
 * 출금메서드 withdraw(int) - int : 매개변수 받은 인자값만큼 잔액을 차감, 결과값으로는 현재 잔액 return
 */
public class Bank {

	private static Bank instance = new Bank();

	private int money;

	public Bank() {
		money = 1000;
	}

	public static Bank getInstance() {
		if (instance == null)
			instance = new Bank();
		return instance;
	}
	
	public synchronized int withdraw(int n) {  //동기화
		money=money-n; //money-=n;
		return money;

}

}
