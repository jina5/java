package event;

public class ClickEvent implements View.OnClickListener{//interface가져와서 구현

	@Override
	public void onClick(View view) {
			System.out.println(view.name+"클릭 이벤트생성"); //view.name : protected -> 외부접근 가능
	} 
	
	

}
