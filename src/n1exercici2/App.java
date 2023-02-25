package n1exercici2;

public class App {

	public static void main(String[] arg) {
		
		Cotxe nuevoCoche = new Cotxe("206" , 150);
		
		
		
		Cotxe.setModelo("5008");
		
		System.out.println(nuevoCoche);
		
		Cotxe.frenar();//Se accede por la clase al ser estatico.
		
		nuevoCoche.acelerar();//Accedemos por el objeto
		
		
	}

}
