package fr.diginamic.immobilier.entites;
/** Pi�ce de type WC
 * @author DIGINAMIC
 *
 */
public class WC extends Piece {

	/** Constructeur
	 * @param etage �tage
	 * @param superficie superficie
	 */
	public WC(int etage, double superficie) {
		super(etage, superficie);
	}
	
	@Override
	public String getType() {
		return TYPE_WC;
	}

}