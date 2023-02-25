
package n2exercici1;

class Telefono {
	
	protected String marca;
	protected String modelo;
	
	public  Telefono(String marca, String modelo) {
		this.marca=marca;
		this.modelo=modelo;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void llamar(int numTelefono) {
		System.out.println("Esta llamando al "+numTelefono);
		
	}

}
