package zadacha2;

public class ClassMain {
	public static void main(String[] args) {
		Fakultet f1 = new Fakultet();
		f1.nazivNaFakultet = "FIKT";
		f1.brojNaSmerovi = 4;
		f1.brojNaStudenti = 250;
		f1.dekan = "Ana Aneska";
		f1.sediste = "Bitola";
		f1.prvMetod();
		System.out.println("Namalen broj na studenti:" + f1.vtorMetod(20));
		f1.tretMetod();
		
		Fakultet f2 = new Fakultet();
		f2.nazivNaFakultet = "FINKI";
		f2.brojNaSmerovi = 5;
		f2.brojNaStudenti = 400;
		f2.dekan = "Rome Romeski";
		f2.sediste = "Bitola";
		f2.prvMetod();
		System.out.println("Namalen broj na studenti:" + f1.vtorMetod(50));
		f2.tretMetod();
	}
}
