package n1exercici1;

class InstrumentPercussio extends InstrumentsMusicals {
	

		public InstrumentPercussio(String nombre, int precio) {
			super(nombre, precio);
		}

		
		public String tocar() {
			return "Esta sonando un instrumento de percursión";
		}
		
		
		public String toString() {
			return tocar();
		}
}
		
	


