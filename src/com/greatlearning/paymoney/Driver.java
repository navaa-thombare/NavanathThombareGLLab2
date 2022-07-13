package com.greatlearning.paymoney;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOftargets;
		int[] targets;
		int target;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the size of transactions i.e number of days-");
		numberOftargets = sc.nextInt();
		
		targets = new int[numberOftargets];
		
		for(int i=0;i<numberOftargets;i++) {
			System.out.println("Enter target for day :" + (i+1));
			targets[i] = sc.nextInt();
		}
		
		
		displayTransactions(targets);
		
		System.out.println("\nEnter the target tobe acheived? ");
		target = sc.nextInt();
		PayMoney payMoney = new PayMoney(target);
		payMoney.targetAcheived(targets);
		sc.close();
		
	}
	
	public static void displayTransactions(int[] transactions) {
		System.out.println("All the targets for the days");
		for (int i : transactions) {
			System.out.print(i+" ");
		}
	}

}
