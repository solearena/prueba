package Ejercicio1;

public class Principal {
	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado("Julio", 35);
		Empleado empleado2 = new Empleado();
		Empleado empleado3 = new Empleado("Lucas", 80);
		Empleado empleado4 = new Empleado();
		Empleado empleado5 = new Empleado("Carola", 22);
		
		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());
		System.out.println(empleado3.toString());
		System.out.println(empleado4.toString());
		System.out.println(empleado5.toString());
		
		System.out.println(Empleado.devuelveProximoID());
	}

}
