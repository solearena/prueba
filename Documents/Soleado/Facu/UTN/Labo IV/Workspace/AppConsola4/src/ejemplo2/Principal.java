package ejemplo2;

public class Principal {

	public static void main(String[] args) {
		
		Barcelona b = new Barcelona();
		b.setFechaClub("01/01/89");
		
		Paris p = new Paris();
		p.setCantJugadores(35);
		
		Messi messi = new Messi();
		messi.setEquipo(p);
		messi.setNacionalidad("Argentina");
		
		System.out.println(messi.toString());

	}

}
