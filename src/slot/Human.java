package slot;

public class Human {
	public SlotMachine slot;
	protected int readyMoney;
	public int sendMoney(int readyMoney){
		
		
		return this.readyMoney;
	}
	public Human(SlotMachine slot){
		this.slot = slot;
	}

	public void check() {
		if(slot.check() == true){
			System.out.println("�ڼ��� : ���Ըӽſ� �ɽ��ϴ�.");
		}
		else {
			System.out.println("�ڼ��� : ����ڰ� �̹� �ֽ��ϴ�.");
		}
	}
	
	public void ask_rule() {
		System.out.println("���Ըӽ� : ��Ģ�� �˷��ݴϴ�.");
	}
	public void insert_money() {
		System.out.println("�ڼ��� : ���Ըӽſ� ���� �����մϴ�.");
		
	}
}
