// Turn.java

public class Turn {
	private static int nTurn;
	private Moves M[];
	
	public Turn(){
		M = new Moves[100];
		nTurn++;
	}
	
	public int Random(){
		return 0;
	}
	
	public int GetNTurn(){
		return nTurn;
	}
}