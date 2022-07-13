package com.greatlearning.travler;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		int noOfDenomination;
		Scanner sc = new Scanner(System.in);
		int amount;
		
		System.out.println("Please enter the number of denominations");
		noOfDenomination = sc.nextInt();
		
		System.out.println("Please enter the denominations");
		int[] denominations = new int[noOfDenomination];
		
		for(int i=0;i<noOfDenomination;i++) {
			denominations[i] = sc.nextInt();
		}
		
		Currency currency = new Currency(denominations,noOfDenomination);
		
		Merge.mergeSort(currency.denominations, currency.size);
		displayDenominations(currency.denominations);
		
		System.out.println("\nplease enter the amount");
		amount = sc.nextInt();
		Notes.numberOfnotes(denominations, amount);
		
	}
	
	public static void displayDenominations(int[] denominations) {
		System.out.println("Denominations are ");
		for (int i : denominations) {
			System.out.print(i + " ");
		}
	}
}
