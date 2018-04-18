package ejercicio3;

public class SumarNumerosIntermedios {

	public static void main(String[] args) {
		int num1=Integer.valueOf(args[0]);
		int num2=Integer.valueOf(args[1]);
		int contador=0;
		for(int i=num1; i<=num2;i++){
			contador=contador+i;
			//contador+=i
		}
		System.out.println("la suma del intervalo es: " + contador);

	}

}
