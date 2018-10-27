
public class Perro extends Animal implements Transportador {

	private String raza;
	
	public String getRaza() {
		return raza;
	}
	
	public Perro(int edad, String nombre, String raza) {
		super(edad, nombre);
		this.raza = raza;
	}

	// métodos abstractos heredados DEBEN ser implementados
	@Override
	public void comer(int cantidadDeComida) {
		System.out.println("como " + cantidadDeComida + " kilos");
	}

	// override - sobreescritura
	// - redefinir un método que se hereda
	// - 2 opciones: redefinir por completo o agregar comportamiento
	// - para sobreescribir hay que definir un método con exactamente la misma firma
	public void desplazarse(float d) {
		super.desplazarse(d);
		System.out.println("esto no hace mucho mas");
	}

	@Override
	public void transportar(float carga) {
		// TODO Auto-generated method stub
		if(carga > 5) {
			System.out.println("es mucho para mi");
		} else {
			System.out.println("ok");
		}
	}
}
