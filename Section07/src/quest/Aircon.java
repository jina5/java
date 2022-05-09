package quest;

/**
 * 에어컨클래스에 대한 주석 : 위에적기
 */

public class Aircon {

	private boolean onoff; // 전원
	private int wind; // 바람세기
	private int temp; // 온도
	private int mode; // 모드

	private final int MAX_TEMP = 32; // 상수 (final) 선언
	private final int MIN_TEMP = 18; // 상수 final

	public Aircon() { // 기본생성자
		super();
		onoff = false;
		wind = 2;
		temp = 24;
		mode = 1;
	}

	public void remote(int command) {
		switch (command) {
		case 1:
			onoff();
			break;
		case 2:
			mode();
			break;
		case 3:
			wind();
			break;
		case 4:
			tempup();
			break;
		case 5: //default쓰면 다른 리모콘으로 제어될수도있고 추가기능 생길수도 있으니까.. default대신 case로 처리
			tempdown();

		}

	}

	public void onoff() {
		onoff = !onoff;
		if (onoff)
			System.out.println("전원 on");
		else
			System.out.println("전원 off");
	}

	public void mode() {
		if (!onoff)
			return;
		mode = mode % 3;
		mode++;

		switch (mode) {
		case 1:
			System.out.println("냉방모드");
			break; // break안하면 누적된다!!!
		case 2:
			System.out.println("송풍모드");
			break;
		default: // 나머지
			System.out.println("제습모드");
			break;
		}
	}

	public void wind() {
		if (!onoff)
			return;
		wind = wind % 4;
		wind++; // 순환

		switch (wind) {
		case 1:
			System.out.println("약");
			break;
		case 2:
			System.out.println("중");
			break;
		case 3:
			System.out.println("강");
			break;
		default:
			System.out.println("자동");
		}
	}

	/**
	 * 에어컨 희망 온도를 올리는 메서드 최대 온도 32도를 넘어갈수는 없다 설명달고싶은것 위에 **주석달기
	 */
	public void tempup() {
		if (!onoff) // 전원 켜져있어야함
			return;
		if (mode != 1) // 냉방모드에서만 온도조절 가능 (not 이용)
			return;
		if (temp < MAX_TEMP)
			temp++;
		System.out.println("희망 온도 : " + temp);
	}

	public void tempdown() {
		if (!onoff) // 전원 켜져있어야함
			return;
		if (mode == 1) { // 냉방모드에서만 온도조절 가능 (==이용)
			if (temp > MIN_TEMP)
				temp--;
			System.out.println("희망 온도 : " + temp);
		}
	}

}