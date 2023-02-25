package n1exercici1;

public abstract class InstrumentsMusicals {
	
	private String nombre;
	private int precio;

	//Inicialitzador static
	static {
		System.out.println("Salen los instrumentos");
	}
		
	public InstrumentsMusicals(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public int getPrecio() {
		return precio;
	}
	//Metodo abstracto
	public abstract String tocar();
	

}
