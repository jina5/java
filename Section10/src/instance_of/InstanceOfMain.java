package instance_of;

public class InstanceOfMain {

	public static void run(Animal a) {
		if (a instanceof Person) {
			Person p = (Person) a;
			p.pirntPerson();
		}
		if (a instanceof Dog) {
			// Dog d = (Dog) a;
			// d.printDog();
			((Dog) a).printDog();
		}

	}

	public static void main(String[] args) {
		Person p = new Person();
		Animal a = p; // person->animal upcasting 자동으로 된다
		Person s = (Person) a; // downcasting은 강제로 형변환 해줘야함

		a = s; // person - > animal
		// Dog g = (Dog) a ; //person -> animal -> dog 문법적인 에러 없지만 실행에러 뜬다.
		System.out.println(a instanceof Person); // 변수가 클래스로 형변환 되나?
		// a가 Person으로 형변환되는가? -> 결과 true or false로 알려줌. true
		System.out.println(a instanceof Dog); // false
		System.out.println(p instanceof Animal); // true
		System.out.println(a instanceof Object); // animal a 변수가 object로 형변환되는가? object= 모든 데이터의 최상위 (부모)
		// 어떤 클래스든 object가 될 수 있다.
		// 클래스가 아닌 int, float 같은 것들은 구조가 다르다. but 형변환 가능하다

		run(p);
		run(new Dog());

		System.out.println("프로그램 종료"); // 프로그램이 정상적으로 끝난다면 이 메세지가 나옴

	}

}
