import java.util.Scanner;
public class ejdebug2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		
		System.out.println("Introduce numero");
	
		Scanner lector=new Scanner(System.in);
		num1=lector.nextInt();	
		
		if(num1 % 2==0) {
			System.out.println("El numero " +num1 + " es par");
			
		}else {
			System.out.println("El numero " +num1+ " es impar");
		}
	}

}
