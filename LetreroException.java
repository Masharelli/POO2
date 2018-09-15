// Excepciones
// - mecanismo para manejo de errores en ejecución
// - se lanzan y se cachan
// - sirven para fallar con gracia (fail gracefully)
public class LetreroException extends Exception {

  public LetreroException(){
    super("LETRERO EXCEPTION LANZADA!");
  }
}
