
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursividad r = new Recursividad();
		
		String[] arreglo = {"A", "B", "C", "D", "E", "F", "G"};
		r.contar(1, 10);
		r.recorrerArreglo(arreglo);
		System.out.println(r.sumatoria(1,5));
		System.out.println(r.factorial(20));
	}

}
