package Atividade;

//Representa um pet, definindo seus atributos.

public class Pet implements PetPrototype {
	
 private String species;
 private String name;
 private int age;


 public Pet(String species, String name, int age) {
     this.species = species;
     this.name = name;
     this.age = age;
 }


 public void info() {
     System.out.println("Espécie: " + species + ", Nome: " + name + ", Idade: " + age + " anos");
 }


 public PetPrototype clone() {
     return new Pet(species, name, age);
 }
}

