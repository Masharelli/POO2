import javax.swing.*;

public class Database {

  public static void main(String[] args){

    // arreglos en java

    // son como objetos - apuntan a una ubicación en memoria
    // son espacios consecutivos en memoria

    // declaran
    int[] arreglin;

    // inicializan
    arreglin = new int[5];

    int[] arreglon = {2, 3, 4, 15, 22, 66, 234};

    // iterar un arreglo
    for(int i = 0; i < args.length; i++){
      System.out.println(args[i]);
    }

    Student mayra = new Student("Mayra", "Guajardo", 30);
    System.out.println(mayra);

    Student[] estudiantes = new Student[10];

    System.out.println(estudiantes[0]);
    int actual = 0;

    int opcion;
    do {
      System.out.println("Selecciona una opcion");
      System.out.println("1. Agregar estudiante");
      System.out.println("2. Editar estudiante");
      System.out.println("3. Buscar estudiante");
      System.out.println("4. Borrar estudiante");
      System.out.println("5. Tomar lista");
      System.out.println("6. Mostrar estudiantes");
      System.out.println("7. Salir");
      opcion = Integer.parseInt(JOptionPane.showInputDialog("elige una opción"));

      switch(opcion){
        case 1:
          String nombre = JOptionPane.showInputDialog("dame nombre");
          String apellido = JOptionPane.showInputDialog("dame apellido");
          float calificacion = Float.parseFloat(
                                JOptionPane.showInputDialog("dame calificacion")
                              );
          estudiantes[actual] = new Student(nombre, apellido, calificacion);
          actual++;
          actual %= estudiantes.length;
          break;
        case 2:
          int posicion = Integer.parseInt(JOptionPane.showInputDialog("posicion:"));
          String nombre2 = JOptionPane.showInputDialog("dame nombre");
          String apellido2 = JOptionPane.showInputDialog("dame apellido");
          float calificacion2 = Float.parseFloat(
                              JOptionPane.showInputDialog("dame calificacion")
                            );
          estudiantes[posicion] = new Student(nombre2, apellido2, calificacion2);
          break;

        case 3:

          String nombre3 = JOptionPane.showInputDialog("dame nombre");

          for(int i = 0; i < estudiantes.length; i++){
            if(estudiantes[i] != null){
              // comparaciones de strings
              if(estudiantes[i].getNombre().equals(nombre3)){
                System.out.println(estudiantes[i].getCalificacion());
              }
            }
          }

          break;

        case 4:
          int posicion2 = Integer.parseInt(JOptionPane.showInputDialog("posicion:"));

          for(int i = posicion2; i < estudiantes.length - 1; i++){
            estudiantes[i] = estudiantes[i + 1];
          }
          estudiantes[estudiantes.length - 1] = null;
          break;

        case 5:

          for(int i = 0; i < estudiantes.length; i++){
            if(estudiantes[i] != null){
              int asistencia = Integer.parseInt(
                              JOptionPane.showInputDialog("está presente " + estudiantes[i].getNombre())
                              );
              if(asistencia == 0)
                estudiantes[i].falto();
              else
                estudiantes[i].asistio();
            }
          }
          break;

        case 6:

          for(int i = 0; i < estudiantes.length; i++){
            if(estudiantes[i] != null){
              System.out.println(estudiantes[i]);
            }
          }
          break;
      }

    }while(opcion != 7);
  }
}
