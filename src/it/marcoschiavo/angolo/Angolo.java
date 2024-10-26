package it.marcoschiavo.angolo;

public class Angolo {
	private int gradi;
	private int primi;
	private int secondi;
	
	/*Definizione costruttori*/
	//costruttore vuoto
	public Angolo() {}
	
	//costruttore con parametri
	public Angolo(int gradi, int primi, int secondi) {
		this.gradi = gradi;
		this.primi = primi;
		this.secondi = secondi;
		
		normalizza();
		
	}
	
	/*implementazione dei metodi getter e setter*/
	public int getGradi() {
		return this.gradi;
	}
	public void setGradi(int gradi) {
		this.gradi = gradi;
		normalizza();
	}
	
	public int getPrimi() {
		return this.primi;
	}
	
	public void setPrimi(int primi) {
		this.primi = primi;
		normalizza();
	}
	
	public int getSecondi() {
		return this.secondi;
	}
	
	public void setSecondi(int secondi) {
		this.secondi = secondi;
		normalizza();
	}
	
	
	
	
	/*Metodi da implementare*/
	
	//visualizza l’angolo nella forma g°p’s’’ 
	public String visualizzaAngolo(){
		return this.gradi + "°" + this.primi + "'"+ this.secondi+ "\"";
	} 
	
	//aggiunge all’angolo n gradi
	public void aggiungiGradi(int n) {
		setGradi(this.gradi + n);
	}
	
	//aggiunge all’angolo n primi
	public void aggiungiPrimi(int n) {
		setPrimi(this.primi + n);
	}
	
	//aggiunge all’angolo n secondi
	public void aggiungiSecondi(int n) {
		setSecondi(this.secondi + n);
	}
	
	//ritorna il valore dell’angolo espresso in secondi
	public int angoloSecondi() {
		return this.gradi * 3600 + this.primi * 60 + this.secondi;
	}
	
	//imposta il valore dell’angolo (gradi, primi e secondi) 
	//corrispondente a n secondi. 
	public void secondiAngolo(int n) {
		this.gradi = n / 3600;
		int primiSecondi =  n % 3600;
		this.primi = primiSecondi / 60;
		this.secondi = primiSecondi % 60;

	}
	
	//restituisce la differenza espressa in secondi tra l’angolo 
	//e l’angolo a 
	public int differenzaSecondi(Angolo a) {
		return angoloSecondi() - a.angoloSecondi();
	}
	
	//somma all’angolo l’angolo a
	public void sommaAngolo(Angolo a) {
		this.gradi = this.gradi + a.getGradi();
		this.primi = this.primi + a.getPrimi();
		this.secondi = this.secondi + a.getSecondi();
		normalizza();
	}
	
	private void normalizza() {
		if(this.secondi >= 60) {
			//il quoziente deve essere aggiunto ai primi
			this.primi = this.primi + this.secondi / 60;
			this.secondi = this.secondi % 60;
		}
		if(this.primi >= 60) {
			this.gradi = this.gradi + this.primi / 60;
			this.primi = this.primi % 60;
		}
		if(this.gradi >= 360) {
			this.gradi = this.gradi % 360;
		}
		
	}

}
