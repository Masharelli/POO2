// herencia
// - Especialización
// - mecanismo de reuso - miembros del padre son accesibles para el hijo
public class LetreroSalon extends Letrero {

  // constructores en Herencia
  // SIEMPRE invocamos un superconstructor
  // superconstructor - constructor de la superclase
  // superclase - clase de donde heredamos

  private String color;
  private Etiqueta etiqueta;

  public String getColor(){ return color; }

  public Etiqueta getEtiqueta(){ return etiqueta; }

  public LetreroSalon(){

    // INVOCACIÓN AL CONSTRUCTOR DEFAULT
    // puede ser implícita o explícita
    super();
    System.out.println("DEFAULT HIJO");
    color = "azul";
  }

  public LetreroSalon(String color, float tamanio, Etiqueta etiqueta){

    // invocando un superconstructor no default
    super(tamanio);
    this.color = color;
    this.etiqueta = etiqueta;
    System.out.println("CONSTRUCTOR NO DEFAULT HIJO");
  }
}
