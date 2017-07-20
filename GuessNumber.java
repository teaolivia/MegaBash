import java.util.Random;
import java.util.Scanner;

public class GuessNumber extends Guess {
	private int num;
	private static int MIN_RANGE = 1;
	private static int MAX_RANGE = 100;

	public GuessNumber() {
		num = 0;
		score = 0;
	}

	public int GetNum() {
		return num;	
	}

	public int GenerateNum() {
		Random rand = new Random();
		num = rand.nextInt(MAX_RANGE) + MIN_RANGE;
		return num;
	}

	public int ReadNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Guess me! ");
		int n = sc.nextInt();
		return n;
	}

	public void PrintClue() {
		int n = GenerateNum();
		int m = ReadNum();
		while (m != n) {
			if (n < m) {
				System.out.println("The number you entered is lesser.");
			} else if (n > m){
				System.out.println("The number you entered is greater.");
			}
			m = ReadNum();
			SetScore(CalculateScore());
		}
		System.out.println("Correct! The number is " + n + " ^__^");
		System.out.println("Your score is... " + GetScore() + "!!");
	}

	public int CalculateScore() {
		score++;
		return score;
	}
}