package inter;

public class Person implements Eat { // 인터페이스 가져올때 : implements
//person은 eat이 될 수 있다 (클래스처럼..) 
	@Override
	public void eat() { // 오버라이딩해야한다

		System.out.println("사람이 밥을 먹습니다.");
	}

}
