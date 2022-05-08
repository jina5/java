package abstract_method;

public class Person extends Animal { //unimplemented method 추가해라 (추상메서드 eat을 오버라이딩해서 포함시켜라)

	@Override
	public void eat() {
		System.out.println("사람이 밥을 먹습니다.");
	}

}
