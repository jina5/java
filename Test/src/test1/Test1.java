package test1;
/*
 * A-a .... Z-z 표현
 */

public class Test1 {

	public static void main(String[] args) {
//내가한것
//		int i=65; //A=65, a=97
//		while (i<91) {
//			System.out.println((char)i+"-"+(char)(i+32));
//			i++;
		
//다른방법
//		for(char ch='A';ch<='Z';ch++) {
//			char temp=(char)(ch+32);
//			System.out.println(ch+"-"+temp);
		
//다른방법
		for(char ch1='A',ch2='a';ch1<='Z';ch1++,ch2++)
			{System.out.println(ch1+"-"+ch2);
			
		}

	}

}
