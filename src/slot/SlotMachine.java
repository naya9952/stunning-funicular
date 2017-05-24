package slot;

public class SlotMachine {
	
	protected int insertMoney;
	public int random;
	public Human user;
	public boolean able_game;
	public SlotMachine() {
		this.able_game = true;
	}
	
	public int startRandom(){
		
		return random;
	}

	public boolean check() {
		if (able_game == true)
		{
			System.out.println("슬롯머신 : 게임을 할 수 있습니다.");
		}
		else
		{
			System.out.println("슬롯머신 : 게임을 할 수 없습니다.");
		}
		return able_game;
		
	}
	
	 
}
