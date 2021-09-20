package com.firstproblem;

public class Paymoney {
	public int num_of_days(int transactions[], int target) {

		for (int i = 0; i < transactions.length; i++) {
			if (transactions[i] > target || transactions[i] == target)
				return i + 1;
			else
				target = target - transactions[i];
		}
		return -1;

	}

}