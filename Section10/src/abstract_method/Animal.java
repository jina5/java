package abstract_method;
/*
 * 추상 메서드(abstract method) - 상속받으면 반드시 오버라이딩해라!
 * - 메서드 구현부가 없음
 * - 상속받는 클래스가 생성이 되려면 반드시 재정의(재구현, overriding)
 * - 만약 추상메서드를 자식 클래스가 재정의하지않으면 자식클래스도 추상클래스로 만들어야 함
 * - 추상메서드는 반드시 추상 클래스에서만 정의 할 수 있음
 * - 메모리 할당 x -> 오버라이딩으로 구현하면 메모리 할당 됨
 */

public abstract class Animal {

	public abstract void eat(); // 구현부 { } 없음

}
