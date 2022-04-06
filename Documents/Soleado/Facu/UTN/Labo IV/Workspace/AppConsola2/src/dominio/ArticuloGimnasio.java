package dominio;

public class ArticuloGimnasio extends Articulo{
	
	private int peso; //VALOR EN KILOS
	private static final int gramos = 1000;
	//M�TODO
	
	public int devuelvePesoEnGramos() {
		return peso*gramos;
	}
	
	//constructores
	public ArticuloGimnasio() {
		super();
	}

	public ArticuloGimnasio(String nombre, int peso) {
		super(nombre);
		this.peso = peso;
	}



	@Override
	public String toString() {
		return super.toString() + ", peso=" + peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
