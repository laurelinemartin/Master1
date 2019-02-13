package Annuaire;

import java.time.LocalDate;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numero num = new Numero();
		num.add(123456);
		LocalDate Naissance = LocalDate.of(1997, 6, 27);
		Personne p =
			new Personne.Builder("Martin",
					"Laureline", 
					"Etudiante", 
					Naissance)
			.Numero(num)
			.build();
		p.afficherPersonne();
		
	}

}
