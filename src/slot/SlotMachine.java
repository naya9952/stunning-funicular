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
			System.out.println("���Ըӽ� : ������ �� �� �ֽ��ϴ�.");
		}
		else
		{
			System.out.println("���Ըӽ� : ������ �� �� �����ϴ�.");
		}
		return able_game;
		
	}
	
	 
}
