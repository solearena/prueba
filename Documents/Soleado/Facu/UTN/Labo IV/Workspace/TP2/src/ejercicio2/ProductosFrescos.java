package ejercicio2;

import java.sql.Date;

public class ProductosFrescos extends Producto{

	private String fechaEnvasado;
	private String paisOrigen;
	
	public ProductosFrescos() {

	}

	public ProductosFrescos(Date fechaCaducidad, int lote, String fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, lote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "ProductosFrescos [fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + "]";
	}
	

}
