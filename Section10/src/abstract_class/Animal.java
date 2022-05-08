package abstract_class; //추상클래스 - 실체가 없는 클래스
/*
 * 추상 클래스 (Abstract Class)
 * - 직접적으로 생성이 되지 않는 클래스
 * - 자식 클래스가 생성이 될 때만 생성이 된다 (간접적으로 생성됨)
 * - class 키워드 앞에 abstract 추가
 * - 최상위 클래스로 존재 (최초의 클래스 구조를 잡는 용도)
 * - final(상속x), abstract(상속해야 함) 공존x
 * - 추상 클래스에서만 추상 메서드 만들 수 있다
 */
public abstract class Animal {

	public Animal() {
		System.out.println("Animal Constructor");
	}

	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
	
	
}
