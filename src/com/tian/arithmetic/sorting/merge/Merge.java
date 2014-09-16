package com.tian.arithmetic.sorting.merge;

import com.tian.arithmetic.sorting.base.SortTemplate;

/**
 * 归并排序,自顶向下的归并排序
 * @author HisignT
 *
 */
public class Merge extends SortTemplate{

	private Comparable[] aux;
	
	public static void main(String[] args) {
		SortTemplate s = new Merge();
		s.sort(s.getRandomArray(10, 20));
	}
	@Override
	public void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		show(a);
		sort(a, 0, a.length-1);
	}
	private void sort(Comparable[] a,int lo,int hi){
		if(hi <= lo)
			return;
		int mid = lo + (hi-lo)/2;
		sort(a, lo, mid);
		sort(a, mid+1, hi);
		merge(a, lo, mid, hi);
	}
	private void merge(Comparable[] a,int lo,int mid ,int hi){
		int i = lo;
		int j = mid + 1;//前面的数组比后面的数组多一个或相等
		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}
		for (int k = lo; k <= hi; k++) {
			if(i>mid)//第一个数组已经添加完了
				a[k] = aux[j++];
			else if(j>hi)//第二个数组已经添加完了
				a[k] = aux[i++];
			else if(less(aux[j],aux[i]))//第二个数组的第一个元素比第一个数组的第一个元素小，将第二个数组的第一个元素添加到数组a中，再将第二个数组的头指针向后移动一位
				a[k] = aux[j++];
			else//第一个数组的第一个元素比第二个数组的第一个元素小，将第一个数组的第一个元素添加到数组a中，再将第一个数组的头指针向后移动一位
				a[k] = aux[i++];
		}
		show(a);
	}

}
