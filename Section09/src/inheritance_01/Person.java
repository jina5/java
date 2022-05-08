package inheritance_01;

public class Person extends Animal {
	// Person의 부모 클래스는 Animal
	// 생성자는 상속의 대상이 아니다
	// Person 클래스의 eat 메서드 상속 받음
	// 자식은 부모의 private 메서드 상속 받을 수 없음

	public Person() {
		System.out.println("Person 생성자");

	}

	public void run() {
		System.out.println("사람이 달립니다.");
	}

	public void printAge() {
//		System.out.println("이 사람의 나이 :" + age); //부모의 private 멤버 age 읽을 수 없음
		System.out.println(" 이 사람의 나이 :" + age2);
	}

	//부모의 메서드와 동일한데 내용만 다름 (오버라이딩)
	@Override //annotation 
	public void eat() { //super=부모
		System.out.println("사람이 밥을 먹습니다.");
		
	}
	
 
	
	
	

	
	
	
}
