import java.util.Random;
import java.util.Scanner;

public class GuessNumber implements Clue {
	private int num;
	private static int MIN_RANGE = 1;
	private static int MAX_RANGE = 100;

	public GuessNumber() {
		num = 0; 
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

	public void printClue() {
		int n = GenerateNum();
		int m = ReadNum();
		if (n < m) {
			System.out.println("The number you entered is lesser.");
		} else if (n > m){
			System.out.println("The number you entered is greater.");
		} else {
			System.out.println("Correct! The secret number is " + n);
		}
	}
}