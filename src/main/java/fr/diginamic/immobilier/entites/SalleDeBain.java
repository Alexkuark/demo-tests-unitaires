package fr.diginamic.immobilier.entites;
/** Pi�ce de type salle de bain
 * @author DIGINAMIC
 *
 */
public class SalleDeBain extends Piece {

	/** Constructeur
	 * @param etage �tage
	 * @param superficie superficie
	 */
	public SalleDeBain(int etage, double superficie) {
		super(etage, superficie);
	}
	
	@Override
	public String getType() {
		return TYPE_SDB;
	}

}