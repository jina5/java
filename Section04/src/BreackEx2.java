import java.util.Scanner;

public class BreackEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0, sum=0, count=0;
		
		while(true) {
			System.out.println("숫자 입력:");
			num=sc.nextInt();
			if(num==0)
			break;
			
			sum+=num;
			count++; //마지막에 count --할 필요 없음
			
		}
System.out.println(sum);
System.out.println(sum/(double)count);
	}

}
