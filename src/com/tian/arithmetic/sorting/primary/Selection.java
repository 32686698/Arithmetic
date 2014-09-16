package com.tian.arithmetic.sorting.primary;

import com.tian.arithmetic.sorting.base.SortTemplate;

/**
 * —°‘Ò≈≈–Ú
 * @author HisignT
 *
 */
public class Selection extends SortTemplate{

	@Override
	public void sort(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i; j < a.length; j++) {
				if(!less(a[min], a[j]))
					min = j;
			}
			exch(a, i, min);
			show(a);
		}
	}

	public static void main(String[] args) {
		SortTemplate s = new Selection();
		s.sort(s.getRandomArray(10, 20));
	}
}
