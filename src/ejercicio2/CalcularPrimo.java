package ejercicio2;

public class CalcularPrimo {

	public static void main(String[] args) {
		int numero=Integer.valueOf(args[0]);
		
		boolean primo=true; 
		for(int i=2; i<numero; i++){
			if(numero%i==0){
				primo=false;
			}
		}
		if(primo){
			System.out.println("El numero " + numero + " es primo.");
		}else{
			System.out.println("El numero " + numero + " no es primo.");
		}
		

	}

}
