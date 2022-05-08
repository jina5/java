
public class ContinueEx {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			// continue;
			// System.out.println(i);
			// continue만나면 남은 코드 실행하지 않고 넘어가기 때문에 sysout은 죽은 코드가 됨: 오류

			if (i % 2 == 1)
				continue;
			System.out.println(i); // 홀수일때는 작업안하고 넘어간다 (continue) : 짝수만 출력
		}

	}

}
