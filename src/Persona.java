import java.util.*;
public class Persona {

	int edadActual;
	
	Scanner scanner=new Scanner(System.in);
	
	public Persona() {
	}
	
	public void calcularAnios() {
		
		edadActual=0;
		int edadJubilacion=67;
		int aniosRestantes=0;
		System.out.println("¿Cuantos años tienes?");
		edadActual=scanner.nextInt();
		
		aniosRestantes = edadJubilacion - edadActual;
		
		if (aniosRestantes < 10 ) {
			System.out.println("Sólo te quedan "+ aniosRestantes + " años. ¡Vamos que ya queda poco!");
		} else if (aniosRestantes > 20) {
			System.out.println("Te quedan " + aniosRestantes + " años. ¡A seguir trabajando gandul!");
		}
			
		
		
		
	}
	
}
