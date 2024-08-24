package fr.diginamic.immobilier.entites;
/** Pi�ce de type cuisine
 * @author DIGINAMIC
 *
 */
public class Cuisine extends Piece {

	/** Constructeur
	 * @param etage �tage
	 * @param superficie superficie
	 */
	public Cuisine(int etage, double superficie) {
		super(etage, superficie);
	}
	
	@Override
	public String getType() {
		return TYPE_CUISINE;
	}

}