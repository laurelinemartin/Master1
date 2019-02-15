package Annuaire;

import java.util.ArrayList;

public class Groupe extends AbstractGroupe {
	
	private ArrayList<AbstractGroupe> groupe = new ArrayList<AbstractGroupe>();
	
	public Groupe() {
	}
	
	@Override
	public void affichageProfondeur() {
		for(AbstractGroupe ag : groupe) {
			ag.affichageProfondeur();
		}
	}
	
	@Override
	public void affichageLargeur() {	
	}
	
	public void add(AbstractGroupe gr) {
		this.groupe.add(gr);
	}

}
