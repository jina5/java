package quest;
/** 티비클래스
 * 
 * @author ITSC
 *
 */
public class Television {
	int ch;
	int vol;
	boolean onoff;
	boolean mute;
	int remote;

	// 기본생성자
	public Television() {
		ch = 7;
		vol = 10;
		onoff = false;
		mute = false;

	}

	void remote(int m) {
		if (m == 1) { // 비교는 "==" 인것 주의!!! 이럴때는 if보다 switch가 나음
			onoff();
		}
		if (m == 2) {
			mute();
		}
		if (m == 3) {
			volup();
		}
		if (m == 4) {
			voldown();
		}
		if (m == 5) {
			chup();
		}
		if (m == 6) {
			voldown();
		}
	}

	// 전원 : 누를 때 마다 달라지는 것 - 토글
	void onoff() {
		onoff = !onoff; // if (onoff) onoff=false 보다 간단하다
		if (onoff) // onoff==true랑 동일
			System.out.println("TV 전원 On");
		else
			System.out.println("TV 전원 Off");

	}

	// 음소거 - 토글 메서드
	void mute() {
		if (!onoff)
			return;
		mute = !mute;
		if (mute)
			System.out.println("음소거 On");
		else
			System.out.println("음소거 Off");
	}

	// 채널
	void chup() {
		if (!onoff)
			return; // onoff==false 대신에
		// break: 반복문, switch만 멈출 수 있음
		// return: 메서드 멈춤

		ch = ch % 567; // if 안쓰고 데이터 순환 (567일때 0 -> chup하면 1로 순환)

		// if (0 < ch && ch < 568) 이거 필요없음!!!
		ch++;
		System.out.println("현재 채널 :" + ch);

	}

	void chdown() {
		if (!onoff)
			return;
		// if (0 < ch && ch < 568) 필요없음!!!
		ch--;
		if (ch < 1)
			ch = 567; // 감소는 사칙연산으로 데이터순환 안되는듯..
		System.out.println("현재 채널 :" + ch);

	}

	// 음량
	void volup() {
		if (!onoff)
			return;
		if (mute)
			mute(); // mute==true, mute()메서드 실행
		if (vol < 40) // 간단하게 하자.. if 주렁주렁x
			vol++;
		System.out.println("현재 음량 :" + vol);
	}

	void voldown() {
		if (!onoff)
			return;
		if (mute)
			mute();
		if (vol > 0)
			vol--;
		System.out.println("현재 음량 :" + vol);
	}

}
