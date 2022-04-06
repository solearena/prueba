package dominio;

public abstract class Animal {
	
	private String nombre;

	//constructores
	public Animal() {
		this.nombre = "sin nombre";
	}
	
	public Animal(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Es un animal, su nombre es " + nombre;
	}
	
	public abstract String habilidades();
}
