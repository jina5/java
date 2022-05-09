package power;

public class Tv implements PowerOnoff{
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
		power = POWER_ON;
		System.out.println("TV 전원 on");

	}

	@Override
	public void powerOff() {
		power = POWER_OFF;
		System.out.println("TV 전원 off");
	}


}
