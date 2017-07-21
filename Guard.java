//Guard.java

public class Guard extends Moves {
	public Guard (String sfx, int damage){
		super(sfx, 3);
	}
	
	@Override
	public void PrintSFX(){
		super.PrintSFX();
		System.out.println("guard!!!");
	}
	
}