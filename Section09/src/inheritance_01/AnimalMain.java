package inheritance_01;

public class AnimalMain {

	public static void main(String[] args) {
	Person p = new Person(); //animal 생성자, person 생성자 둘다 생긴다 (부모(Animal) 먼저 생성)
	p.eat(); // (person eat생성 전) "동물이 먹이를 먹습니다." person 생성했는데 animal메서드인 eat가 있다 (상속받았기 때문)
	//오버라이딩으로 person에 eat 메서드 생성후에는 그게 먼저 나오고, person에 eat없으면 부모(animal)의 eat 호출
	p.printAge();
	

	}

}
