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
			System.out.println("���Ըӽ� : �� �ڸ��Դϴ�.");
		}
		else {
			System.out.println("���Ըӽ� : ����ڰ� �̹� �ֽ��ϴ�.");
		}
	}
}
