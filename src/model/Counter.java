package model;

public class Counter {
	private int compteur;
	
	public Counter(){
		this.compteur = 0;
	}
	
	public void inc(){
		this.compteur++;
	}
	
	public int getCompteur(){
		return compteur;
	}
}
