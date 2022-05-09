package has_a_1;

import java.util.Scanner;

/*
 * 총(gun) 클래스
 * 총알 개수를 가지고 있음
 * 총알의 최대값은 8
 * shot이라는 메서드를 사용하면 총을 1발씩 발사, 효과음 출력
 * 만약에 총알 다쓰면 reload라고 외치고 총알을 리필
 */

public class Gun {
	Scanner sc = new Scanner(System.in);
	protected int bullet;

	public Gun() {
		bullet = 8;
	}

	public void shot() {
		if (bullet == 0)
			reload();
		else {
			bullet--;
			System.out.println("탕");
			System.out.println("남은 총알 :" + bullet);
		}

	}

	public void reload() {
		bullet = 8;
		System.out.println("reload!");
	}
}
