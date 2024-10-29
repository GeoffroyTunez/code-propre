package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

	private String nom;
	private List<Item> items;
	private int poidMin;
	private int poidMax;

	/** Constructeur
	 * @param nom
	 * @param poidMax
	 * @param poidMin
	 */
	public Caisse(String nom, int poidMin, int poidMax) {
		super();
		this.nom = nom;
		this.items = new ArrayList<>();
		this.poidMin = poidMin;
		this.poidMax = poidMax;
	}

	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	/** Permet de verifier si l'item est dans la marge de poid de la caisse
	 * avec le poid max et poid min de la caisse on peut dire si l'item peut passer sur la caisse ou non
	 * @param poid
	 * @return
	 */
	public boolean checkPoid(int poid){
		if(poid > this.poidMax || poid < this.poidMin){
			return false;
		}
		return true;
	}

}
