package ramda;

public class RamdaEx1 {

	public static void main(String[] args) {

		// 익명클래스
		Calculator plus = new Calculator() {

			@Override
			public int calc(int x, int y) {
				return x + y;
			}
		};
		System.out.println(plus.calc(10, 20));

		// 람다
		Calculator minus = (a, b) -> a - b; // 변수타입 안써도 된다 , 한줄이라 return 필요없음
		System.out.println(minus.calc(5, 3));

		Calculator total = (a, b) -> {
			int sum = 0;
			for (int i = a; i <= b; i++)
				sum += i;
			return sum; // 추상메서드 int calc라서 return해줘야함. void면 return 없어도 된다.
		};
		System.out.println(total.calc(1, 100));

	}

}
