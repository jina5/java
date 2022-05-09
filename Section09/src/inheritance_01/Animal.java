//상속
package inheritance_01;

public class Animal {

	public Animal() {
		System.out.println("Animal 생성자");
		age=20;
		age2=20;
	}

	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}

	private int age; //자신만 접근 가능
	protected int age2; //상속받고 있는 자식들까지 접근 가능
	
	
	
}
