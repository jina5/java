package constructor;

public class Person {
	private static final String String = null;
	String name;
	int age;
	boolean gender; // true-남자, false-여자

	/*
	 * 생성자(constructor) : 클래스를 생성할 때 제일 먼저 한번만 실행되는 기능 메서드 명이 클래스명으로 되어있고, 리턴타입이 없음
	 * 객체가 생성될 때 제일 먼저 해야될 일을 작성하는 부분
	 */

	// 기본생성자 (default constructor : 아무런 조건이 없는)
	Person() {
		System.out.println("Person 기본 생성자 호출");
		name = "홍길동";
		age = 20;
		gender = true;
	}

	// 생성자는 여러개 만들 수 있다 but 여러 생성자들중에 하나만, 한번 실행된다
	// 해당 생성자는 실행하려면 반드시 문자열을 보내줘야한다
	Person(String n) {
		System.out.println("Person(String) 생성자 호출");
		name = n; // 외부에서 받아온 문자열을 name에 저장

	}

	Person(int n) {
		System.out.println("Person(int) 생성자 호출");
		age = n; // 외부에서 받아온 문자열을 name에 저장

	}

	Person(boolean b) {
		System.out.println("Person(boolean) 생성자 호출");
		gender = b;
	}

	Person (String n, int m) { //순서 맞춰야 함
		System.out.println("Person(String, int) 생성자 호출");
		name=n;
		age=m;
		
		// (String,int)와 (int,String)은 다르다
}



	}
