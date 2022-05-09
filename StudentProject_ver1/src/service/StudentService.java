package service;

import java.util.Scanner;

import VO.StudentVO;

public class StudentService {

	private StudentVO[] arr; // 클래스가 변수타입이 됨, studentVO를 저장하는 배열 하나 생성
	private int index;

	public StudentService() { // 기본생성자
		arr = new StudentVO[10]; // studentVO 정보를 가진 메모리 주소 저장할수있는 공간 10개 생성
		index = 0;// 인덱스 초기화

		// 학생데이터 미리 4건 추가
		// index=0으로 초기화 되어있기때문에 arr[0] [1] [2] 이런식으로하면 안됨
		arr[index++] = new StudentVO("000123", "홍길동", "경제학과", 3.2); // arr[0] index++하면 기존 0에서부터 하나씩 늘어남
		arr[index++] = new StudentVO("000123", "홍길동", "경제학과", 3.23); // arr[1]
		arr[index++] = new StudentVO("004133", "김길동", "경영학과", 2.84);
		arr[index++] = new StudentVO("052322", "박길동", "회계학과", 3.32);
		arr[index++] = new StudentVO("032123", "오길동", "국사학과", 4.01);
	}

	public void registerStudent(Scanner sc) { // 스캐너 매개변수

		// 학생정보 입력받아서 저장
		if (index == arr.length) {
			System.out.println("더이상 저장할 공간이 없습니다");
			return;
		}
		System.out.println("학생 정보 등록을 시작합니다...");
		System.out.print("학번 : ");
		String id = sc.nextLine(); // 문자열 입력받기
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전공 : ");
		String major = sc.nextLine();
		System.out.print("학점 : "); // 결합도 높음
		double point = sc.nextDouble(); // 소수 입력받기
		sc.nextLine(); // 숫자입력받는 nextDouble이후 엔터를 지운다
		// sc.nextInt() sc.nextDouble() 숫자입력+엔터 - 숫자 데이터 가져간 뒤..
		// ㄴ 엔터 남아있음-> sc.nextLine() 엔터때문에 데이터가 입력되었다고 인식
		// sc.nextLine() 한번 더 넣어서 엔터 가져가도록한다(엔터를 지운다)
		// 숫자 입력 받은 뒤에 sc.nextLine() 꼭 넣기!!!

		// arr에 입력받은 정보를 이용해서 Student 생성하여 배열에 저장
		// index증가
		arr[index] = new StudentVO(id, name, major, point);
		index++;
		System.out.println("학생정보 등록이 완료 되었습니다...");
	}

	// 전체 학생정보 조회
	public void printAllStudentInfo() {
		if (index == 0) { // arr에 정보가 하나도 없을 때 index==0
			System.out.println("학생 정보가 없습니다." + "");
			return; // return안써도 상관없음. 밑에 조건 0<0 거짓이기때문에 실행 안하기때문에
		}
		for (int i = 0; i < index; i++) {
			arr[i].printStudentInfo(); // 메서드에 이미 print가 들어가있기때문에
		}
		System.out.println("-----전체 학생 정보 조회 완료-----");
	}

	// 학생 정보 조회
	public int searchStudent(Scanner sc) { // return 결과값이 int
		System.out.println("학생번호를 이용해서 학생정보 조회를 시작합니다......");
		// 학번입력
		System.out.print("학번 : ");
		String id = sc.nextLine(); // 문자열 입력받기 nextLine
		// 반복문
		for (int i = 0; i < index; i++) {
			// 배열에있는 학번을 기준으로 입력받은 값과 비교
			if (arr[i].getId().equals(id)) { // arr[i].getId() = id 데이터 읽어오기
				// 일치하면 학생정보 출력후 종료
				System.out.println("조회한 학생 정보 ↓");
				arr[i].printStudentInfo();
				return i; // 수정, 삭제할때 이용하기 위해 i값 return
				// 조회결과가 없으면 아래 메세지를 출력해야 되기때문에 break쓰지 않음
				// else로하면 false일때 멈추지 않고 계속 반복문 돈다
			}
		}
		// 조회결과가 없으면 "입력한 학번에 대한 학생 정보가 없습니다" 출력
		System.out.println("입력한 학번에 대한 학생 정보가 없습니다.");
		return -1; // -1 값 가져옴 (밑에서 i로 사용할것)
	}

	// 학생 정보 수정
	public void updateStudent(Scanner sc) {
		System.out.println("학생정보 수정을 시작합니다...");
		// 학번으로 조회 - searchStudent -> 조회결과를 인덱스로 받는다
		int i = searchStudent(sc); // search의 결과값을 i로 저장
		// 조회결과 인덱스값이 -1 -> 조회결과가 없음, 메서드 종료
		if (i == -1)
			return;
		// 조회결과가 있으면 -> 이름 학과 평점을 새로입력받아서 수정
		// set
		System.out.println("수정할 이름 : ");
		arr[i].setName(sc.nextLine());
		System.out.println("수정할 학과 : ");
		arr[i].setMajor(sc.nextLine());
		System.out.println("수정할 평점 : ");
		arr[i].setPoint(sc.nextDouble());
		sc.nextLine(); // 숫자입력후 nextline해서 엔터없애기
		System.out.println("학생 정보 수정이 완료되었습니다.");

	}

	// 학생 정보 삭제
	// index에 메모리 주소가 저장되어있는데, 이것을 다른 주소로 바꾸거나 (당기거나) null로 바꾼다
	public void deleteStudent(Scanner sc) {
		System.out.println("학생정보 삭제를 시작합니다.....");
		int i = searchStudent(sc);
		if (i == -1)
			return;
		// 배열을 i값 기준으로 하나씩 당겨오기
		while (i < index) {
			arr[i] = arr[i + 1];
			i++;
		}
		index--;
		System.out.println("삭제 작업을 완료하였습니다.");
	}

	public void firstStudent() {
		System.out.println("학점 석차 1등 조회...");
		StudentVO max = arr[0]; //배열을 불러오기 !!!!!!!
		
		for(int i=0;i<index;i++) {
			if(max.getPoint()<arr[i].getPoint())
				max = arr[i]; //max는 배열자체
		}
		System.out.println("전체석차 1등");
		System.out.println(max.name);
		max.printStudentInfo();
	}
	
	public void AverageStudent() {
		System.out.println("학생들의 학점 평균은...");
		double sum = 0;
		for(int i =0; i < index; i++) {
			sum+=arr[i].getPoint();
		}
		double avg = sum/index;
		System.out.println(avg+ " 입니다.");

	
	}

	}
