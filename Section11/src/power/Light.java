package power;

public class Light implements PowerOnoff{
	private boolean power;

	@Override
	public void powerOnoff() {
		power = !power;
		if (power)
			System.out.println("전구 전원 on");
		else
			System.out.println("전구전원 off");
	}

	@Override
	public void powerOn() {
		power = POWER_ON;
		System.out.println("전구 전원 on");

	}

	@Override
	public void powerOff() {
		power = POWER_OFF;
		System.out.println("전구 전원 off");
	}


}
