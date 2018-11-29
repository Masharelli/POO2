
public class Main {

	public static void main(String[] args) {
		
		new Ventana();
		
		String ejemplo = "hola,amigos,como,estan";

		// split
		// divide un string basado en una expresión regular
		String[] ejemploRecortado = ejemplo.split(",");
		for(int i = 0; i < ejemploRecortado.length; i++) {
			System.out.println(ejemploRecortado[i]);
		}
	}
}
