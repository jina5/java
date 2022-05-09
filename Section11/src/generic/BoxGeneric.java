package generic;

public class BoxGeneric<T> { // T : 변수타입, 변수타입은 new BoxGeneric 할때 결정된다.
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}
