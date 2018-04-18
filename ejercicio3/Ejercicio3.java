package ejercicio3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un número, 0 para salir:");
		int numero1=sc.nextInt();
		System.out.println("Introduce otro número:");
		int numero2=sc.nextInt();
		sc=new Scanner(System.in);
		System.out.println("Introduce el nombre del archivo de salida:");
		String nombreArchivo=sc.nextLine();
		while(numero1!=0){
			ProcessBuilder pb;
			String ruta="C:\\Users\\alumno mañana\\workspace\\RecuperacionTardes\\bin";
			String salida="C:\\Users\\alumno mañana\\workspace\\RecuperacionTardes\\src\\"+
						"procesos\\ejercicio3\\";
			
			String errores="C:\\Users\\alumno mañana\\workspace\\RecuperacionTardes\\src\\"+
					"procesos\\ejercicio3\\errores.txt";
			
			String ejecutar="procesos.ejercicio3.SumarNumerosIntermedios";
			
			pb= new ProcessBuilder("java", ejecutar, String.valueOf(numero1),
											String.valueOf(numero2));
			pb.directory(new File(ruta));
			pb.redirectOutput(new File(salida + nombreArchivo + ".txt"));
			pb.redirectError(new File(errores));
			try {
				pb.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Introduce un número, 0 para salir:");
			numero1=sc.nextInt();
			System.out.println("Introduce otro número:");
			numero2=sc.nextInt();
			sc=new Scanner(System.in);
			System.out.println("Introduce el nombre del archivo de salida:");
			nombreArchivo=sc.nextLine();
			
		
		}
		

	}

}