package ejercicio2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero = sc.nextInt();
		while(numero!=0){
			String ruta= "ejercicio2.CalcularPrimo";
			
			ProcessBuilder pb =
					new ProcessBuilder("java", ruta,String.valueOf(numero));
			pb.directory(
	            	new File("C:\\Users\\alumno mañana\\workspace\\recuperacion\\bin"));
			pb.redirectOutput(new File("C:\\Users\\alumno mañana\\workspace"
	            		+ "\\recuperacion\\src\\ejercicio2\\" + numero +".txt"));
	        pb.redirectError(new File("C:\\Users\\alumno mañana\\workspace"
	            		+ "\\recuperacion\\src\\ejercicio2\\errores.txt"));
			try {
				pb.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
		}
		

	}

}
