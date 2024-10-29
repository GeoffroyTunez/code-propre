package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	private double solde;
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	private String type;


	/** Constructeur pour CompteBancaire pour créer un compte de type Compte courant
	 * @param type = CC
	 * @param solde
	 * @param decouvert
	 */
	public CompteBancaire(String type, double solde, double decouvert) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	
	/** Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param type = LA
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 */
	public CompteBancaire(String type, double solde, double decouvert, double tauxRemuneration) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Débite un montant au solde
	 * Si le compte est un CC alors il vérifie s'il ne sera pas en dessous du decouvert autoriser
	 * Si le compte est un LA alors il vérifie si le montent ne dépasse pas la solde du compte
	 * @param montant
	 */
	public void debiterMontant(double montant){
		if (type.equals("CC")){
			if (this.solde - montant > decouvert){
				this.solde = solde - montant;
			}	
		}
		else if (type.equals("LA")){
			if (this.solde - montant > 0){
				this.solde = solde - montant;
			}	
		}
	}

	/**
	 * Ajoute au compte "Livre A" la somme de la rémuneration annuelle dont il dispose grace a son taux et a son solde
 	 */
	public void appliquerRemunerationAnnuelle(){
		if (type.equals("LA")){
			this.solde = solde + solde*tauxRemuneration/100;
		}
	}
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter for solde
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter for decouvert
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter for tauxRemuneration
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	/** Getter for type
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/** Setter for type
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
