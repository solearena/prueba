package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado("Cristina", 33);
		Empleado empleado3 = new Empleado("Jose", 47);
		Empleado empleado4 = new Empleado("Nicole", 22);
		Empleado empleado5 = new Empleado("Juan Carlos", 29);
		
		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());
		System.out.println(empleado3.toString());
		System.out.println(empleado4.toString());
		System.out.println(empleado5.toString());
		
		System.out.println("");
		//MÉTODO DEVUELVE PRÓXIMO ID 1
		System.out.println("El próximo ID será: " + empleado5.devuelveProximoId());
		
		System.out.println("");
		//MÉTODO DEVUELVE PRÓXIMO ID 2
		System.out.println(empleado5.devuelveProximoId2());

	}

}
