package n1exercici2;

public class Cotxe {
	
	private static final String marca = "Peugeot";//Se inicializa al crearse los atributos y no se puede modificar;
	private static String modelo;//Es el unico que tiene el setter porque se puede modificar
	private final int potencia;//En el momento que creemos el objeto ya no se puede modificar
	
	public Cotxe(String modelo, int potencia){
		this.modelo = modelo;
		this.potencia = potencia;
		
		
	}

	public static String getModelo() {
		return modelo;
	}

	public static void setModelo(String modelo) {
		Cotxe.modelo = modelo;
	}

	public static String getMarca() {
		return marca;
	}

	public int getPotencia() {
		return potencia;
	}
	
	
	public void acelerar() {
		System.out.println("El vehiculo esta acelerando");
	}
	
	public static void frenar() {
		System.out.println("El vehiculo esta frenando");
	}

	@Override
	public String toString() {
		return getMarca() + " "+ getModelo() +" "+ getPotencia()+" CV";
	}
	

}






