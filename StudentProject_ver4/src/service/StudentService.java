package service;

import java.util.ArrayList;
/**
 * 추가 생성 수정 삭제 기능
 */

import VO.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();
	private ArrayList<StudentVO> list;

	private StudentService() {
		list = new ArrayList<StudentVO>();
		list.add(new StudentVO("000123", "홍길동", "경제학과", 3.25));
		list.add(new StudentVO("000123", "홍길동", "경제학과", 3.23));
		list.add(new StudentVO("004133", "김길동", "경영학과", 2.84));
		list.add(new StudentVO("052322", "박길동", "회계학과", 3.32));
		list.add(new StudentVO("032123", "오길동", "국사학과", 4.01));
	}

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}
/**
 * 학생정보 등록하는 메서드
 * @param vo 학생정보 한건에 해당함
 * @return true면 학생정보 등록 성공, false면 학생정보 등록 실패
 */
	public boolean registerStudent(StudentVO vo) {
		// 동일한 학번이 있는 학생은 저장 못하게, 동일한 학번이 없으면 리스트에 StudentVO객체 추가 (vo에 equals)
		if (list.contains(vo)) {
			return false; // 중복된 데이터 있는지 체크
		}
		return list.add(vo);
	}

	public StudentVO searchStudent(String id) {
		StudentVO vo = new StudentVO(id, null, null, 0);
		int i = list.indexOf(vo);
		if (i == -1)
			return null;
		return list.get(i);
	}

	public boolean deleteStudent(String id) {
		return list.remove(new StudentVO(id, null, null, 0));
	}

	public ArrayList<StudentVO> firstStudent() {
		StudentVO vo = new StudentVO(null, null, null, 0);
		if (list.isEmpty())
			return null;
		
		StudentVO max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (max.getPoint() < list.get(i).getPoint())
				max = list.get(i);
		}
		ArrayList<StudentVO> result = new ArrayList<StudentVO>(); // 점수 최대값과 같은 StudentVO를 Result에 추가
		for (int i = 0; i < list.size(); i++) {
			if (max.getPoint() == list.get(i).getPoint())
				result.add(list.get(i));
		}
		return result;
	}

	public ArrayList<StudentVO> getList() {
		return list;
	}



}
