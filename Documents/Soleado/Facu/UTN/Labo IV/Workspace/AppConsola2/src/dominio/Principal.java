package dominio;

public class Principal {

	public static void main(String[] args) {
		ArticuloGimnasio artG = new ArticuloGimnasio();
		artG.setNombre("Mancuerna");
		artG.setPeso(10);
		System.out.println(artG.toString());
		
		System.out.println(artG.devuelvePesoEnGramos() + " gramos");
	}

}
