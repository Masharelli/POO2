public class Letrero {

  // miembros - atributos + comportamientos

  // atributos
  // características descriptivas
  // se representan por medio de variables

  // modificadores de acceso
  // public - todo mundo puede accederlo
  // protected - sólo se puede acceder por clase e hijos
  // private - sólo clase puede acceder
  protected float tamanio;

  // métodos accesores (accessor methods)
  // getters y setters
  // - sirven para separar quién lee y quién escribe un atributo
  // this - este! referencia a si mismo (es como decir yo / mi)
  protected void setTamanio(float tamanio){ this.tamanio = tamanio; }

  public float getTamanio(){ return tamanio; }

  // comportamiento - behavior
  // acciones
  // se representan por medio de métodos

  // CONSTRUCTORES
  // hay constructor si no lo definimos?
  // sí - default vacio
  // constructor default - no tiene parámetros
  // es default porque se invoca automaticamente desde subclases
  // constructores se puede sobrecargar n veces
  // se hace la diferencia con lista de parámetros
  // se llaman igual que la Clase
  // no tienen tipo de retorno

  public Letrero(){
    System.out.println("constructor default");
    tamanio = 5;
  }

  public Letrero(float tamanio) {
    System.out.println("CONSTRUCTOR NO DEFAULT");
    this.tamanio = tamanio;
  }

  // throws - indica que un método PUEDE lanzar una excepcion
  public void cambiarTamanio(float tamanio) throws LetreroException {

    if(tamanio < 1){
        throw new LetreroException();
    }

    this.tamanio = tamanio;
  }
}
