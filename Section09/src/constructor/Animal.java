package constructor;

public class Animal {
	protected int age; //private이라도 set.get(public)으로 이용 가능

	public Animal(int age) { //나이값 넣어줘야 생성
		super();
		this.age = age;
	}
	

}
