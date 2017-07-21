// Punch.java

public class Punch extends Moves {
	
	public Punch (String sfx, int damage){
		super(sfx,3);
	}
	
	@Override
	public void PrintSFX(){
		super.PrintSFX();
		System.out.println("punch!!!");
	}
}