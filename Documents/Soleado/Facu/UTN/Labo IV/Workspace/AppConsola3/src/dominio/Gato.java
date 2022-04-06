package dominio;

public class Gato extends Animal{

	//constructores
	public Gato() {
		super();
	}

	public Gato(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Es un gato, se llama " + getNombre();
	}

	@Override
	public String habilidades() {
		return "Los gatos tienen gran flexibilidad";
	}

}
