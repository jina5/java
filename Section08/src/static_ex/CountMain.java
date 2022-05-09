package static_ex;

public class CountMain {

	public static void main(String[] args) {
		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		Count c4=new Count();
		Count c5=new Count();
		//static 변수나 메서드에 접근을 할 때는 
		//해당 클래스명.변수명   or    클래스명.메서드명
		System.out.println(Count.total_count);
		System.out.println(c1.total_count); // 굳이..
		System.out.println(Count.getStr());
		
		
	}

}
