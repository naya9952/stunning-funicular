package slot;

public class Main {

	public static void main(String[] args) {
		
		Main director = new Main();
		director.startScenario();
	}
	
	void startScenario(){
		System.out.println("Director : �ڼ����� �����մϴ�.");
		Human ParkSeongMin = new Human();
		
		System.out.println("Director : ī���� ������ �����մϴ�.");
		Staff employee = new Staff();
		
		System.out.println("�ڼ��� : ī���뿡 ����ϴ�.");
		System.out.println("�ڼ��� : ī������������ �� ������ ����ϴ�.");
		
	}

}
