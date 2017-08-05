// Turn.java

public class Turn {
	private static int MAX_MOVES = 100;
	private static int nTurn;
	private Moves M[];
	
	public Turn(){
		M = new Moves[MAX_MOVES];
		nTurn++;
	}
	
	public void randomMove(){
		Random generateMove = new Random();
		for (int i = 1; i <= 3; i++){
			int idx = generateMove.nextInt(M.length);
			// System.out.println("Move generated: " + Moves[idx]);
		}
	}
	
	public void addMove(){
		// 
	}
	
	public int GetNTurn(){
		return nTurn;
	}
}