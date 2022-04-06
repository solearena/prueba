package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		//Punto 5
		ArrayList<Profesor>listaProfesores = new ArrayList<Profesor>(5);
		
		Profesor p1 =  new Profesor("Juan", 33, "Matematica", 10);
		Profesor p2 =  new Profesor("Mariela", 29, "Computación", 3);
		listaProfesores.add(p1);
		listaProfesores.add(p2);
		
		//Iterador
		ListIterator<Profesor>it = listaProfesores.listIterator();
		
		while(it.hasNext()) {
			Profesor profesor = it.next();
			System.out.println(profesor.toString());
		}

	}

}
