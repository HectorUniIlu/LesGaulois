package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");

	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	private String prendreParole() {
		return "Le Romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		force = force-forceCoup;
		if (force < 1) {
			parler("J'abandonne !");
		} else {
			parler("Aïe");
		}
	}
	
}
