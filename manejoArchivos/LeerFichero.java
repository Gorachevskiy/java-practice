package manejoArchivos;

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
			Scanner sc= new Scanner(System.in);
			System.out.println("Introduce el nombre del fichero: ");
			String nombreFichero=sc.nextLine();
			String ruta="C:\\Users\\alumno mañana\\workspace\\recuperacion\\src\\"+
					"manejoArchivos\\";
			//Cojo ese fichero del sistema y lo perparo para leer
			FileInputStream fichero = 
					new FileInputStream(ruta + nombreFichero + ".txt");
			//Cojo el contenido del fichero anterior y creo un reader
			InputStreamReader isr= new InputStreamReader(fichero);
			//Con el reader anterior creo un buffer en el que tendré el fichero "troceado"
			BufferedReader br=new BufferedReader(isr);
			//Mientras haya contenido en el fichero por leer voy leyendo linea a linea
			while(br.ready()){
				//Salto a la siguiente linea y la imprimo
				String linea=br.readLine();
				System.out.println(linea);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e){
			System.out.println("Problema al leer fichero.");
		}
		
		
	}

}




