package com.tian.arithmetic.sorting.base;

import java.util.Random;

public abstract class SortTemplate {

	/**
	 * 排序的具体实现
	 * @param a
	 */
	public abstract void sort(Comparable[] a);
	
	/**
	 * 交换数组的两个值
	 * @param a
	 * @param i
	 * @param j
	 */
	protected void exch(Comparable[] a,int i,int j){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	/**
	 * 输出数组
	 * @param a
	 */
	public void show (Comparable[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	/**
	 * 比较两上值大小，第一个参数小于第二个参数返回true,第一个参数大于第二个参数返回 false
	 * @param v
	 * @param w
	 * @return
	 */
	protected boolean less(Comparable v , Comparable w){
		return v.compareTo(w) < 0;
	}
	
	/**
	 * 得个n 个 num以内的随机数
	 * @param n 随机数个数
	 * @param num 随机数最大值
	 * @return
	 */
	public Comparable[] getRandomArray(int n,int num) {
		Comparable[] a = new Comparable[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(num) + 1;
		}
		return a;
	}
}
