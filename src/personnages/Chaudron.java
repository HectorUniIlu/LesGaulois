package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public Chaudron() {
		;
	}
	
	public void remplirChaudron(int quantite, int forcePotion) {
		quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}
	
	public Boolean resterPotion() {
		return quantitePotion > 0;
	}
	
	public int prendreLouche() {
		if (quantitePotion >= 1) {
			quantitePotion -= 1;
		}
		else {
			forcePotion = 0;
		}
		return forcePotion;
	}
}

