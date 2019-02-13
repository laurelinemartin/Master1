package Annuaire;

public class Numero {
	private int Numero;
	
	public Numero() {}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}
	
	public Numero add(Numero Num) {
		this.setNumero(Num.getNumero());
		return this;
	}

}
