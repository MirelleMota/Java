package ExerciciosJava;

import java.util.Scanner;

public class ExercicioVetor2 {

	public static void main(String[] args) {
		/*
		 2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

		 */
		
		int numeros [] = new int [6];
		int pares=0,impares=0,SomaPares=0,x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++) {
			System.out.println("\nEntre com o valor: ");
			numeros[x] = leia.nextInt();
			
			if(numeros[x] %2 ==0) {
				pares++;
				SomaPares = SomaPares + numeros[x];
			}
				else if(numeros[x] %2 ==1) {
					impares++;
				
				}
			
			
		}
			System.out.println("\nForam digitados "+pares+" números pares");
			System.out.println("\nA soma dos pares foi de: "+SomaPares);
			System.out.println("\nForam digitados "+impares+" números ímpares");
	}	  

}
