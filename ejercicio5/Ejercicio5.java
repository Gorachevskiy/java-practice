package ejercicio5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args){
		try {
			int contador=0;
			Scanner sc= new Scanner(System.in);
			System.out.println("Introduce el archivo en el que guardar el dato: ");
			System.out.println("1- Informática, 2-Administración, 3-RRHH, 0-Salir");
			int departamento=sc.nextInt();
			while(departamento!=0){
				
				String ruta="C:\\Users\\alumno mañana\\workspace\\recuperacion\\src\\"+
						"manejoArchivos\\";
				String nombreFichero=null;
				switch (departamento){
					case 1:
						nombreFichero="intormatica";
						break;
					case 2:
						nombreFichero="administracion";
						break;
					case 3:
						nombreFichero="rrhh";
						break;
				}
				FileOutputStream fichero = 
						new FileOutputStream(ruta + nombreFichero + ".txt", true);
				OutputStreamWriter osw= new OutputStreamWriter(fichero);
				BufferedWriter bw=new BufferedWriter(osw);
				System.out.println("Escribe el dato.");
				String linea=sc.nextLine();
				bw.write(linea);
				bw.newLine();
				bw.close();
				
				System.out.println("Introduce el archivo en el que guardar el dato: ");
				System.out.println("1- Informática, 2-Administración, 3-RRHH, 0-Salir");
				departamento=sc.nextInt();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e){
			System.out.println("Problema al leer fichero.");
		}
		
		
	}
}
