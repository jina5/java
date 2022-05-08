package method;

public class PersonMain {

	public static void main(String[] args) {

		Person p = new Person("홍길동", 20);
		p.printInfo();

		p.setAge(-1);
		System.out.println(p.age);

		p.setFood("떡볶이");
		p.setFood("돈가스");
		System.out.println(p.getFood());
	}

	
}
