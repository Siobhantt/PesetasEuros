package pesetaseuros;

import java.util.Scanner;

public class PesetasEuros {

	public static void main(String[] args) {
		/*Realiza un conversor de pesetas a euros.
		Para ello, pídele al usuario que te introduzca el valor en pesetas 
		y, a posteriori, debes mostrarle el resultado de la conversión.*/
		
		//Declaramos las variable 
		double pesetasPedidas;
		double resultadoEuro;
		
		//Invocamos el scanner
		
		Scanner conversor = new Scanner(System.in);
		
		//imprimimos en pantalla la solicitud
		System.out.println("Introduzca la cantidad en pesetas que quiere convertir: ");
		
		//Declaramos que la variable pesetasPedidas sera donde le usuario introducirá la cantidad
		
		pesetasPedidas = conversor.nextDouble();
		
		//Hacemos la operacion de convertir las pesetas en euros dividiendo el valor en pesetas entre 166.386
		
		resultadoEuro = pesetasPedidas / 166.386;
		
		//Imprimimos el resultado
		
		System.out.println("El resultado en Euros es: " + resultadoEuro);
		
		conversor.close();

		// TODO Auto-generated method stub

	}

}
