public class Student {

  private String nombre;
  private String apellido;
  private float calificacion;
  private boolean asistencia;

  public String getNombre(){ return nombre; }
  public String getApellido(){ return apellido; }
  public float getCalificacion(){ return calificacion; }
  public boolean getAsistencia(){ return asistencia; }

  public Student (String nombre, String apellido, float calificacion){
    this.nombre = nombre;
    this.apellido = apellido;
    this.calificacion = calificacion;
    asistencia = false;
  }

  public void asistio(){ asistencia = true; }
  public void falto(){ asistencia = false; }


  public String toString(){

      return nombre + " " + apellido + ", " + calificacion + ", " + asistencia;
  }

}
