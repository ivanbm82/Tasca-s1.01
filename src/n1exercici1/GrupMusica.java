package n1exercici1;

public class GrupMusica {
	public static void main(String[]arg) {
		
			
		InstrumentVent trompeta 	= new InstrumentVent("Trompeta", 100);
		
		InstrumentCorda guitarra 	= new InstrumentCorda("Guitarra", 80);
		
		InstrumentPercussio bateria = new InstrumentPercussio("Bateria", 1000);
		
		System.out.println(trompeta.toString());
		System.out.println(guitarra.tocar()+ "\n" +guitarra.toString());
		System.out.println(bateria.toString());
		
		
			
		
	}

}
