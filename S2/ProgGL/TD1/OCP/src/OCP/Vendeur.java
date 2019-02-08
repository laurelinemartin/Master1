package OCP;

public class Vendeur extends Employe {
	private double commission;

	public Vendeur(String nom, String adresse, int anciennete, double commission) {
		super(nom, adresse, anciennete);
		// TODO Auto-generated constructor stub
		this.setCommission(commission);
		this.calculSalaire();
	}

	public double getCommission() {
		return commission;}
	public void setCommission(double commission) {
		this.commission = commission;}

	//// ça marche pas trop trop
	@Override
	public void calculSalaire() {
		super.calculSalaire();
		this.setSalaire(super.getSalaire() + this.getCommission());
	}
}
