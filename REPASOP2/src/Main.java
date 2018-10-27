
public class Main {

	/*
	 * override (sobre escritura)
	 * overload (sobre carga)
	 * abstract
	 * arreglos
	 * polimorfismo
	 * interfaces
	 * static
	 * clases anónimas
	 * Ventana para abir archivo
	 * Ventana para guardar archivo
	 * 
	 * GUI
	 * - frame
	 * - widgets (botones, labels, etc)
	 * - action listener
	 * - menu
	 * - layouts
	 * Tipos genéricos
	 * archivos - lectura / escritura
	 * 
	 */
	
	public static void main(String[] args) {

		
		Animal[] animales;
		
		// los arreglos se inicializan 
		// igual que los objetos tenemos una referencia que apunta a un espacio en memoria
		animales = new Animal[3];
		
		int[] arreglito = {5, 2, 3, 10, 20};
		int[] arreglito2 = new int[15];
		
		arreglito = arreglito2;
		
		arreglito[2] = 2;
		
		for(int i = 0; i < arreglito.length; i++) {
			System.out.println(arreglito[i] + "");
		}
		
		Perro p = new Perro(5, "firulais", "callejero");
		Camion c = new Camion();
		
		Animal.cantidadDeAnimales = 10;
		Animal.llamarTransportador(p);
		Animal.llamarTransportador(c);
		Animal.saludar(p);
		
		new Ventana();
	}

}
