public abstract class Guess {
	protected int score;

	public abstract void PrintClue();
	public abstract int CalculateScore();
	//public abstract boolean isBetter();

	public int GetScore() {
		return score;
	}

	public void SetScore(int _score) {
		score = _score;
	}
}