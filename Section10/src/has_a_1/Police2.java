package has_a_1;

public class Police2 { // 상속x
	private Gun gun; // police의 구성요소로 gun을 넣음, gun 종류 바꿀 수 있음 (Ak47이 Gun 상속받음)

	public Police2(Gun gun) {
		this.gun = gun;
	}

	public void shot() {
		gun.shot();
	}

	public void reload() {
		gun.reload();
	}

	public void changeGun(Gun gun) {
	this.gun = gun;
	System.out.println("총기 교제 완료");
	}
	
	//police 가 gun에 접근가능, but gun이 police에 접근할수는 없다
	

}
