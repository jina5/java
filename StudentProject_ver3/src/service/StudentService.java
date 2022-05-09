	package service;

import VO.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();
	private StudentVO[] arr;
	private int index;

	private StudentService() {
		arr = new StudentVO[10];
		index = 0;
		arr[index++] = new StudentVO("000123", "홍길동", "경제학과", 3.2);
		arr[index++] = new StudentVO("000123", "홍길동", "경제학과", 3.23);
		arr[index++] = new StudentVO("004133", "김길동", "경영학과", 2.84);
		arr[index++] = new StudentVO("052322", "박길동", "회계학과", 3.32);
		arr[index++] = new StudentVO("032123", "오길동", "국사학과", 4.01);
	}

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}

	public void registerStudent(StudentVO vo) {
		if (index == arr.length) {
			System.out.println("더이상 저장할 공간이 없습니다");
			return;
		}
		arr[index++] = vo;
		System.out.println("학생정보 등록이 완료되었습니다...");
	}


	

	public StudentVO[] getArr() {
		return arr;
	}


	public int getIndex() {
		return index;
	}

	
	
	public StudentVO searchStudent(String id) {

		for (int i = 0; i < index; i++) {

			if (arr[i].getId().equals(id)) {
				System.out.println("조회한 학생 정보 ↓");
				return arr[i];
			}
		}
		System.out.println("입력한 학번에 대한 학생 정보가 없습니다.");
		return null;
	}

	
	public boolean deleteStudent(String id) {
		boolean flag = false;
		for (int i = 0; i < index; i++) {
			if (id.equals(arr[i].getId())) // true면 삭제할 데이터 있음
				flag = true; //삭제할 데이터 있음 -> flag = true 
			while (i < index) {
				arr[i] = arr[i + 1];
				i++;
			}
			index--;
			System.out.println("삭제 작업을 완료하였습니다.");
		}
		return flag;
	}

	public StudentVO firstStudent() {
		if (index==0) return null;
		StudentVO max = arr[0]; 
		for (int i = 0; i < index; i++) {
			if (max.getPoint() < arr[i].getPoint())
				max = arr[i]; 
		} 
		return max;
	}
	public double AverageStudent() {
		double sum = 0;
		for (int i = 0; i < index; i++) {
			sum += arr[i].getPoint();
		}
		double avg = sum / index;
		return avg;
	}
}
