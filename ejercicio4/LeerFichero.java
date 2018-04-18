package ejercicio4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LeerFichero {
/*
 * Programa que pide la ruta de un archivo al usuario y muestra por pantalla su contenido
 */
	public static void main(String[] args){
		try {
			int contador=0;
			Scanner sc= new Scanner(System.in);
			System.out.println("Introduce el nombre del fichero: ");
			String nombreFichero=sc.nextLine();
			while(!nombreFichero.equals("0")){
				
				String ruta="C:\\Users\\alumno mañana\\workspace\\recuperacion\\src\\"+
						"manejoArchivos\\";
				FileInputStream fichero = 
						new FileInputStream(ruta + nombreFichero + ".txt");
				InputStreamReader isr= new InputStreamReader(fichero);
				BufferedReader br=new BufferedReader(isr);
				
				while(br.ready()){
					String linea=br.readLine();
					int numero=Integer.valueOf(linea);
					contador+=numero;
				}
				System.out.println("Introduce el nombre del fichero: ");
				nombreFichero=sc.nextLine();
			}
			System.out.println("La suma de los numeros del archivo es: " + contador);
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e){
			System.out.println("Problema al leer fichero.");
		}
		
		
	}

}




