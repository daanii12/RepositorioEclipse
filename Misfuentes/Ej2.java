import java.util.Scanner;
public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia;
		System.out.println("Introduce");
		
		Scanner lector=new Scanner(System.in);
		dia=lector.nextInt();		
		if(dia==1) {
			System.out.println("Descanso");
		
		}if(dia==6) {
			System.out.println("Dia laboral");
		}
	}

}
