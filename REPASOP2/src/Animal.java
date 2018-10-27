// clases abstractas
// - no puede ser instanciada
// - PUEDE tener métodos abstractos
// - para usarla estamos obligados a heredarla

public abstract class Animal {
	
	
	// static 
	// miembro pertenece directamente a la clase, no a un objeto de la misma
	
	public static int cantidadDeAnimales;
	
	private int edad;
	private String nombre;
	
	public int getEdad() { return edad; }
	public String getNombre() { return nombre; }
	
	public Animal(int edad, String nombre) {
		
		this.edad = edad;
		this.nombre = nombre;
	}
	
	public void desplazarse() {
		System.out.println("me muevo");
	}
	
	// sobrecarga - overload
	// - definir un método con mismo nombre pero distinta firma
	// - distinta lista de parámetros
	// - normalmente hacen la misma actividad pero con información distinta
	public void desplazarse(float distancia) {
		System.out.println("me muevo " + distancia + " metros");
	}
	
	// método abstracto
	// - se define la firma 
	// - se implementa en subclase
	public abstract void comer(int cantidadDeComida);
	
	public static void saludar(Animal a) {
		System.out.println("HOLA " + a.getNombre());
	}
	
	public static void llamarTransportador(Transportador t) {
		t.transportar(500);
	}
}
