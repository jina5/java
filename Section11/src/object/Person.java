package object;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		// 1. null check
		if (obj == null)
			return false;
		// 2. address
		if (this == obj)
			return true;
		// 3.instanceof
		if (obj instanceof Person) {
			Person temp = (Person) obj;
			if(name.equals(temp.name) && age == temp.age)
				return true;
		}
		return false;
	}

}
