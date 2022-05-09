// 접근제어자
package access;

/*
 * 접근제어자(Access Modifier)
 * 	private : 클래스 내부에서만 접근이 가능(외부 접근X)
 * 	protected : 해당 클래스를 상속받은 클래스만 접근이 가능(외부 접근X)
 *	default : 같은 패키지 내에서는 접근이 가능
 *	public : 누구나 접근이 가능(외부 접근O)
 *
 */
public class Person {
	private String name;
	private int age; //클래스 내부의 생성자나 메서드만 private에 접근 가능

	public Person(String name, int age) { //생성자
		super();
		this.name = name;
		this.age = age;
	}

	public void printPersonInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

	@Override
	//toString
	//source(alt+shift+s) - s (toString)
	//저장된 데이터 확인할때
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	//getter&setter
	//source(alt+shift+s) - r (getter setter)
	public int getAge() {
		return age;
	}

	public void setAge(int age) { //매개변수 : 지역변수
		this.age = age; //this. : 지역변수와 구분하기 위해, 객체 자신을 말함
	}
	


}
