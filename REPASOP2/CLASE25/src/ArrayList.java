
public class ArrayList<T> {

	private T[] data;
	private int posicionActual;
	
	public ArrayList() {
		
		data = (T[]) new Object[5];
		posicionActual = 0;
	}
	
	public void add(T nuevo) {
		
		// agrega elemento al final de la estructura
		// duplicar arreglo si llegamos a límite
		if(posicionActual >= data.length) {
			
			T[] temp = (T[]) new Object[data.length * 2];
			
			for(int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			
			data = temp;
		}
		
		
		data[posicionActual] = nuevo;
		posicionActual++;
	}
	
	public void delete(int posicion) {
	
		// remueve elemento en una posición específica
		// desplaza otros elementos para llenar el hueco
		// partir arreglo si tenemos menos de la mitad llena
		
		//desplazamiento
		for(int i = posicion; i < posicionActual - 1; i++) {
			
			data[i] = data[i + 1];
		}
		
		data[posicionActual - 1] = null;
		
		posicionActual--;
		
		if(posicionActual < data.length / 2) {
			
			T[] temp = (T[]) new Object[data.length / 2];
			
			for(int i = 0; i < posicionActual; i++) {
				temp[i] = data[i];
			}
			
			data = temp;
		}
		
	}
	
	public T get(int posicion) {
		
		if(posicion >= posicionActual || posicion < 0)
			return null;
		// regresar objeto en posicion
		return data[posicion];
	}
	
	public int size() {
		// regresa cantidad de datos guardados 
		return posicionActual;
	}
}
