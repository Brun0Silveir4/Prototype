package Atividade;

//Classe Responsável por rodar o sistema e demonstrar o uso do registry de pets.

public class Demo {
	public static void main(String[] args) {


		PetRegistry registry = new PetRegistry();


		PetPrototype catPrototype = registry.getPrototype("cat");
		PetPrototype dogPrototype = registry.getPrototype("dog");


		Pet cat = (Pet) catPrototype.clone();
		Pet dog = (Pet) dogPrototype.clone();


		cat.info();
		dog.info();
	}
}
