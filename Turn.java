// Turn.java

import java.util.Random;

public class Turn {
	private int MAX_MOVES = 5;
	private static int nTurn = 1;
	private Moves M[];
	
	public Turn(){
		M = new Moves[MAX_MOVES];
		nTurn++;
	}
	
	public void randomMove(){
		Random generateMove = new Random();
		for (int i = 1; i <= 3; i++){
			int idx = generateMove.nextInt(M.length);
			
			System.out.println(i + "Pilih salah satu move: " + M[idx]);
		}
	}
	
	public Moves GetMove(int i){
		return M[i];
	}
	
	public void addMove(){
		// 
	}
	
	public int GetNTurn(){
		return nTurn;
	}
}