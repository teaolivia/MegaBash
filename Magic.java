// Magic.java

public class Magic extends Moves {
	public Magic (String sfx, int damage){
		super(sfx, 10);
	}
	
	@Override
	public void PrintSFX(){
		super.PrintSFX();
		System.out.println("Magic!!!");
	}

}