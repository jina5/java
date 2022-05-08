package constructor;

public class NameCard {

	// 이름 회사명 연락처 이메일 직급 주소

	String name;
	String corp;
	int phone;
	String mail;
	String grade;
	String address;
	// 생성한 변수 = field
	
	//생성자 자동생성
	//source 단축키 : alt shift s
	//constructor from super class (source - c)
	public NameCard() {
	}
	
	public NameCard(String name, String corp, int phone) {
		super();
		this.name = name;
		this.corp = corp;
		this.phone = phone;
	}

	//constructor using field (source - o)
	public NameCard(String name, String corp, int phone, String mail, String grade, String address) {
		super();
		this.name = name;
		this.corp = corp;
		this.phone = phone;
		this.mail = mail;
		this.grade = grade;
		this.address = address;
	}

}
