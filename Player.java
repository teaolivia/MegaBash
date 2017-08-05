// Player.java

public class Player {
	private String name;
	private int hiScore;
	
	public Player(String name, int hiScore){
		this.name = name;
		this.hiScore = hiScore;
	}
	
	public int GetHiScore(){
		return hiScore;
	}
	
	public void SetHiScore(int hiScore){
		this.hiScore = hiScore;
	}
	
	public String GetName(){
		return name;
	}
	
	public void SetName(String name){
		this.name = name;
	}
	
	public void PrintInfo(){
		System.out.println("Name : " + name);
		System.out.println("Highest Score : " + hiScore);
	}

}