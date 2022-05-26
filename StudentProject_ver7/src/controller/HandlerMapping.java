package controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {	}

	public static HandlerMapping getInstance() {
		if(instance == null)
			instance = new HandlerMapping();
		return instance;
	}

	public Controller createController(int no) {
		Controller controller = null;
		
		switch (no) {
		case 1 :
			controller = new RegisterStudentController();
			break;
		case 2 :
			 controller = new SearchStudentController();
			 break;
		case 3 :
			controller = new UpdateStudentcontroller();
			break;
		case 4 : 
			controller = new DeleteStudentcontroller();
			break;
		case 5 :
			controller = new PrintAllStudentController();
			break;
		case 6 : 
			controller = new SelectTopStudentController();
			break;
		case 7 :
			controller = new SelectMajorAvgScoreController();
			break;
		case 8 :
			controller = new SelectScholarshipStudentController();
		}
		
		
		return controller;
	}
}








