import java.io.File;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.Scanner;
import java.util.Random;

public class GuessWord implements Print extends Guess, IOException{
	public String word;

	public GuessWord() {
		word = "this is word";
		try {
			File dict = new File("word_dictionary.txt");
		} catch (IOException e) {
			System.out.printf("File doesn't exists\n");
		}	
	}

	public String GenerateWord() {
		Scanner sc = new Scanner(dict);

		StringBuilder sb = new StringBuilder(word);
		return word;
	}

	public String ReadWord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Guess me! ");
		String in = sc.nextLine();
		return in;
	}

	public void PrintClue() {

	}

	public int CalculateScore() {
		score++;
		return score;
	}

	public void PrintInstruction() {
		
	}
}