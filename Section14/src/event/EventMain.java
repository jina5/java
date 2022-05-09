package event;

public class EventMain {

	public static void main(String[] args) { // protected는 상속받은것까지 접근 가능하다고했지만 부가적으로 패키지가 똑같으면 접근 가능
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
//		btn1.onClick(); //이벤트처리 아직 안되서 실행안됨

		btn1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				System.out.println(view.name + "클릭 이벤트");
			}
		});
		
		btn1.onClick();
		btn2.setOnClickListener(new ClickEvent());
		btn2.onClick();
		btn3.setOnClickListener(new ClickEvent());
	}

}
