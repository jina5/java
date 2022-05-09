package access;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person("홍길동", 20);
		
		// p 객체 안에서 this를 쓰면 p 객체를 말함
		// p.age++; 오류 : not visible , private으로 막았기 때문에 보이지 않음
		// quick fix
		// 1.시야를 package로 바꿔라(private(private int)을 default(int)로 바꿔라)
		// 2.getter and setter (데이터 읽어오는, 저장 메서드 만들어라)
		p.setAge(29);
		p.printPersonInfo();
		System.out.println(p.toString());
		
	}

}
