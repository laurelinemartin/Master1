package Annuaire;

import java.util.ArrayList;
import java.util.List;

public class Numero {
	private int Numero;
	private ArrayList<Integer> listNumeros;
	private int taille;
	
	public Numero() {
		this.taille = 0;
		listNumeros = new ArrayList<>();
	}

	public int getNumero() {
		return Numero;}
	public void setNumero(int numero) {
		Numero = numero;}
	public int getTaille() {
		return taille;}
	public void setTaille(int taille) {
		this.taille = taille;}

	public Numero add(int Num) {
		// this.listNumeros.add(Numero);
		this.Numero = Num;
		this.setTaille(this.getTaille()+1);
		return this;
	}
	
	public void afficher() {
		System.out.println("Numero : "+this.Numero);
	}

}
