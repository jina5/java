package synchronize;
/*
 * player-thread 클래스
 * 잔액 int, 은행 Bank
 * 생성자에서는 은행 객체 받아서 저장(getinstance)
 * getMoney() -void : 단순히 은행에서 1000원 인출, 잔액 출력 
 * run 메서드에서는 getMoney 실행
 */
public class Player extends Thread{
	private int money;
	private Bank bank;

	public Player(Bank bank) {
		super();
		this.bank = bank;
		money=0;
	}
	
	public void getMoney() {
		money+=1000;
		System.out.println(getName()+":"+bank.withdraw(1000));
	}
	@Override
	public void run() {
		getMoney();
	}
	

	

}
