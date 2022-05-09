package constructor;

public class Student {
//변수 선언
	String id;
	String name;
	String major;
	double grade;
	
//생성자 - 학번, 이름, 학과, 평점
	Student(String n, String m, String i, double g){
		id=n;
		name=m;
		major=i;
		grade=g;
	}
}
