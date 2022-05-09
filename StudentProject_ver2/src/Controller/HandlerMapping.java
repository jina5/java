package Controller;

public class HandlerMapping {
//singletone
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {
	
	}

	public static HandlerMapping getInstance() {
		if(instance==null)
			instance = new HandlerMapping();
		return instance;
	}
	
	public Controller createController(int no) {
		Controller controller = null; //빈것으로 초기화
		switch (no) {
		case 1:
			controller = new RegisterController(); //handlermapping먼저 만들면 자동으로 생성되고 연결되는것이 많음.
			break;
		case 2: 
			controller = new PrintAllController(); 
			break;
		case 3 :
			controller = new UpdateController();
			break;
		case 4:
			controller = new DeleteController();
			break;
		case 5:
			controller = new SearchController();
			break;
		case 6:
			controller = new FirstController();
			break;
		case 7:
			controller = new AverageStudent();
			break;

		
		}
		return controller;
		
	}
	
	
}
