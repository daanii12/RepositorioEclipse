import java.util.Scanner;

public class EjericioDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2,suma = 0;
		
		System.out.println("Introduce numero");
	
		Scanner lector=new Scanner(System.in);
		num1=lector.nextInt();	
		
		System.out.println("Introduce numero2");
		num2=lector.nextInt();	
		
		if(num1% 3 ==0){
			System.out.println("El numero " +num1 + " es divisible entre 3");
			
		}else {
			System.out.println("El numero " +num1 + " NO ES divisible entre 3");
		}
		
		
		if(num1<num2) {
			for(int i=num1;i<num2;i++) {
				if(i%2 ==0) {
					suma=suma+i;
					System.out.print(i+" , ");
				}
			}
		}
	}
}