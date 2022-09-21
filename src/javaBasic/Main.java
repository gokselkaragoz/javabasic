package javaBasic;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Use Of Variables and Data Types

		double number1 = 11.5;
		int number2 = 12;
		String title = "Text here";

		// Conditions and if Statements

		if (number1 > number2) {
			System.out.println("Number 1 is greater than number 2");

		} else {
			System.out.println("Number 1 is less than number 2");

		}

		System.out.println("******************************");

		// Find the largest number

		int number3 = 122;
		int number4 = -200;
		int number5 = 45;

		if (number3 > number4 && number3 > number5) {
			System.out.println("largest number 3");
		}

		else if (number4 > number3 && number3 > number5) {
			System.out.println("largest number 4");
		}

		else if (number5 > number4 && number5 > number3) {
			System.out.println("largest number 5");
		}

		System.out.println("******************************");

		// switch

		String anahtar = "Yok";

		switch (anahtar) {
		case "Var":
			System.out.println("Değer var");
			break;

		case "Yok":
			System.out.println("Değer Yok");
			break;

		case "Bilinmiyor":
			System.out.println("Değer Bilinmiyor");
			break;

		case "VarYok":
			System.out.println("----");
			break;

		}
			
		//while loop
		System.out.println("-Sayaç Kullanımı --");
		
		int sayac=1;
		while(sayac<=10)
		{
			System.out.println(sayac);
			sayac++;
		}
		
		

		// Scanner sc=new Scanner(System.in);

		// System.out.println("Sayı giriniz");
		
		
		
		

	}

}
