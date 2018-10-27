
public class Main {

	public static void main(String[] args) {
		
		// arreglos
		// estructura de datos lineal
		// tamaño definido
		
		int[] arreglito = {24, 25, 39, 1};
		int[] arr2 = new int[5];
		
		arr2 = new int[10];
		
		// el índice empieza en 0
		// motivo: referencia del arreglo + (tamaño * indice)
		// arreglos son referencias
		
		for(int i = 0; i < arreglito.length; i++) {
			System.out.println(arreglito[i]);
		}
		
		// tipos genéricos
		Contenedor<String, String, String> c1 = 
				new Contenedor<String, String, String>("a", "b", "c");
		
		System.out.println(c1.getCarga());
		
		// autoboxing - cambio transparente entre un primitivo y su clase correspondiente
		Contenedor<Integer, Float, Double> c2;
		c2 = new Contenedor<Integer, Float, Double>(5, 2.0f, 3.1);
		
		int x = c2.getCarga();

		ArrayList<Integer> listita = new ArrayList<>();
		
		listita.add(15);
		listita.add(30);
		listita.add(2);
		listita.add(48);
		System.out.println(listita.size());
		
		for(int i = 0; i < listita.size(); i++) {
			System.out.println(listita.get(i));
		}
		
		System.out.println("");
		
		listita.delete(0);
		for(int i = 0; i < listita.size(); i++) {
			System.out.println(listita.get(i));
		}
		
		ArrayList<Float> listita2 = new  ArrayList<>();
		ArrayList<String> listita3 = new ArrayList<>();
	}

}
