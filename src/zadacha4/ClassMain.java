package zadacha4;

import java.util.Scanner;

public class ClassMain {
	public static void main(String[] args) {
		boolean prekin = false;
		 Scanner scanner = new Scanner(System.in);
		Brojach obj = new Brojach();
	    while (!prekin) {
	    	System.out.println("Za frlanje na parichkata vnesete 1 ");
	    	System.out.println("Za resetiranje na brojachot vnesete 2 ");
	    	System.out.println("Za izlez vnesete 0 ");
	        int a = scanner.nextInt();
	        switch (a) {
	            case 0:
	                prekin = true;
	                break;
	            case 1:
	            	System.out.println("Kolku pati da se frli parichkata?");
	            	int b = scanner.nextInt();
	            	obj.Flip(b);
	            	break;
	            case 2:
	                System.out.println("Brojachot e resetiran: ");
	                obj.Reset();
	            	System.out.println("Glava: " + obj.x);
	            	System.out.println("Pismo: " + obj.y);
	                break;
	            default:
	                System.out.println("Vnesovte nevaliden broj!");
	                break;
	        }
	    }
	    scanner.close();
	}
}

