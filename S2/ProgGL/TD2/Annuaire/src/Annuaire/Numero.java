package Annuaire;


public class Numero {
	private String Fonction;
	private int Indicatif;
	private int Numero;
	
	public Numero() {
	}

	public int getNumero() {
		return Numero;}
	public void setNumero(int numero) {
		Numero = numero;}

	public Numero add(String fonction, int indicatif, int Num) {
		this.Fonction = fonction;
		this.Indicatif = indicatif;
		this.Numero = Num;
		return this;
	}
	
	public void afficher() {
		System.out.println("\t Fonction : " +this.Fonction);
		System.out.println("\t Indicatif : +"+this.Indicatif);
		System.out.println("\t Numero : "+this.Numero);
	}

}
