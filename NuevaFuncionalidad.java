package comparacion;

import java.util.Scanner;

public class NuevaFuncionalidad {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce número1");
		double n1= sc.nextDouble();
		
		System.out.println("Introduce número2");
		double n2= sc.nextDouble();
		
		boolean compar = (n1 == n2);   
		
		System.out.println("  son eguales:" +compar);
		
		sc.close();
	}

}
