package manejoArchivos;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class EscribirFichero {

	public static void main(String[] args){
		int numero=0;
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Introduce el nombre del fichero: ");
			String nombreFichero=sc.nextLine();
			String salida="C:\\Users\\alumno mañana\\workspace\\RecuperacionTardes\\src\\"+
					"procesos\\manejoArchivos\\";
			FileOutputStream fichero = 
					new FileOutputStream(salida + nombreFichero + ".txt", true);
			OutputStreamWriter osw= new OutputStreamWriter(fichero);
			BufferedWriter bw=new BufferedWriter(osw);
			System.out.println("Escribe una linea o 0 para salir.");
			String linea=sc.nextLine();
			while(!linea.equals("0")){
				bw.write(linea);
				bw.newLine();
				System.out.println("Escribe una linea o 0 para salir.");
				linea=sc.nextLine();
			}
			bw.close();			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e){
			System.out.println("Problema al leer fichero.");
		}
		
		
	}

}




