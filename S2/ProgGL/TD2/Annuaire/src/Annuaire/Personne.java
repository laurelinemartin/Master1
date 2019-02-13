package Annuaire;

import java.util.List;
import java.util.ArrayList;

public final class Personne {
	private String Nom;
	private String Prenom;
	private String Fonction;
	private java.time.LocalDate dateNaissance;
	private Numero Numero;
	
	public static class Builder{
		private String Nom;
		private String Prenom;
		private String Fonction;
		private java.time.LocalDate dateNaissance;
		
		private Numero Numero = null;	
		
		public Builder(String Nom, String Prenom, String Fonction, java.time.LocalDate dateNaissance) {
			this.Nom = Nom;
			this.Prenom = Prenom;
			this.Fonction = Fonction;
			this.dateNaissance = dateNaissance;
		}
		
		public Builder Numero(Numero Numero) {
			this.Numero = Numero;
			return this	;
		}
		
		public Personne build() {
			return new Personne(this);
		}
	}
	
	public Personne(Builder builder) {
		this.Nom = builder.Nom;
		this.Prenom = builder.Prenom;
		this.dateNaissance = builder.dateNaissance;
		this.Numero = builder.Numero;
	}
	
	

}
