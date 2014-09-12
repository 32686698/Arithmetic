package com.tian.arithmetic.sorting;

import com.tian.arithmetic.sorting.base.SortTemplate;

/**
 * Ï£¶ûÅÅÐò
 * @author HisignT
 *
 */
public class Shell extends SortTemplate{

	public void sort(Comparable[] a) {
		int h = 1;
		int N = a.length;
		while (h < N/3) {
			h = h*2 + 1;
		}
		while (h>=1) {
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && less(a[j],a[j-h]); j -= h) {
					exch(a, j, j-h);
				}
			}
			h = h/2;
		}
		show(a);
	}
	
	public static void main(String[] args) {
		SortTemplate s = new Shell();
		s.sort(s.getRandomArray(10, 20));
	}

}
