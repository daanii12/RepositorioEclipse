
public class ejdebug3 {

	public static void main(String[] args) {
		
		
	int n,n2,suma=0;
		
		
		n=(int)(0+Math.random()*21);
		n2=(int)(0+Math.random()*21);
		
		while(n==n2) {
			System.out.println("Los 2 numeros son iguales, la suma es0");
		}
		
		System.out.println("El n1 es: " + n + " el n2 es: " +n2);
		if(n<n2) {
			for(int i=n;i<n2;i++) {
				if(i%2 !=0) {
					suma=suma+i;
					System.out.print(i+" , ");
				}
			}
		}else {
			for(int i=n2; i<=n; i++) {
				if(i%2 !=0) {
					suma=suma +i;
					System.out.print(i+" , ");
					
				}
			}
		}
		
		System.out.println("la suma es: " +suma);
	}

}
