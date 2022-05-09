package has_a_2;

public class PowerOnoffMain {

	public static void main(String[] args) {
	Aircon a = new Aircon();
	Light l = new Light();
	Tv tv = new Tv();
	
	a.powerOn();
	l.powerOn();
	tv.powerOn();
	

	}

}
