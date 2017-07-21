// Heal.java

public class Heal extends Moves {
	public Heal(String sfx, int damage){
		super(sfx, 10);
	}
	
	@Override
	public void PrintSFX(){
		super.PrintSFX();
		System.out.println("Heal!!!");
	}

}