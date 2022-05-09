package string;

public class StringBuilderTest { //StringBuilder문자열 누적하거나 계속해서 변경시켜야할 때 좋음

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello World");
		System.out.println(str);
		str.append(100); //데이터 붙이면 그대로 저장됨
		System.out.println(str);
		str.append("JAVA");
		System.out.println(str);
		//시작위치, 마지막위치
		str.replace(0, 5, "TEST");
		System.out.println(str);
		str.delete(5, 10);
		System.out.println(str);
	
	
	
	}

}
