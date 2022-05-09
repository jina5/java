package constructor;

public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person();
		// Person() 기능 사용한다 (person class에 설정해둔 sysout 실행 됨)
		// new Person(); 할때마다 기능 사용
		// 데이터 입력 없으면 기본 데이터 = 0
		System.out.println(p1.name); //데이터없으면 null 
		System.out.println(p1.age); //데이터없으면 0
		System.out.println(p1.gender); //데이터없으면 0 = false

		if (p1.gender==true) {
			System.out.println(p1.name+p1.age+"남자");
		}
		else
			System.out.println(p1.name+p1.age+"여자");
		
		
		Person p2 = new Person("김철수"); //문자열을 받을수있는 Person을 찾아서 실행
		System.out.println(p2.name); 
		
		Person p3 = new Person(20);  //정수를 받을 수 있는 Person을 찾아서 실행
		System.out.println(p3.age); 

		Person p4 = new Person(true);
		System.out.println(p4.gender);

		Person p5 = new Person("홍길동",20);
		System.out.println(p5.name);
		System.out.println(p5.age); 


	}

}
