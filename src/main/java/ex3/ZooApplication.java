package ex3;
public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
//		zoo.addAnimal("Gazelle", "MAMMIFERE", "HERBIVORE");
//		zoo.addAnimal("Zèbre", "MAMIFERE", "HERBIVORE");
//		zoo.addAnimal("Lion", "MAMMIFERE", "HERBIVORE");
//		zoo.addAnimal("Panthère", "MAMMIFERE", "CARNIVORE");
//		zoo.addAnimal("Requin blanc", "POISSON", "HERBIVORE");
//		zoo.addAnimal("Truite dorée", "POISSON", "HERBIVORE");
//		zoo.addAnimal("Boa constrictor", "SERPENT", "CARNIVORE");
//		zoo.addAnimal("Python", "SERPENT", "CARNIVORE");


		zoo.addAnimals(new Animal("Gazelle", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimals(new Animal("Zèbre", "MAMIFERE", "HERBIVORE"));
		zoo.addAnimals(new Animal("Lion", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimals(new Animal("Panthère", "MAMMIFERE", "CARNIVORE"));
		zoo.addAnimals(new Animal("Requin blanc", "POISSON", "HERBIVORE"));
		zoo.addAnimals(new Animal("Truite dorée", "POISSON", "HERBIVORE"));
		zoo.addAnimals(new Animal("Boa constrictor", "SERPENT", "CARNIVORE"));
		zoo.addAnimals(new Animal("Python", "SERPENT", "CARNIVORE"));

		System.out.println(zoo.NombreAnimaux());
	}

}