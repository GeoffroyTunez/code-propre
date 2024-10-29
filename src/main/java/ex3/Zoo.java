package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private String nom;
	private List<Animal> animals;
	@Deprecated private List<String> types;
	@Deprecated private List<String> noms;
	@Deprecated private List<String> comportements;

	/** Constructeur pour zoo
	 * @deprecated
	 * @param nom
	 * @param type
	 * @param comportement
	 */
	@Deprecated
//	public Zoo(String nom,String type, String comportement){
//		this.nom = nom;
//		this.types.add(type);
//		this.comportements.add(comportement);
//	}

	/** Constructeur pour zoo avec la liste d'objet Animal
	 *
	 * @param nom
	 * @param animals
	 */
	public Zoo(String nom) {
		this.nom = nom;
		this.animals = new ArrayList<>();
	}

	/** ajout d'animal de part les listes
	 *
	 * @deprecated
	 * @param nomAnimal
	 * @param typeAnimal
	 * @param comportement
	 */
	@Deprecated
	public void addAnimal(String nomAnimal, String typeAnimal, String comportement){
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}

	/** Ajout d'un animal
	 * ajout d'un animal pour l'utilisation d'un objet animal
 	 * @param animal
	 */
	public void addAnimals(Animal animal){
		this.animals.add(animal);
	}

	/**  Affiche la liste des animaux
	 */
	@Deprecated
	public void afficherListeAnimaux(){
		for (int i=0; i<types.size(); i++) {
			System.out.println(noms.get(i)+" "+types.get(i)+" "+comportements.get(i));
		}
	}

	/** Affiche la liste des animaux
	 * remplace AfficherListeAnimaux()
	 */
	public void afficheListeAnimaux(){
		for (int i = 0; i < (animals.size()-1); i++) {
			System.out.println(this.animals.get(i));
		}
	}

	/** Nombre d'animaux dans le zoo
	 *
	 * @return la taille de l'objet types, pour avoir le nombre d'animaux listé dans le zoo voulue
	 */
	@Deprecated public int taille() {
		return types.size();
	}

	/** Nombre d'aniamux dans le zoo
	 * Remplace taille()
	 * @return la taille de la list d'animal dans le zoo
	 */
	public int NombreAnimaux(){
		return (this.animals.size() -1);
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter for nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}}