package ExerciciosJava;

import java.util.Scanner;

public class ExercicioMatriz1 {

	/*
	 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
	 */
	public static void main(String[] args) {
		
		
		int[][] numeros = new int[3][3];
		int contagem=0,l,c;
		
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				System.out.println("Entre com o valor: ");
				numeros[l][c] = leia.nextInt();
				if(numeros[l][c] >10) {
					contagem++;
				}
			}
		}
		System.out.println("Existem na matriz números maiores que 10 " +contagem);
	 
	    
	}
	

}
