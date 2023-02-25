package n1exercici1;

class InstrumentCorda extends InstrumentsMusicals{
	
	//Bloc d'inicialització d'instància
		{
			System.out.println("Sale el de cuerda");
		}
	public InstrumentCorda(String nombre, int precio) {
		
		super(nombre, precio);
	}

	public String tocar() {
		return "Esta sonando un instrumento de cuerda";
	}

	
	public String toString() {
		return  getNombre() +" cuesta: "+ getPrecio();
	}
	
	
}
