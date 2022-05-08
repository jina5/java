package quest;

public class TelevisionMain {

	public static void main(String[] args) {
		Television tv = new Television();


tv.onoff();
		tv.ch = 565;
		for(int i=0;i<10;i++)
			tv.chup();
		for(int i=0;i<10;i++)
			tv.chdown();
		tv.mute();
		tv.volup();

	}

}
