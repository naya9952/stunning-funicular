package slot;

public class Main {

	public static void main(String[] args) {
		
		Main director = new Main();
		director.startScenario();
	}
	
	void startScenario(){
		System.out.println("Director : �ó������� �����մϴ�.");
		System.out.println("Director : ���Ըӽ��� �����մϴ�.");
		SlotMachine slot = new SlotMachine();
		
		System.out.println("Director : �ڼ����� �����մϴ�.");
		Human ParkSeongMin = new Human(slot);	
		
		System.out.println("�ڼ��� : ī���뿡 ����ϴ�.");
		System.out.println("�ڼ��� : ���Ըӽ��� �ڸ��� ���ִ��� �˾ƺ��ϴ�.");
		ParkSeongMin.check();
		
		System.out.println("�ڼ��� : ���Ըӽ��� ��Ģ�� ����ϴ�");
		ParkSeongMin.ask_rule();
		
		ParkSeongMin.insert_money();
		System.out.println("���Ըӽ� : ������ �����մϴ�.");
		System.out.println("���Ըӽ� : ���� �ݾ��� X�� �Ǿ����ϴ�.");
		System.out.println("�ڼ��� : �ݾ��� ����մϴ�.");		
	}

}
