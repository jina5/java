package power;

//추상클래스에서 인터페이스로 변경, 인터페이스에 상수를 선언해서 전원처리에 적용

public class IotApp {
	private PowerOnoff[] arr;
	private int index;

	public IotApp() {
		arr = new PowerOnoff[10];
		arr[index++] = new Tv();
		arr[index++] = new Tv();
		arr[index++] = new Light();
		arr[index++] = new Aircon();
	}

//새로운 기기를 받아서 배열에 등록하는 메서드
	
	public void addDevice(PowerOnoff device) {
		if (index != arr.length) {
			arr[index++] = device;
			System.out.println("디바이스 등록완료");
		} else
			System.out.println("더이상 등록할 공간이 없습니다.");
	}

//전체 PowerOn
	public void allPowerOn()
	{
		for (int i = 0; i < index; i++)
			arr[i].powerOn();
	}

//전체 PowerOff
	public void allPowerOff()
	{
		for (int i = 0; i < index; i++)
			arr[i].powerOff();
	}
}



