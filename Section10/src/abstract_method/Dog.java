package abstract_method;

public class Dog extends Animal {//클래스 만들때 super class animal로 지정하면 자동으로 override 생성된다 (inherited abstract method 체크)

	@Override
	public void eat() {
		System.out.println("개가 사료를 먹습니다.");
		
	} 

	
}
