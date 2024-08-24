package fr.diginamic.enumerations;
/**
 * Représente une saison et fournit les 4 instances de saisons.
 * 
 * @author DIGINAMIC
 *
 */
public enum Saison {

	/** Les 4 instances de Saison */
	PRINTEMPS("Printemps", 1), ETE("Et�", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	/** libelle */
	private String libelle;
	/** ordre */
	private int ordre;

	/**
	 * Constructeur
	 * 
	 * @param libelle libell�
	 * @param ordre   ordre
	 */
	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}

	/**
	 * Permet de rechercher une Saison � partir de son libell�
	 * 
	 * @param libelle libell�
	 * @return {@link Saison}
	 */
	public static Saison valueOfLibelle(String libelle) {
		Saison[] saisons = Saison.values();
		for (Saison saison : saisons) {
			if (libelle.equals(saison.getLibelle())) {
				return saison;
			}
			else {
				return null;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return ordre + ". " + libelle;
	}

	/**
	 * Getter
	 * 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Getter
	 * 
	 * @return the ordre
	 */
	public int getOrdre() {
		return ordre;
	}
}