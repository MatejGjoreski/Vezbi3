package zadacha1;

public class ClassMain {
	public static void main(String[] args) {
		Avtomobil av = new Avtomobil("Reno", "Laguna", "Siva", 11000, 2010, "BT-1111-AA");
		av.prvMetod();
		System.out.println(av.vtorMetod());
	}
}
