import java.util.Random;
import java.util.Scanner;

public class MegaBash {
	public static void main(String[] args) {
		System.out.println("MMMM   MMMM   EEEEE    GGGG       AAA     BBBBB       AAA      SSSS   HH  HH");
		System.out.println("MM  MMM  MM   EE      GG         AA AA    BB   BB    AA AA    SS      HH  HH");
		System.out.println("MM   M   MM   EEEEE   GG    GG  AAAAAAA   BBBBBB    AAAAAAA    SSSS   HHHHHH");
		System.out.println("MM   M   MM   EE       GG  GG  AA     AA  BB   BB  AA     AA      SS  HH  HH");
		System.out.println("MM   M   MM   EEEEE     GGGG  AA       AA BBBBBB  AA      AA  SSSSS   HH  HH");
		System.out.println("===============================================================================");
		System.out.println("===============================================================================");
		System.out.println("																				");
		System.out.println("																				");
		System.out.println("1. Guess Number!");
		System.out.println("																				");		
		System.out.println("2. Guess Word!");
		System.out.println("																				");
		System.out.println("3. DASHnBASH!!");	
		System.out.println("																				");
		System.out.println("																				");
		Guess n = new GuessNumber();
		// int input, guess;
		// input = g.ReadNum();
		// guess = g.GenerateNum();
		n.PrintClue();
	}
}