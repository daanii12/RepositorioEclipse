import java.util.Scanner;
public class debug3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num, oportunidad, intentos;
		
		Scanner lector=new Scanner(System.in);
	
		
		num=(int)(1+Math.random()*51);
		
		oportunidad=0;
		//eee
		int i=1;
		do {
		System.out.println("Adivina");
		oportunidad=lector.nextInt();
		
		intentos=5-i;
		System.out.println("Te quedan "+ intentos+ " intentos ");
		
		
		
			if(oportunidad>num) {
				System.out.println("Tu numero es mayor");
			}
				if(oportunidad<num) {
					System.out.println("Tu numero es menor");
				}
		
		i++;
		}while(intentos>0 && oportunidad!=num);
		
		if(oportunidad==num) {
			System.out.println("Acertaste!");
			
		}
		if(intentos==0 && oportunidad!=num) {
			System.out.println("Perdiste, ya no tienes mas intentos");
		}
	}
}
