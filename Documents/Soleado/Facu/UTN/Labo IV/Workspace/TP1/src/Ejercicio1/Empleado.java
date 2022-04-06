package Ejercicio1;

public class Empleado {

	//encapsulo usando la palabra reservada private
	private final int id;
	private String nombre;
	private int edad;
	
	private static int cont = 1000;
	
	//Constructores
	public Empleado(String nombre, int edad) {
		cont++;
		this.id = cont;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	public Empleado() {
		cont++;
		this.id = cont;
		this.nombre = "sin nombre";
		this.edad = 99;
	}
	
	//m�todo
	public static String devuelveProximoID() {
		int siguiente = cont + 1;
		return "El pr�ximo ID ser� el " + siguiente;
	}
		
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	//7.ToString()
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
