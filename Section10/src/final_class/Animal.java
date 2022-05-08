package final_class;

public final class Animal { //final animal
private int age;

public Animal(int age) {
	this.age = age;
}

public void printAnimalInfo() {
	System.out.println("이 동물의 나이 : " + age);
}

}
