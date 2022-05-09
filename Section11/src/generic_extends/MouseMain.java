package generic_extends;

public class MouseMain {

	public static void main(String[] args) {
		ImportMouse<GamingMouse> mouse1 = new ImportMouse<GamingMouse>(new GamingMouse());
		mouse1.click(1);
		mouse1.click(2);
		mouse1.click(3);
		mouse1.wheel();
		
		// ImportMouse에 office마우스 등록
		// ImportMouse<OfficeMouse> mouse2 = new ImportMouse<OfficeMouse>(new OfficeMouse());
		// OfficeMouse에 implements 안했기때문에 오류 (OfficeMouse는 Mouse를 안받았기 때문에 등록이 안됨)
		
		
	
	
	}

}
