package single;

public class NumberMain {

	public static void main(String[] args) {
		// private 생성자는 외부에서 생성을 전부 차단
// 에러 	Number num = new Number();
		Number n1 = Number.getInstance();
		Number n2 = Number.getInstance();
		Number n3 = Number.getInstance();
		Number n4 = Number.getInstance();
		Number n5 = Number.getInstance(); // 객체생성 메세지 딱 한번만 나온다 (싱글턴)
		System.out.println(n1.getCount());
		System.out.println(n2.getCount());
		System.out.println(n3.getCount());
		System.out.println(n4.getCount());
		System.out.println(n5.getCount()); // 전부 1, 객체가 하나다!
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5); // 전부 메모리 주소도 동일하다
	}

}
