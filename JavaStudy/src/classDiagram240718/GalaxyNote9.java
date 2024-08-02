package classDiagram240718;

public class GalaxyNote9 extends SmartPhone implements NotePen {

	
	
	public GalaxyNote9() {
		super();
		this.setMaker("삼성");
	}
	
	@Override
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}
	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}

	@Override
	public String takeCall() {
		return "수신버튼을 누름";
	}

	@Override
	public String picture() {
		return "1300만 듀얼카메라";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "정전식, 와콤펜 지원";
	}

	
	
	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String printInfomation() {
		String result = "";
		result += (this.getMaker() + "갤럭시 노트9은 삼성에서 만들어졌고 제원은 다음과 같다.\n");
		result += (this.makeCall() + "\n");
		result += (this.takeCall() + "\n");
		result += (this.picture() + "\n");
		result += (this.charge() + "\n");
		result += (this.touch() + "\n");
		result += (this.bluetoothPen() );
		
		return result;
	}

	
	
	
}
