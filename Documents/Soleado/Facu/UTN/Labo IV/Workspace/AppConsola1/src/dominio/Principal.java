package dominio;

public class Principal {

	public static void main(String[] args) {
		
//		Articulo art1 = new Articulo();
//		//art1.setId(1);
//		art1.setNombre("Articulo 1");
//		System.out.println("ID: " + art1.getId() + " - NOMBRE: " + art1.getNombre());
//		
//		Articulo art2 = new Articulo();
//		//art2.setId(2);
//		art2.setNombre("Articulo 2");
//		System.out.println(art2.toString());
//		
//		Articulo art3 = new Articulo();
//		//art3.setId(3);
//		art3.setNombre("Articulo 3");
//		System.out.println(art3.toString());
		
		Articulo[] vArt = new Articulo[3];
		vArt[0] = new Articulo("Articulo 1");
		vArt[1] = new Articulo("Articulo 2");
		vArt[2] = new Articulo("Articulo 3");
		
		for (Articulo articulo : vArt) {
			System.out.println(articulo.toString());
		}
		
		System.out.println(Articulo.devuelveProximoId());
	}
}
