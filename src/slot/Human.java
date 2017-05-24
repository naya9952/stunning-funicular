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
			System.out.println("슬롯머신 : 빈 자리입니다.");
		}
		else {
			System.out.println("슬롯머신 : 사용자가 이미 있습니다.");
		}
	}
}
