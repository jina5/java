package ramda;

public class RamdaEx2 {

	public static void calc(int n1, int n2, Calculator cal) {
		System.out.println(cal.calc(n1, n2));
	}	
	
	public static void main(String[] args) {
		
		
		calc(10,20,new Calculator() {
			@Override
			public int calc(int x, int y) {
				return x-y;
			}
		});
		
		
		calc(5,7,(n1, n2) -> n1*n2);
		
		
	}

}
