package com.tian.arithmetic.sorting.merge;

import com.tian.arithmetic.sorting.base.SortTemplate;

/**
 * 归并排序,自底向上的归并排序
 * 两个两个归并，然后四个四个归并，然后八个八个归并
 * @author HisignT
 *
 */
public class MergeBU extends SortTemplate{

	private Comparable[] aux;
	
	public static void main(String[] args) {
		SortTemplate s = new MergeBU();
		s.sort(s.getRandomArray(10, 20));
	}
	@Override
	public void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		show(a);
		int N = a.length;
		for (int i = 1; i < N; i += i) {
			for (int j = 0; j < N - i ; j += i+i) {
				merge(a, j, j+i-1, Math.min(j+i+i-1, N-1));
			}
		}
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
