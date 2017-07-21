import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber extends Guess implements Print {
	private int num;
	private static int MIN_RANGE = 1;
	private static int MAX_RANGE = 100;

	public GuessNumber() {
		num = 0;
		score = 0;
		PrintInstruction();
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

	public void PrintInstruction() {		
		// try {
		// 	InputStream input = new BufferedInputStream(new FileInputStream("instruction_guessNumber.txt"));
		// 	byte[] buffer = new byte[8192];
		//     for (int length = 0; (length = input.read(buffer)) != -1;) {
		//         System.out.write(buffer, 0, length);
		//     }
		// } finally {
		//     input.close();
		// }
		try (BufferedReader br = new BufferedReader(new FileReader("instruction_guessNumber.txt"))){
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("FILE NOT FOUND");
		}
	}
}