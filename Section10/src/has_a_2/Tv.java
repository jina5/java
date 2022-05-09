package has_a_2;

public class Tv extends PowerOnoff{
	private boolean power;

	@Override
	public void powerOnoff() {
		power = !power;
		if (power)
			System.out.println("TV 전원 on");
		else
			System.out.println("TV 전원 off");
	}

	@Override
	public void powerOn() {
		power = true;
		System.out.println("TV 전원 on");

	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("TV 전원 off");
	}


}
