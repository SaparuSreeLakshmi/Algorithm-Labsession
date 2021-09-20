package com.secondproblem;

public class Denomination {
	void sort(int denomination[], int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			sort(denomination, low, mid);
			sort(denomination, mid + 1, high);
			merge(denomination, low, mid, high);
		}
	}

	private void merge(int[] denomination, int low, int mid, int high) {
		int a = low;
		int b = low;
		int c = mid + 1;
		int auxarray[] = new int[high + 1];
		while (a <= mid && j <= high) {
			if (denomination[a] < denomination[c]) {
				auxarray[b] = denomination[c];
				b++;
				j++;
			} else {
				auxarray[b] = denomination[a];
				b++;
				a++;
			}
		}
		while (a <= mid) {
			auxarray[b] = denomination[a];
			b++;
			a++;
		}
		while (c<= high) {
			auxarray[b] = denomination[c];
			b++;
			c++;

		}
		for (int s= low; s<= high; s++)
			denomination[s] = auxarray[s];
	}

}