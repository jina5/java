package power;

public interface PowerOnoff {
	public static final boolean POWER_ON = true; 
	public static final boolean POWER_OFF = false;

	public abstract void powerOnoff();

	public abstract void powerOn();

	public abstract void powerOff();
}
