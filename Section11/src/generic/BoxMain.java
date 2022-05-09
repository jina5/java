package generic;

public class BoxMain {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObj(100); // 모든타입이 obj 될수있다
		System.out.println(box.getObj());
		box.setObj(new Apple());
		Apple a = (Apple) box.getObj();
		a.printApple();
		System.out.println(box.getObj().getClass().getName());
		
		System.out.println(box.getObj() instanceof Orange);
		if (box.getObj() instanceof Orange) {
			Orange o = (Orange) box.getObj();
			o.printOrange();
		}
	}

}
