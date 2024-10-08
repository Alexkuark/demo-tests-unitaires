package fr.diginamic.immobilier.entites;
/** Repr�sente une pi�ce abstraite
 * @author DIGINAMIC
 *
 */
public abstract class Piece {

	/** superficie : superficie*/
	private double superficie;
	
	/** numEtage : �tage o� se situe la pi�ce*/
	private int numEtage;
	

	/** TYPE_CHAMBRE : String*/
	public static final String TYPE_CHAMBRE = "Chambre";

	/** TYPE_SALON : String*/
	public static final String TYPE_SALON = "Salon";
	
	/** TYPE_CUISINE : String*/
	public static final String TYPE_CUISINE = "Cuisine";
	
	/** TYPE_CUISINE : String*/
	public static final String TYPE_WC = "WC";
	
	/** TYPE_CUISINE : String*/
	public static final String TYPE_SDB = "Salle de bain";
	
	/** Constructeur
	 * @param etage �tage
	 * @param superficie superficie
	 */
	public Piece(int etage, double superficie) {
		this.numEtage = etage;
		this.superficie = superficie;
	}
	
	/** Retourne le type de la pi�ce
	 * @return String
	 */
	public abstract String getType();

	/** Getter
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/** Setter
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/** Getter
	 * @return the numEtage
	 */
	public int getNumEtage() {
		return numEtage;
	}

	/** Setter
	 * @param numEtage the numEtage to set
	 */
	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}
}