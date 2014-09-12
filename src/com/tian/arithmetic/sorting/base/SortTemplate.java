package com.tian.arithmetic.sorting.base;

import java.util.Random;

public abstract class SortTemplate {

	/**
	 * ����ľ���ʵ��
	 * @param a
	 */
	public abstract void sort(Comparable[] a);
	
	/**
	 * �������������ֵ
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
	 * �������
	 * @param a
	 */
	public void show (Comparable[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	/**
	 * �Ƚ�����ֵ��С����һ������С�ڵڶ�����������true,��һ���������ڵڶ����������� false
	 * @param v
	 * @param w
	 * @return
	 */
	protected boolean less(Comparable v , Comparable w){
		return v.compareTo(w) < 0;
	}
	
	/**
	 * �ø�n �� num���ڵ������
	 * @param n ���������
	 * @param num ��������ֵ
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
