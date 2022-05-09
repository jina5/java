package final_method;

public class Animal {
	private int age;

	public Animal(int age) {
		super();
		this.age = age;
	}
	
	public final void printAnimalInfo() { //final method
		System.out.println("이 동물의 나이 : "+age);
	}

}
