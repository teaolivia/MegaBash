// Kick.java

public class Kick extends Moves {
	public Kick(String sfx, int damage){
		super(sfx, 5);
	}
	
	@Override
	public void PrintSFX(){
		super.PrintSFX();
		System.out.println("Kick!!!");
	}
	
}