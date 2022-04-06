package ejercicio1;

import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		
		TreeSet<Profesor>listaProfesoresb = new TreeSet<Profesor>();
		
		Profesor p1 =  new Profesor("Juan", 33, "Matematica", 10);
		Profesor p2 =  new Profesor("Mariela", 29, "Computación", 3);
		Profesor p3 =  new Profesor("Mariela", 29, "Computación", 3);
		listaProfesoresb.add(p1);
		listaProfesoresb.add(p2);
		listaProfesoresb.add(p3);
		
		for (Profesor profesor : listaProfesoresb) {
			System.out.println(profesor.toString());
		}

		if (p2.equals(p3)) {
			System.out.println("Es el mismo profesor");
		}
		else {
			System.out.println("No es el mismo profesor");
		}
	}

}
