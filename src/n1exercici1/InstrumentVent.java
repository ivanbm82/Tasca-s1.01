package n1exercici1;

class InstrumentVent extends InstrumentsMusicals{
	
	public InstrumentVent(String nombre, int precio) {
		super(nombre, precio);
	}

	
	public String tocar() {
		return "Esta sonando un instrumento de viento";
	}

	
	public String toString() {
		return tocar();
	}

}
