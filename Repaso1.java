import javax.swing.*;

public class Repaso1 {

  public static void main(String[] args){

    /*
    - Clases
    - Objetos
    - Constructores
    - atributos
    - métodos
    - modificadores de acceso (private, public, protected)
    - Herencia
    - constructores con herencia
    - polimorfismo
    - objetos como atributos (Relación HAS-A)
    - objetos como parámetros
    - Excepciones
    - Throw / throws
    - Try-catch-finally
    - Arreglos
    - static
    ******* EXAMEN QUE NO COMPILE NO SE CALIFICA
    ******* INDENTACIÓN O PENALIZACIÓN
    ******* IDIOMS O PENALIZACIÓN
    */

    // declaración y uso de Objetos
    Letrero l, l2, l3;

    // valor default de objeto = nulo
    // MOMENTO DE CREACIÓN DE Objetos
    l = new Letrero();
    l2 = new Letrero(10);

    // l, l2, l3 son referencias
    // primitivos se copian objetos se refieren

    // igualar espacio en memoria, NO copia contenido
    l3 = l;
    try{
      l3.cambiarTamanio(-1);
    } catch (LetreroException le){

      le.printStackTrace();
    } finally {
      // código que SIEMPRE va a correr, pase lo que pase
      System.out.println("FINALLY!");
    }


    // == con objetos es comparación de referencias (osea que apunten
    // al mismo lado)
    if(l3 == l){
      System.out.println("mismo espacio en memoria");
    }

    Etiqueta e = new Etiqueta("207");

    LetreroSalon ls = new LetreroSalon();
    LetreroSalon ls2 = new LetreroSalon("rojo", 15, e);

    if(e == ls2.getEtiqueta()){
      System.out.println("******* SI FUERON IGUALES");
    }

    // polimorfismo - muchas formas
    // - un sólo objeto puede representar su propia clase
    // y a cualquier superclase
    // - un objeto de una superclase no puede representar a una subclase
    // - por medio de Herencia
    // - los objetos están restringidos a miembros de la clase que
    // representan

    Letrero l4 = ls2;
    //System.out.println(l4.getColor());

    // captura de input
    String entrada = JOptionPane.showInputDialog("ejemplo");

    // parsing / casting
    // casting es cambio de tipo
    // parsing es interpretación de string y regresa valor de un tipo
    int entrada2 = Integer.parseInt(JOptionPane.showInputDialog("un entero"));
    float entrada3 = Float.parseFloat(JOptionPane.showInputDialog("un float"));
    float ejemplo = 2.34f;

    String repetir = "si";
    do{
      repetir = JOptionPane.showInputDialog("repetir?");
    }while(repetir.equals("si"));

    repetir = "si";
    while(repetir.equals("si")){
      repetir = JOptionPane.showInputDialog("repetir?");
    }
  }

}
