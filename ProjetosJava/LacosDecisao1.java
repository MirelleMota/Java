package ExerciciosJava;

import java.util.Scanner;

public class LacosDecisao1 {

	public static void main(String[] args) {
		/*
		 Menor	Meio   Maior
		 A		B		C
		 A		C		B
		 B		A		C
		 B		C		A
		 C		A		B
		 C		B		A
		 */
		int a,b,c,maior,menor;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o A: ");
		a = ler.nextInt();
		System.out.println("\nEntre com o B: ");
		b = ler.nextInt();
		System.out.println("\nEntre com o C: ");
		c = ler.nextInt();
		
		if(a>=b && b>=c) //A maior e C menor
		{
			maior=a;
			menor=c;
			System.out.println("A é o maior valor!");
		}else if(a>=c && c>=b) //A maior e B menor
		{
			maior = a;
			menor = b;
			System.out.println("A é o maior valor!");
		}else if(b>=a && a>=c)//B maior e C menor
		{
			maior = b;
			menor = c;
			System.out.println("B é o maior valor!");
		}else if(b>=c && c>=a) //B maior e A menor
		{
			maior = b;
			menor = a;
			System.out.println("B é o maior valor!");
		}else if(c>=a && a>=b) //C maior e B menor
		{
			maior = c;
			menor = b;
			System.out.println("C é o maior valor!");
		}else //C maior e A menor
		{
			maior = c;
			menor = b;
			System.out.println("C é o maior valor!");
		}

	}

}
