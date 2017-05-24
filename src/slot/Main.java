package slot;

public class Main {

	public static void main(String[] args) {
		
		Main director = new Main();
		director.startScenario();
	}
	
	void startScenario(){
		System.out.println("Director : 박성민을 생성합니다.");
		Human ParkSeongMin = new Human();
		
		System.out.println("Director : 카지노 직원을 생성합니다.");
		Staff employee = new Staff();
		
		System.out.println("박성민 : 카지노에 놀러갑니다.");
		System.out.println("박성민 : 카지노직원에게 빈 슬롯을 물어봅니다.");
		
	}

}
