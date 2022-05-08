package abstract_class;

public class AnimalMain {

	public static void main(String[] args) {
		// 추상 클래스는 직접 생성 X
		// Animal a = new Animal(); //error! cannot instantiate 생성할 수 없다 클래스의 abstract때문에...

		Person p = new Person(); //Person은 상속받았기 때문에 ok
		//자식클래스 생성될때 부모클래스(추상 클래스 abstract)도 생성됨
		p.eat();
		
		
	}

}
