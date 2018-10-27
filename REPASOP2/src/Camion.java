
public class Camion implements Transportador {

	@Override
	public void transportar(float carga) {
		if(carga > 2000) {
			System.out.println("ya");
		} else {
			System.out.println("puedo mas");
		}
	}

}
