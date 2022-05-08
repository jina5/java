
public class Quest01 {
	/*
	 * 구구단을 출력시 짝수단만 출력 출력할 값은 단까지만 출력 
	 * 2*1=2 2*2=4 4*1=4 4*2=8 4*3=12 4*4=16 6*1=6... 
	 * break, continue 사용하여 풀어보기 (안쓰고도 가능함)
	 */
	public static void main(String[] args) {
		for (int dan = 2; dan < 10; dan++){
			if (dan % 2 == 1)
				continue;
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + dan * i);
				if(i==dan)
					break;

			}
		}
	}

}
