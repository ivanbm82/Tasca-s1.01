package n2exercici1;

public class Smartphone extends Telefono implements Camara, Reloj{

	public Smartphone(String marca, String modelo) {
		super(marca, modelo);
		
	}

	
	public void alarma() {
		System.out.println("Esta sonando una alarma");
		
	}

	
	public void fotografiar() {
		System.out.println("Se esta haciendo una fotografia");
		
	}
	
	
}
