package ejemplo2;

public class Paris implements IEquipo{

	private int cantJugadores;
	
	public Paris() {
		
	}

	public int getCantJugadores() {
		return cantJugadores;
	}

	public void setCantJugadores(int cantJugadores) {
		this.cantJugadores = cantJugadores;
	}

	@Override
	public String toString() {
		return "Paris [cantJugadores=" + cantJugadores + "]";
	}

	@Override
	public String devuelveInformacion() {
		return "Equipo Paris...";
	}
	
}
