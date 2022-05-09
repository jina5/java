package static_ex;

public class CardMain {

	public static void main(String[] args) {
		Card c1 = new Card("홍길동");
		Card c2 = new Card("김미미");
		Card c3 = new Card("박나나");
		Card c4 = new Card("오지지");

		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
	}

}
