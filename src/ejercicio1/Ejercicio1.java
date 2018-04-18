package ejercicio1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        /* Pido al usuario la frase. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la frase que quieres analizar: ");
        String frase = sc.nextLine();

        /* Guardo las vocales en un array para ir recorriéndolo después. */
        char[] arrayVocales = {'a','e','i','o','u'};

        /* Ruta del programa que queremos ejecutar. */
        String ruta = "ejercicio1.ContadorVocales";

        /* Creo un objeto llamado pb de tipo ProcessBuilder. */
        ProcessBuilder pb;

        for(int i=0; i<arrayVocales.length; i++) {

            /* Llamo al proceso con la vocal correspondiente. */
            /* Creo la instancia del objeto pasandole la ruta del programa. */
            pb = new ProcessBuilder("java", ruta, frase, String.valueOf(arrayVocales[i]));

            /* Indico desde que directorio lo quiero ejecutar. */
            pb.directory(new File("C:\\Users\\Anton\\IdeaProjects\\Recuperacion\\out\\production\\Recuperacion"));
            pb.redirectOutput(new File("C:\\Users\\Anton\\IdeaProjects\\Recuperacion\\out\\production"
                    + "\\Recuperacion\\ejercicio1\\" + arrayVocales[i] + ".txt"));
            pb.redirectError(new File("C:\\Users\\Anton\\IdeaProjects\\Recuperacion\\out\\production"
                    + "\\Recuperacion\\ejercicio1\\errores.txt"));
            try {
                pb.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}//Crear un programa que pida al usuario una serie de numeros hasta que introduzca un 0.
//Al introducir un 0 se acabará el programa.
//Por cada numero que introduzca el usuario se llamara a un proceso que creará un archivo de texto en el que se dirá si dicho numero es primo o no.
//Ejemplo:
//Introduce un numero:
// 450
//---------------------------------
//salida: 450.txt
//El numero 450 no es primo
