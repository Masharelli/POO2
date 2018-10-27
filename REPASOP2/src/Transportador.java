
// qué eran?
// - clase ligera
// - no tiene atributos
// - tiene sólo la firma de métodos
// - se implementan (no se heredan)
// - es necesario implementar métodos en clase que implementa interfaz


// ¿para qué servían?
// - necesidad de exponer un contrato común entre clases distintas
// - definir una actividad común entre clases que no están relacionadas

public interface Transportador {
	
	public void transportar(float carga);
}
