package dominio;

public class Principal {

	public static void main(String[] args) {

		//Animal animal = new Animal("Animal");
		
		Gato gato = new Gato("Pepita");
		
		Perro perro = new Perro("Huesos", "Galgo");
		
		//System.out.println(animal.toString());
		System.out.println(gato.toString() + " " + gato.habilidades());
		System.out.println(perro.toString() + " " + perro.habilidades());
		
//		Animal[] animales = new Animal[3];
//		//animales[0] = animal;
//		animales[1] = gato;
//		animales[2] = perro;
//		
//		for (Animal a : animales) {
//			System.out.println(a.toString());
//		}
	}

}
