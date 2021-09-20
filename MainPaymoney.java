package com.firstproblem;

import java.util.Scanner;

public class MainPaymoney {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Paymoney pm = new Paymoney();
		System.out.println("Enter the total number of transactions happened");
		int size = sc.nextInt();
		int transactions[] = new int[size];
		System.out.println("Enter the value of every Transactions carried out");
		for (int i = 0; i < size; i++) {
			transactions[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter the total number of targets that need to be acheived");
		int num = sc.nextInt();
		System.out.println();
		for (int i = 1; i <= num; i++) {
			System.out.println("Enter the value of target " + i);
			int target = sc.nextInt();
			int no_of_days = pm.num_of_days(transactions, target);
			if (no_of_days == -1) {
				System.out.println("Target is not acheived");
				System.out.println();
			} else {
				System.out.println("target acheived after " + no_of_days + " transactions");
				System.out.println();
			}
		}
		sc.close();
	}

}