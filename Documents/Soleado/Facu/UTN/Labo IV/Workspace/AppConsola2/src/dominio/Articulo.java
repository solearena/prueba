package dominio;

public class Articulo {
	
	//atributos
	
	private int id;
	private String nombre;
	
	private static int cont = 0;
	
	//método
	public static int devuelveProximoId() {
		return cont + 1;
	}
	
	//Constructores
	public Articulo() {
		cont++;
		this.id = cont;
		//id = 0;
		this.nombre = "Sin Nombre";
	}
	
	public Articulo(String nombre) {
		cont++;
		this.id = cont;
		this.nombre = nombre;
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Metodo toString()
	@Override
	public String toString() {
		return "Articulo id=" + id + ", nombre=" + nombre;
	}
	
	
}
