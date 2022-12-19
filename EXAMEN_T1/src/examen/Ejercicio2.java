package examen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int numero;
		//Numero que nos van a introducir  por teclado
		
		//Contador de cifras pares
		int numPares=0;
		
		//Contador de cifras impares
		int numImpares=0;
		
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero positivo");
		numero=sc.nextInt();
		
		if(numero==0) {
			System.out.println("Tiene una cifra par");
		}else if (numero<0) {
			
			System.out.println("Error: tiene que ser positivo");
		}else  {
			while(numero!=0) {
				if(numero%2==0) {
					numPares++;
				}else {
					numImpares++;
				}
				numero=numero/10;
			}
			
			System.out.println("El número tiene"+numPares+" cifras pares");
			System.out.println("El numero tiene "+numImpares+" cifras impares.");
		}
		sc.close();
	}

}
