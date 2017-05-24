package slot;

public class Main {

	public static void main(String[] args) {
		
		Main director = new Main();
		director.startScenario();
	}
	
	void startScenario(){
		System.out.println("Director : 시나리오를 시작합니다.");
		System.out.println("Director : 슬롯머신을 생성합니다.");
		SlotMachine slot = new SlotMachine();
		
		System.out.println("Director : 박성민을 생성합니다.");
		Human ParkSeongMin = new Human(slot);	
		
		System.out.println("박성민 : 카지노에 놀러갑니다.");
		System.out.println("박성민 : 슬롯머신의 자리가 비여있는지 알아봅니다.");
		ParkSeongMin.check();
		
		System.out.println("슬롯머신 : 규칙을 알려줍니다.");
		System.out.println("박성민 : 슬롯머신에 돈을 투입합니다.");
		System.out.println("슬롯머신 : 배팅을 시작합니다.");
		System.out.println("슬롯머신 : 배팅 금액의 X배 되었습니다.");
		System.out.println("박성민 : 금액을 출금합니다.");		
	}

}
