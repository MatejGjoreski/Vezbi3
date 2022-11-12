package zadacha4;

public class Brojach {
	public int x = 0;
	public int y = 0;
	public int  Zgolemuvanjezax(){
		x = x + 1;
		return x;
	}
	public int Zgolemuvanjezay() {
		y = y + 1;
		return y;
	}
	public void Reset() {
		x = 0;
		y = 0;
	}
	public void Flip(int b) {
		System.out.println("Kolku pati da se frli parichkata?");	
    	for (int i = 0; i < b; i++) {
    		if (Math.random() < 0.5) {
    			System.out.println("Glava");
    			Zgolemuvanjezax();
    		}
    		else {
    			System.out.println("Pismo");
    			Zgolemuvanjezay();
    		}
    	}
    	System.out.println("Glava: " + x);
    	System.out.println("Pismo: " + y);
	}
}
