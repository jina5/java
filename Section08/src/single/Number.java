package single;

public class Number {

	private static Number instance = new Number();
	// new -> heap, instance -> static
	
	private int count;
	private Number() { // 기본생성자 private으로 해봄, main에서 생성자 못만듦, 여기서만 생성 가능
		System.out.println("Number 객체 생성");
		count++;
	}

	public static Number getInstance() {
		if(instance ==null) //null일때 실행하면 프로그램 터지기 때문에
			instance = new Number();
		return instance;
	}	
	// private static Number instance = new Number(), private, getInstance => 싱글턴..singletone

	public int getCount() {return count;}
	
}
