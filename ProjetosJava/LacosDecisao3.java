package ExerciciosJava;

import java.util.Scanner;

public class LacosDecisao3 {
/*
 Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
 */
	public static void main(String[] args) {
		
		int idade;
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com a idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("Infantil");
		}else if(idade>=15 && idade<=17)
		{
			System.out.println("Juvenil");
		}else if(idade>=18 && idade<=25)
		{
			System.out.println("Adulto");
		}else
		{
			System.out.println("Informação inválida");
		}
		
		
		

	}

}
