// DashPlayer.java

public class PlayerDash extends Player {
	private int HP;
	
	public PlayerDash(String name, int hiScore, int HP){
		super(name, hiScore);
		this.HP = HP;
	}
	
	public int GetHP(){
		return HP;
	}
	
	public void SetHP(int HP){
		this.HP = HP;
	}
	
	@Override
	public void PrintInfo(){
		super.PrintInfo();
		System.out.println("HP : " + HP);
	}
}