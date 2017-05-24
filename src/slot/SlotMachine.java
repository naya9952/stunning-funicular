package slot;

public class SlotMachine {
	
	protected int insertMoney;
	public int random;
	public Human user;
	public boolean able_game;
	public SlotMachine() {
		this.able_game = false;
	}
	
	public int startRandom(){
		
		return random;
	}

	public void check() {
		
	}
}
