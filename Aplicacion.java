package capicua;

import java.util.Scanner;

public class Aplicacion {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Introduce un némero entre 0 y 9999");

			int num = sc.nextInt();
			if (num >= 0 && num < 10) {
				System.out.println("El numero es capicúa");
			}	
			else 
				if (num >=10 && num <100) {
					if (num % 10 == num/10) {
						System.out.println("El numero es capicúa ");
					}
					else 
						System.out.println("El numero no es capicúa");
				}
				else
					if (num >=100 && num <1000) {

						if (num/100  == num %10) {
							System.out.println("El numero es capicúa");
						}
						else System.out.println("El numero no es capicúa");
					}
					else 
						if (num>=1000 && num<=9999) {
							int a= num/100;
							int b= num%100;
							if ( a %10 == b /10 && a /10 == b %10) {
								System.out.println("El numero es capicúa ");
							}
							else 
								System.out.println("El numero no es capicúa");
						}
			sc.close();
		}
	}


