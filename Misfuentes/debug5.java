import java.util.Scanner;
public class debug5 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		int numero, contadorimpares = 0, contadorpares=0, contador3=0, prueba = 0;
		int max = 0, min=0, suma=0, media=0, contadornumeros=0, listado=0;
		
		System.out.print("Introduce un número (0 para SALIR): ");
		numero=teclado.nextInt();
		//System.out.println("el numero introducido es:" +numero);
		do {
			
			if(numero%2!=0) {
				contadorimpares++;
			}
			
			if(numero%2==0) {
				contadorpares++;
			}
			
			if(min ==0) {
				max= numero;
				min=numero;
				
			}
			max=Math.max(numero, max);
			min=Math.min(numero, min);
			
			
			
			if(numero%3==0) {
				contador3++;
			}
			
			suma=suma+numero;
			
			if(numero>=0) {
				contadornumeros++;
			}
			media=suma/contadornumeros;
			
			
			
			System.out.print("Introduce un número (0 para SALIR): ");
			numero=teclado.nextInt();
			
		}while(numero!=0);
	
		
		System.out.println("Existen " +contadorimpares+ " numeros impares");
		System.out.println("Existen " +contadorpares+ " numeros pares");
		System.out.println("El numero mayor es: " + max);
		System.out.println("El numero menor es: " + min);
		System.out.println ("La cantidad de nuemeros divisibles /3 son: " +contador3);
		System.out.println("La suma de todos los numeros es: " +suma);
		System.out.println("La media de estos numeros es: " +media);
	
		
	}

}
