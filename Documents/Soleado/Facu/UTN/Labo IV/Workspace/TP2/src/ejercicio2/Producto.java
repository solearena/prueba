package ejercicio2;

import java.sql.Date;

public class Producto {

	private Date fechaCaducidad;
	private int lote;
	
	public Producto() {
		
	}

	public Producto(Date fechaCaducidad, int lote) {
		super();
		this.fechaCaducidad = fechaCaducidad;
		this.lote = lote;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	@Override
	public String toString() {
		return "Producto [fechaCaducidad=" + fechaCaducidad + ", lote=" + lote + "]";
	}

}
