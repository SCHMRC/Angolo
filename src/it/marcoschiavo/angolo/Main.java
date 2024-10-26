package it.marcoschiavo.angolo;

public class Main {
	
	public static void main(String args[]) {
		Angolo angolo = new Angolo(10,1,10);
		Angolo angolo2 = new Angolo(1,1,10);
		System.out.println(angolo.angoloSecondi());
		System.out.println(angolo2.angoloSecondi());
		
		System.out.println(angolo.differenzaSecondi(angolo2));
	}


}
