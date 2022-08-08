
public class Principal {

	public static void main(String[] args) {
		// Cambio de dibisas
		var subject = new Subject();

		var pMX = new PesosMexicanos(subject);  
		var pC = new PesosColombianos(subject); 
		var rublo = new RubloRuso(subject);
		var pCubano = new PesosCubanos(subject);
		var yc = new YuanChino(subject);
		
		int dolar = 2;

		System.out.println("Programa Java para el cambio de divisas de dolar a:");
		System.out.println("Cambiando $" + dolar + " obtendra...");
		subject.setEstado(dolar);
		
	}

}
