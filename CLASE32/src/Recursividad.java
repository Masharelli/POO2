
public class Recursividad {

	// recursión - repetición de código
	// iteración (es la competencia)
	// - loops como for y while
	// recursividad - método que se invoca a si mismo
	
	// ejemplo 1 - imprimir del a al b
	
	// desventaja - abarca más memoria que iteración
	
	public void contar(int a, int b) {
		
		// caso base - condición que rompe la recursividad
		if(a > b)
			return;
		
		System.out.println(a + "");
		contar(a + 1, b);
	}
	
	public void recorrerArreglo(String[] arreglo) {
		recorrerArreglo(arreglo, 0);
	}
	
	// un parámetro siempre nos va a servir para llevar registro de avance
	public void recorrerArreglo(String[] arreglo, int indice) {
	
		// caso base
		if(indice == arreglo.length)
			return;
		
		System.out.println(arreglo[indice]);
		
		// al invocar el método de vuelta asegurarse que haya desplazamiento
		recorrerArreglo(arreglo, indice + 1);
	}
	
	public int sumatoria(int a, int b) {
		
		if(a == b)
			return a;
		
		return a + sumatoria(a + 1, b);
	}
	
	public int factorial(int n) {
		
		//caso base
		if(n == 1)
			return 1;
		
		return n * factorial(n - 1);
	}
}
