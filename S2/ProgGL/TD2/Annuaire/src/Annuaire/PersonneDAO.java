package Annuaire;

public class PersonneDAO extends DAO<Personne>{

	@Override
	public Personne create(Personne obj) {
		return obj;
	}

	@Override
	public Personne find(String id) {
		return null;
	}

	@Override
	public Personne update(Personne obj) {
		return obj;
	}

	@Override
	public void delate(Personne obj) {}
	
}
