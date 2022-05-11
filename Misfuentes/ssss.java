import java.util.Scanner;

public class ssss {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Introduzca primer número: ");
        n1 = lector.nextInt();
        System.out.print("Introduzca segundo número: ");
        n2 = lector.nextInt();
        System.out.print("Introduzca tercer número: ");
        n3 = lector.nextInt();
        if (n1 > n2) {
           
        	System.out.print("El mayor es: " + n1);
        }else {
        	System.out.print("El mayor es: " + n2);
       
        }
        if (n1>n3) {
        	System.out.print("El mayor es" + n1);
        
        	
        }
        else {
        	System.out.print("El mayor es: "  + n3);
        }
        if (n2>n1) {
        	System.out.print("El numero mayor es: " +n2);
        }
    }
}
