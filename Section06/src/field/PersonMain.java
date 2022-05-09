package field;

public class PersonMain {
	/*
	 * 불러올 클래스가 다른 패키지에 있으면 import 사용 해야함 같은 패키지에 있으면 import 안해도 됨
	 */
	public static void main(String[] args) {
		Person p1 = new Person();
		// new : 메모리 할당하여 Person 객체를 만듦
		// 할당된 메모리 안에는 Person 클래스 내의 name, age 변수가 저장되어있음
		// reference type 참조형 변수
		Person p2 = new Person();
		System.out.println(p1); // p1 : 할당된 메모리 주소
		System.out.println(p2);

		p1.name = "홍길동";
		p1.age = 20;
		// p1 : 할당된 메모리 주소
		// p1.name : p1 내의 name 구성요소 (.은 접근 지정 연산자)
		System.out.println(p1.name+" "+p1.age);

		p2.name = "김길동";
		p2.age = 10;
		System.out.println(p2.name+" "+p2.age);
		// p1, p2는 개별적이다. 데이터를 따로 넣어줄 수있음
		

	}

}
