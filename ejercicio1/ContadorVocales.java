package ejercicio1;

public class ContadorVocales {
	/**
	 * Crear una aplicación que pida al usuario una frase y cuente cuantas vocales de cada tipo hay.
	 * El resultado se mostrará en 5 archivos de texto, uno por vocal.
	 * La clase principal pide la frase al usuario y llama a 5 procesos que hacen los cálculos.
	 */

	public static void main(String[] args) {
		//Recibo mediante argumentos lo que el usuario ha introducido en el
		//proceso principal y la vocal que habrá que contar
		String frase= args[0];
		char vocal=args[1].charAt(0);
	
		//Creo un contador para ir sumando las vocales que coinciden en la frase
		int contador=0;
		
		//Recorro la frase caracter a caracter
		for(int i=0;i<frase.length();i++){
			//Si el caracter en la posicion i coincide con la vocal sumo 1 al cont
			if(frase.charAt(i)==vocal){
				contador++;
			}
		}
		System.out.println("La frase: '" + frase + "' contiene " + contador 
				+ " " + vocal);
		
		

	}

}
