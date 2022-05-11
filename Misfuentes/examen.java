import java.util.Scanner;
public class examen {

	public static void main(String[] args) {
		Scanner lector= new Scanner(System.in);
		int num;
		
		System.out.println("Introduce numero");
		num=lector.nextInt();
	/*	int i=1;
		while(i<=num) {
			System.out.print(i + " | ");
			
		i++;	
		}*/
		
		
		
		
		
		
		
		int suma=0;
		 for(int i=1; i<num; i++) {
				
				if(num%i==0) {
				System.out.print(i + " | ");
				suma=suma+i;
			}
			
		}
			System.out.print("La suma de los divisores es " +suma);
		
		
			
	}

}
