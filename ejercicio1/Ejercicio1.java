package ejercicio1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Pido al usuario la frase.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la frase que quieres analizar: ");
		String frase= sc.nextLine();
		//Guardo las vocales en un array para ir recorriéndolo después.
		char[] arrayVocales= {'a','e','i','o','u'};
		//Ruta del programa que queremos ejecutar
		String ruta= "ejercicio1.ContadorVocales";
		//Creo un objeto llamado pb de tipo ProcessBuilder
		ProcessBuilder pb;
		 
		for(int i=0; i<arrayVocales.length;i++){
			//Llamo al proceso con la vocal correspondiente.
			//Creo la instancia del objeto pasandole la ruta del programa
            pb = new ProcessBuilder("java", ruta, frase, String.valueOf(arrayVocales[i]));
            //Indico desde que directorio lo quiero ejecutar
            pb.directory(
            	new File("C:\\Users\\alumno mañana\\workspace\\recuperacion\\bin"));
            pb.redirectOutput(new File("C:\\Users\\alumno mañana\\workspace"
            		+ "\\recuperacion\\" + arrayVocales[i]+".txt"));
            pb.redirectError(new File("C:\\Users\\alumno mañana\\workspace"
            		+ "\\recuperacion\\errores.txt"));
            try {
				pb.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
