package dominio;

public class Perro extends Animal {

	private String raza;

	//Constructor
	public Perro() {
		super();
		raza = "sin raza";
	}

	public Perro(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	@Override
	public String toString() {
		return "Es un Perro, su nombre es " + this.getNombre() + " y su raza es " + this.getRaza();
	}

	@Override
	public String habilidades() {
		return "Los perros pueden localizar y separar olores";
	}
	
}
