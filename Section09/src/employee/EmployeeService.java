package employee;

import java.util.Scanner;

public class EmployeeService {
	private Employee[] arr;
	private int index;

	public EmployeeService() {
		index = 0;
		arr = new Employee[10];
		
		arr[index++]= new Employee("A001","오길동",200);
		arr[index++]= new SalaryEmployee("B001","김길동",200);
		arr[index++]= new SalaryEmployee("B002","한길동",300);
		arr[index++]= new DispatchEmployee("C001","박길동",200,'A');
		arr[index++]= new DispatchEmployee("C002","길길동",200,'C');

	}

	public void registerEmployee(Scanner sc) {
		// 배열 갯수 늘리고 싶으면 temp 배열 만들어서 옮긴다
		// 배열 개수 늘리기
		if(index==arr.length) { //배열 꽉 차면 늘리자
		Employee[] temp= arr;
		arr = new Employee[arr.length+3];
		for(int i=0;i<temp.length;i++) //arr.length로 하면 데이터 짤린다
			arr[i]=temp[i];
		}
		// 사원정보 등록
		// 1-일반사원, 2-영업직, 3-파견직 구분해서 입력 받은 후 arr에 객체를 생성해서 등록
		System.out.println("사원 정보를 등록을 시작합니다....");
		System.out.print("1- 일반사원, 2- 영업직, 3- 파견직중에 번호를 선택하세요 : ");
		int part = sc.nextInt();
		sc.nextLine(); // 숫자입력뒤에 꼭 해주기
		System.out.print("사번 : ");
		String eno = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("기본급 : ");
		int salary = sc.nextInt();
		sc.nextLine(); // 숫자입력뒤에 꼭 해주기 

		switch (part) { // 나중에 항목이 추가될 수 있음, 확장성을 생각해서 switch가 낫다

		case 2:
			System.out.println("영업포인트 : ");
			int point = sc.nextInt();
			sc.nextLine();
			arr[index++] = new SalaryEmployee(eno, name, point);
			break;

		case 3:
			System.out.print("위험도 : ");
			char danger = sc.nextLine().charAt(0);
			arr[index++] = new DispatchEmployee(eno, name, salary, danger);
			break;

		default:
			arr[index++] = new Employee(eno, name, salary);

		}

		System.out.println("사원 정보 등록 완료");
	}
	
	//전체 사원 정보 출려
	public void printAllEmployee() {
		for (int i = 0; i < index; i++) {
			arr[i].printEmployeeInfo();
		}
		System.out.println("-----전체 사원 정보 조회 완료-----");
	}
	}


