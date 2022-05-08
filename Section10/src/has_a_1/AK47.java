package has_a_1;

public class AK47 extends Gun {

	public AK47() {
		bullet = 24;
	}

	// 한번에 세발씩 나가도록
	@Override
	public void shot() {
		if (bullet < 3)
			reload();
		else {
			bullet -= 3;
			System.out.println("빵!빵!빵!");
		}
	}

	@Override
	public void reload() {
		bullet = 24;
		System.out.println("reload!!!");
		
	}
	
	
}
