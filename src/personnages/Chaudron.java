package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public void remplirChaudron(int quantite, int forcePotion) {
		quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}
	
	public boolean resterPotion() {
		return quantitePotion > 0;
	}
	
	public int prendreLouche() {
		if (quantitePotion >= 1) {
			quantitePotion--;
		}
		else {
			forcePotion = 0;
		}
		return forcePotion;
	}
}

