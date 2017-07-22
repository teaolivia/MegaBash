// Turn.java

public class Turn {
	private static int MAX_MOVES = 100;
	private static int nTurn;
	private Moves M[];
	
	public Turn(){
		M = new Moves[MAX_MOVES];
		nTurn++;
	}
	
	public int Random(){
		return 0;
	}
	
	public int GetNTurn(){
		return nTurn;
	}
}