package has_a_1;

public class Police2Main {

	public static void main(String[] args) {
		Gun gun = new Gun();

		Police2 p = new Police2(gun);
		p.shot();
		p.shot();
		p.shot();
		p.shot();
		p.shot();
		p.shot();
		p.changeGun(new AK47()); //다른종류 총(gun) 만들어도 police 건드릴 필요가 없다. (확장성)
		p.shot(); //다형성 : 같은 shot으로 여러가지 일 할수있다
		p.shot();
		p.shot();
		p.shot();
		p.shot();
		p.shot();
		p.shot();
		p.shot();
		p.shot();
		
	}

}
