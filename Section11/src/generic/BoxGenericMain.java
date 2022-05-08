package generic; //원하는 타입으로만 저장하기 위해

public class BoxGenericMain {

	public static void main(String[] args) {
		BoxGeneric<Apple> box1 =new BoxGeneric<Apple>();	//  <>에는 레퍼런스형만 들어올수있음 (클래스or인터페이스)
		box1.setObj(new Apple());
		Apple a = box1.getObj();
		a.printApple(); //apple만 저장해서 형변환 필요없음
		BoxGeneric<Orange> box2 = new BoxGeneric<Orange>();
		box2.setObj(new Orange());
		Orange o = box2.getObj();
		o.printOrange();
	}

}
