package constructor;

public class StudentMain {

	public static void main(String[] args) {
		Student s = new Student("0001234", "홍길동", "경영학과", 3.55);
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.major);
		System.out.println(s.grade);

	}
}