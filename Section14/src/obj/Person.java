package obj;

import java.io.Serializable;

public class Person implements Serializable{ //serializable 직렬화 해야 데이터에 일렬로 저장이 된다.
	private String name;
	private transient int age; //transient : 직렬화에서 제외, 저장 안된다. 읽어올때는 0으로 출력된다.

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	
}
