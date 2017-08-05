// DashNBash.java

// yang harus di-include :
// 1. Turn
// 2. PlayerDash

import java.util.Scanner;

public class DashNBash {
	private static int MAX_TURN = 100;
	private Turn[] T;
	
	public DashNBash(){
		T = new Turn[MAX_TURN];
		Battle();
	}
	
	public int GetTurn(){
		return 0;
	}
	
	public void Battle(){
		// 1. array of turn, turn 1,3,5... utk pemain pertama; turn 2,4,6.. pemain kedua
		// 2. dalam satu turn akan dirandom 3 move kemudian pemain memilih salah satu move
		// 3. permainan belum berakhir selama turn belum habis dan hp masing2 pemain belum habis
		// 4. permainan berakhir jika turn sudah habis dan hp pemain terbanyak yg menang
		// 5. atau salah satu pemain sudah mati atau kehabisan hp
		
		//KAMUS
		String name1, name2;
		int HP = 100;
		int hiScore = 0;
		int i,n;
		
		// masukkan nama pemain
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan nama player pertama: ");
		name1 = sc.nextLine();
		System.out.println("Masukkan nama player kedua: ");
		name2 = sc.nextLine();
		PlayerDash P1 = new PlayerDash(name1, hiScore, HP);
		PlayerDash P2 = new PlayerDash(name2, hiScore, HP);
		
		i = 1;
		while(i <= MAX_TURN && P1.GetHP() > 0 && P2.GetHP() > 0){
			T[i].randomMove();
			// pemain memasukkan pilihan move : 1,2,3 : n
			// while ()
				n = 1;
				if (T.length % 2 == 1){
					P1.SetHP(P1.GetHP() - T[i].GetMove(n).GetDamage());
				} else {
					P2.SetHP(P2.GetHP() - T[i].GetMove(n).GetDamage());
				}
		}
		if (i > MAX_TURN){
			if (P1.GetHP() > P2.GetHP()){
				System.out.println("Player" + P1.GetName() + "wins!");
			} else {
				System.out.println("Player" + P2.GetName() + "wins!");
			}
		} else if (P1.GetHP()<=0){
			System.out.println("Player" + P2.GetName() + "wins!");
		} else {
			System.out.println("Player" + P1.GetName() + "wins!");
		}
		
	}

	
}