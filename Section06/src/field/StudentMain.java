package field;

public class StudentMain {
//실행하는 클래스이기 때문에 main 만들어야한다 ↓
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		// class가 변수타입이 된다. s1,s2 객체 설정
		// new로 초기화 시켜줘야한다. (메모리 주소 저장)
		// new class명() : 생성자(Constructor) 기능
		s1.id = "001202312";
		// 앞에 0: 뒤에 숫자가 8진수이고, 0생략됨
		// int 사용하면 00학번 문제되기 떄문에 String으로 저장해야함
		s1.name = "홍길동";
		s1.major = "경영학과";
		s1.grade = 3.3;
		System.out.println(s1.id + " " + s1.name);
		System.out.println(s1.major);
		System.out.println(s1.grade);

		s2.id = "201155332";
		s2.name = "김길동";
		s2.major = "경제학과";
		s2.grade = 4.0;
		System.out.println(s2.id + " " + s2.name);
		System.out.println(s2.major);
		System.out.println(s2.grade);

	}

}
