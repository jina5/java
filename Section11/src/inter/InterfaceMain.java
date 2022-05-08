package inter;

public class InterfaceMain {
	public static void eat(Eat e) {
		e.eat();
	}

	public static void main(String[] args) {
		Person p = new Person();
		Dog d = new Dog();
		p.eat();
		d.eat();
		System.out.println(p instanceof Eat);
		System.out.println(d instanceof Eat);
		// Perosn -> Eat , Dog -> Eat 형변환 가능 (인터페이스로 형변환 가능)
		eat(p);
		eat(d);		//형변환 확인 
	}

}
