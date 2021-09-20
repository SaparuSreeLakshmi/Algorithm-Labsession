package com.secondproblem;

public class Currency {
	public void numOfDenominations(int[] notes, int amount) {
		int notecounter[] = new int[notes.length];
		for (int i = 0; i < notes.length; i++) {
			if (amount >= notes[i]) {
				notecounter[i] = amount / notes[i];
				amount = amount - notecounter[i] * notes[i];
			}
		}
		if (amount > 0)
			System.out.println("Exact amount cannot be given from dominations person having");
		else {
			System.out.println();
			System.out.println("Your payment approach to give minimum number of notes are -:");
			for (int i = 0; i < notes.length; i++) {
				if (notecounter[i] != 0)
					System.out.println(notecounter[i] + " number of notes required of denomination Rs." + notes[i]);
			}
		}
	}
}