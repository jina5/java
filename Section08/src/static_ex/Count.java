package static_ex;

public class Count {

	private int count=0; //이렇게까지하면 count가 누적이 안됨.. 
	public static int total_count = 0; //static 누적 됨
	//private static ~이면 에러
	//static이면 반드시 public 인건 아님
	private static String str = "" ;
	
	
	public Count() { //생성자
		count++;
		total_count++;
		str+="★";
	System.out.println(count+" "+total_count);

	}

	public static String getStr() { //static이 없으면 클래스로 못가져옴 c1.getstr은 되는데 count.getstr도 되게 하려면 static 추가
		return str;
	}
	
	public void addCount() { //non-static
		total_count++;  //static
		//non-static은 static에 언제든지 접근이 가능
		//non-static이 실행되는 시점에서는 static은 이미 메모리에 생성되어있다.
		
	}
	
	public static void addFieldCount() { //static		 
//      Count++;     //non-static
		// 에러
		// static은 실행과 동시에 만들어짐, count는 new 해야하기때문에 count중 어떤건지 아직 모른다
		// static은 non-static에 접근이 불가능하다
		// static이 사용되는 시점에 non-static은 생성되지 않을수도 있고, 
		// 어떤 객체의 대상인지 구분이 불가능
	}

	
	
	
}
