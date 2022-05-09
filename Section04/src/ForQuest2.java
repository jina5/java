import java.util.Scanner;

public class ForQuest2 {
/*
 * 숫자 0을 입력할 때까지
 * 정수를 입력 받아서
 * 0을 입력을 하면 입력한 숫자들의 총합과 평균을 출력
 * 
 * 숫자입력 : 1
 * 숫자입력 : 5
 * 숫자입력 : -1
 * 숫자입력 : 2
 * 숫자입력 : 0
 * 
 * 총합: 7
 * 평균 : 1.75
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
//내가한것
		float total=0;
		int i=0;
		for(int n = sc.nextInt();n!=0;)
		{
		total+=n;
		i++;
		System.out.print("숫자 입력: ");
		n = sc.nextInt();
	}
		System.out.println("총합 : "+ total); //(int) 앞에 넣으면 형변환
		System.out.println("평균 : "+ total/i);
		
	}
//	
//다른방법
//	int num=1; //입력받을 변수, 처음에 0아니면 됨 (선검사 후처리)
//	int sum=0, count=0;
//	for (;num!=0;) {
//		System.out.println("숫자 입력:");
//		num = sc.nextInt();
//		sum+=num;
//		count++;}
//		count--; //숫자0은 갯수에서 제외 (1개뺌)
//		System.out.println("총합 :"+sum);
//		System.out.println("평균 :"+sum/(double)count);
//		
//}
}