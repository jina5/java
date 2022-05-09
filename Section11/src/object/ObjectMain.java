package object;

public class ObjectMain {

	public static void main(String[] args) {
		Person p = new Person("홍길동", 20);
		Person s = new Person("홍길동", 20);
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println(p.hashCode()); 
		//hashcode : 객체를 식별하는 정수값 (p,s 객체 구분하는 식별값)
		System.out.println(s.hashCode());
		System.out.println(p.equals(s)); //hashcode,equals override 아무것도안하면 false로 나온다
	}

}
