package Ejercicio1;

public class Empleado {
	
	// ATRIBUTOS
	private final int id;
	private String nombre;
	private int edad;
	private static int cont = 1000;
	// private static int cont = 999; --> otra forma
	
	// CONSTRUCTORES
	public Empleado(){
		this.id = cont;
		cont++;
		this.nombre = "Sin nombre";
		this.edad = 99;
	}
	
	/* Si inicializamos cont en 999:
	public Empleado(){
		cont++;
		this.id = cont;
		this.nombre = "Sin nombre";
		this.edad = 99;
	}
	*/
	
	public Empleado(String nombre, int edad){
		this.id = cont;
		cont++;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	/* Si inicializamos cont en 999:
	 public Empleado(String nombre, int edad){
	 	cont++;
		this.id = cont;
		this.nombre = nombre;
		this.edad = edad;
	}
	 */
	
	// GETTERS Y SETTERS
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
	
	public int getId() {
		return id;
	}
	
	// METODO devuelveProximoId VERSION 1()
	
	public int devuelveProximoId() {
		return cont;
	}
	
	// METODO devuelveProximoId VERSION 2()
	
		public String devuelveProximoId2() {
			// int siguiente = cont + 1 (si inicializamos el cont en 999)
			return "El próximo ID será el " + cont; // si inicializamos el cont en 999, en vez de cont devolvemos la variable siguiente)
		}
	
	// METODO toString()

	@Override
	public String toString() {
		return "EMPLEADO: " + id + " - NOMBRE: " + nombre + " - EDAD: " + edad;
	}
	
	
}

