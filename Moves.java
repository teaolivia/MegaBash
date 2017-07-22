// Moves.java

public class Moves {
	protected String sfx;
	protected int damage;
	
	public Moves(String sfx, int damage){
		super();
		this.sfx = sfx;
		this.damage = damage;
	}
	
	public void PrintSFX(){
		System.out.println(sfx);
	}
	public int decreaseHP(){
		return 0;
	}
	
	public int GetDamage(){
		return damage;
	}
	
	public void SetDamage(int damage){
		this.damage = damage;
	}
}