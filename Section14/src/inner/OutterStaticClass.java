package inner;

public class OutterStaticClass {

	private int outter;
	private static double n = 23.4551;

	public OutterStaticClass(int outter) {
		this.outter = outter;
	}

	public static class InnerStaticClass {
		private int i;

		public InnerStaticClass(int i) {
			this.i = i;
		}

		public int sum() {
//			return i+outter; //outter가 none static이기때문에 접근 불가능
			return (int)(i+n); //static 접근 가능
		}
	}

}
