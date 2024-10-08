package fr.diginamic.immobilier.entites;
/** Repr�sente une maison avec toutes ses pi�ces
 * @author DIGINAMIC
 *
 */
public class Maison {
	
	/** pieces : tableau de pi�ces de la maison */
	private Piece[] pieces;
	
	/**
	 * Constructeur
	 */
	public Maison(){
		// Initialisation du tableau de pi�ces
		pieces = new Piece[0];
	}

	/** Ajoute une pi�ce � la maison
	 * @param nvPiece nouvelle pi�ce � ajouter
	 */
	public void ajouterPiece(Piece nvPiece) {
		
		// On est oblig� d'agrandir le tableau initial de 1 � chaque ajout
		// d'une nouvelle pi�ce
		
		// On commence donc par cr�er un tableau temporaire appel� newTab
		// qui a une taille �gale � la tableau du tableau pieces+1
		Piece[] newTab = new Piece[pieces.length+1];
		
		// On d�verse toutes les pi�ces du tableau pieces dans newTab
		for (int i=0; i<pieces.length; i++){
			newTab[i]=pieces[i];
		}
		
		// On place en derni�re position dans le nouveau tableau la nouvelle
		// pi�ce
		newTab[newTab.length-1]=nvPiece;
		
		// Enfin on affecte newTab � pieces
		this.pieces=newTab;
	}
	
	public int nbPieces() {
		return pieces.length-1;
	}

	/** Retourne la superficie d'un �tage
	 * @param choixEtage choix de l'�tage
	 * @return double
	 */
	public double superficieEtage(int choixEtage) {
		double superficieEtage = 0;

		for (int i = 0; i < pieces.length; i++) {
			if (choixEtage == this.pieces[i].getNumEtage()) {
				superficieEtage = this.pieces[i].getSuperficie();
			}
		}

		return superficieEtage;
	}
	
	/** Retourne la superficie total pour un type de pi�ce donn�
	 * @param typePiece type de pi�ce
	 * @return double
	 */
	public double superficieTypePiece(String typePiece) {
		double superficie = 0;

		for (int i = 1; i < pieces.length; i++) {
			if (typePiece!=null && typePiece.equals(this.pieces[i].getType())) {
				superficie = superficie + this.pieces[i].getSuperficie();
			}
		}

		return superficie;
	}

	/** Retourne la surface totale
	 * @return double
	 */
	public double calculerSurface() {
		double superficieTot = 0;

		for (int i = 0; i < pieces.length; i++) {
			superficieTot = superficieTot + this.pieces[i].getSuperficie();
		}

		return superficieTot;
	}

	/** Getter pour l'attribut pieces
	 * @return the pieces
	 */
	public Piece[] getPieces() {
		return pieces;
	}

}