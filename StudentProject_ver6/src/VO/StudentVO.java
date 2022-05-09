package VO;

import java.io.Serializable;

//vo class
//정보를 담고있는 클래스
public class StudentVO implements Serializable{ 

	public String id;
	public String name;
	public String major;
	public double point;

	public StudentVO(String id, String name, String major, double point) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
		this.point = point;
	}

//set, get
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public void printStudentInfo() {
		System.out.print("학번 : " + id);
		System.out.print("이름 : " + name);
		System.out.print("학과 : " + major);
		System.out.println("평점 : " + point);

	}


@Override //학번중복검색
public boolean equals(Object obj) {
	if(obj == null) return false;
	if(obj == this) return true;
	
	if(obj instanceof String) {
		return id.equals(obj); //같으면 true, 다르면 false
	}
	else if (obj instanceof StudentVO) {
		return id.equals(((StudentVO)obj).getId());
	}
	return super.equals(obj);
}
}
