package ExerciciosJava;

import java.util.Scanner;

public class ExercicioDoWhile1 {

	public static void main(String[] args) {
		/*
		 *Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.
		 */
		Scanner leia = new Scanner(System.in);
		int x, acm=0;
		
		do
		{
			System.out.println("Entre com um n�mero: ");
			x = leia.nextInt();
			acm = acm + x;
		}while(x!=0);
		
		System.out.println("Eu acumulei :"+acm);
	}

}
