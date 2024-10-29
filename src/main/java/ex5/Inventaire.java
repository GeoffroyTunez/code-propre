package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets",0,5));
		caisses.add(new Caisse("Moyens objets",5,20));
		caisses.add(new Caisse("Grands objets",20,999));
	}

	public void addItem(Item item) {

		//TODO Faites évoluer ce code (idée: c'est le caisse qui doit "savoir" si elle peut accepter un objet ou non)
//		if (item.getPoids() < 5) {
//			caisses.get(0).getItems().add(item);
//		}
//		if (item.getPoids() >= 5 && item.getPoids() <= 20) {				Obsolette grâce auj while
//			caisses.get(1).getItems().add(item);
//		}
//		if (item.getPoids() >= 20) {
//			caisses.get(2).getItems().add(item);
//		}

		int i=0; // pour commancer a la première caisse
		while(true){
			if(caisses.get(i).checkPoid(item.getPoids())){ // attend "true" si l'item rentre dans la marge de poid de la caisse
				caisses.get(i).getItems().add(item); // lui ajout l'item si il  passe
				break; // qui la boucle
			}else if(i == (caisses.size()-1)){
				System.out.println("L'objet : " + item.getNom() + "ne rendre dans aucune des caisse !");
				break;
			}else{
				i++; // passe a la caisse suivante
			}

		}
	}

	public int taille() {
		
		//TODO faites évoluer ce code.
		return caisses.get(0).getItems().size() + caisses.get(1).getItems().size() + caisses.get(2).getItems().size();
	}
}
