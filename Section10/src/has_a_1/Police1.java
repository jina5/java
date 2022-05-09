package has_a_1;
/*
 * gun을 상속받아서 has a (상속) 관계를 구현했기 때문에 확장성에서 떨어진다.
 * 다른 종류의 gun 클래스를 받을 수가 없다. (확장성 떨어짐)
 * 
 *  gun이 police에 접근가능하다 
 */
public class Police1 extends Gun {
	public void shot() {
		super.shot();
	}

	public void reload() {
		super.reload();
	}
}
