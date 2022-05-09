package anonymous;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal() {
			public void eat() { // animal class가 생성될 영역에 eat를 만들어줘서 메모리 할당
				System.out.println("동물이 먹이를 먹습니다.");
			}
		};
		animal.eat();

		Animal human = new Animal() {

			@Override
			public void eat() {
				System.out.println("사람이 밥을 먹습니다.");
			}
		};
		human.eat();
	}

}
