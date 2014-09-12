package com.tian.arithmetic.sorting;

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
		Comparable[] a = {5,2,6,3,1,4};
		new Selection().sort(a);
	}
}
