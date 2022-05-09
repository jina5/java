package constructor;

public class Person extends Animal {
	// 밑에 super 생성자 안만들면 error! Person의 부모는 animal인데 animal을 생성할 때 생성자에 들어갈 age가 필요함
	private String name;
	
	
//자식 생성자가 부모 생성자에 필요한 값을 받아서 부모 생성자에게 전달함 - super(인자값 ..) : 부모 생성자 호출
	public Person(int age, String name) { //name으로 생성자만들었는데 age까지 자동으로 추가되어있음
		super(age); //super : 부모를 의미 , 받은 age을 부모에게 넘겨준다 
		this.name = name; //이게 super 위로 올라갈수없음, 부모생성자 먼저!
	
	}
	public void printPersonInfo() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}

}
